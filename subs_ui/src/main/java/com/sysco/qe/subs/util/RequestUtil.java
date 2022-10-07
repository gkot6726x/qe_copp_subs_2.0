package com.sysco.qe.subs.util;

import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.cognitoidp.AWSCognitoIdentityProvider;
import com.amazonaws.services.cognitoidp.AWSCognitoIdentityProviderClientBuilder;
import com.amazonaws.services.cognitoidp.model.AdminInitiateAuthRequest;
import com.amazonaws.services.cognitoidp.model.AdminInitiateAuthResult;
import com.amazonaws.services.cognitoidp.model.AuthFlowType;
import com.syscolab.qe.core.api.restassured.RestUtil;
import io.restassured.response.Response;
import org.testng.reporters.jq.Main;

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

    public static String getToken(String userRole)  {

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


}
