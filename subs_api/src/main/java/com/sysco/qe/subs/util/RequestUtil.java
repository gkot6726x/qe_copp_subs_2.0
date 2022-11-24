package com.sysco.qe.subs.util;

import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.cognitoidp.AWSCognitoIdentityProvider;
import com.amazonaws.services.cognitoidp.AWSCognitoIdentityProviderClientBuilder;
import com.amazonaws.services.cognitoidp.model.AdminInitiateAuthRequest;
import com.amazonaws.services.cognitoidp.model.AdminInitiateAuthResult;
import com.amazonaws.services.cognitoidp.model.AuthFlowType;
import com.amazonaws.services.secretsmanager.AWSSecretsManager;
import com.amazonaws.services.secretsmanager.AWSSecretsManagerClientBuilder;
import com.amazonaws.services.secretsmanager.model.GetSecretValueRequest;
import com.amazonaws.services.secretsmanager.model.GetSecretValueResult;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.syscolab.qe.core.api.restassured.RestUtil;
import com.syscolab.qe.core.common.LoggerUtil;
import io.restassured.response.Response;
import org.apache.oltu.oauth2.client.OAuthClient;
import org.apache.oltu.oauth2.client.URLConnectionClient;
import org.apache.oltu.oauth2.client.request.OAuthClientRequest;
import org.apache.oltu.oauth2.client.response.OAuthJSONAccessTokenResponse;
import org.apache.oltu.oauth2.common.OAuth;
import org.apache.oltu.oauth2.common.exception.OAuthProblemException;
import org.apache.oltu.oauth2.common.exception.OAuthSystemException;
import org.apache.oltu.oauth2.common.message.types.GrantType;
import org.testng.reporters.jq.Main;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class RequestUtil {
    protected static PropertyFileReader propertyFileReader = new PropertyFileReader();
    private static Logger logger = Logger.getLogger(Main.class.getSimpleName());

    RequestUtil() {

    }

    public static void setRequestBaseUrls(String apiHost, String basePath) {
        RestUtil.BASE_PATH = basePath;
        RestUtil.API_HOST = apiHost;
    }


    public static Response send(Map<String, String> headers, String bodyString, String uri, String requestMethod, Map<String, String> queryParameters) {
        return RestUtil.send(headers, bodyString, uri, requestMethod, queryParameters);

    }

    public static String getToken(String userRole) {

        String username = propertyFileReader.getProperty("config", userRole + "_email");
        String passwordEncrypted = propertyFileReader.getProperty("config", userRole + "_password");

        AWSCognitoIdentityProvider cognitoClient = AWSCognitoIdentityProviderClientBuilder.standard()
                .withCredentials(DefaultAWSCredentialsProviderChain.getInstance())
                .withRegion(Regions.US_EAST_1)
                .build();
        final Map<String, String> authParams = new HashMap<>();
        authParams.put("USERNAME", username);
        try {
            authParams.put("PASSWORD", EncryptData.decrypt(passwordEncrypted));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        final AdminInitiateAuthRequest authRequest = new AdminInitiateAuthRequest();
        authRequest.withAuthFlow(AuthFlowType.ADMIN_NO_SRP_AUTH)
                .withClientId("3o8ilta2lco11m9qipos808f5t")
                .withUserPoolId("us-east-1_wmIwNzZhh")
                .withAuthParameters(authParams);
        AdminInitiateAuthResult result = cognitoClient.adminInitiateAuth(authRequest);
        logger.info("Token  " + result.getAuthenticationResult().getIdToken());
        return result.getAuthenticationResult().getIdToken();


    }

    public static String getApigeeToken() throws OAuthProblemException, OAuthSystemException, IOException {

        String[]clientDetailsToGenerateToken = getClientDetailsFromAWSSecretManager();
        OAuthClient client = new OAuthClient(new URLConnectionClient());
        OAuthClientRequest request =
                OAuthClientRequest.tokenLocation(clientDetailsToGenerateToken[2])
                        .setGrantType(GrantType.CLIENT_CREDENTIALS)
                        .setClientId(clientDetailsToGenerateToken[0])
                        .setClientSecret(clientDetailsToGenerateToken[1])
                        .setScope("")
                        .buildBodyMessage();


        String token = client.accessToken(request,
                OAuth.HttpMethod.POST,
                OAuthJSONAccessTokenResponse.class).getAccessToken();

        String bearerToken = "Bearer " + token;
        LoggerUtil.logINFO("Bearer Token " + bearerToken);
        return bearerToken;

    }

    public static String[] getClientDetailsFromAWSSecretManager() throws IOException {

        String secretName = "Subs1.0APICredentials";
        LoggerUtil.logINFO("Requesting secret...");

        AWSSecretsManager client = AWSSecretsManagerClientBuilder.standard()
                .withCredentials(DefaultAWSCredentialsProviderChain.getInstance())
                .withRegion(Regions.US_EAST_1)
                .build();

        GetSecretValueRequest getSecretValueRequest = new GetSecretValueRequest().withSecretId(secretName);

        GetSecretValueResult getSecretValueResult = client.getSecretValue(getSecretValueRequest);

        LoggerUtil.logINFO("secret retrieved ");

        final String secretBinaryString = getSecretValueResult.getSecretString();
        final ObjectMapper objectMapper = new ObjectMapper();

        final HashMap<String, String> secretMap = objectMapper.readValue(secretBinaryString, HashMap.class);

        String clientID = secretMap.get("Client ID");
        String clientSecret = secretMap.get("Client Secret");
        String tokenURL = secretMap.get("Token URL");
        LoggerUtil.logINFO("Client ID = " + clientID);
        LoggerUtil.logINFO("Client Secret = " + clientSecret);
        LoggerUtil.logINFO("Token URL = " + tokenURL);
        return new String[]{clientID, clientSecret, tokenURL};


    }




}
