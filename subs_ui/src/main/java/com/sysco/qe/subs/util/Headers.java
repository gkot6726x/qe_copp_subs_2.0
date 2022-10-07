package com.sysco.qe.subs.util;

import com.sysco.qe.subs.common.Constants;
import org.apache.http.HttpHeaders;
import org.apache.http.entity.ContentType;

import java.util.HashMap;
import java.util.Map;

public class Headers {
    Headers() {
        //Headers
    }

    public static Map<String, String> getGenericAPIHeaderForFE(String userRole) {


        Map<String, String> headers = new HashMap<>();


        headers.put(HttpHeaders.CONTENT_TYPE, ContentType.APPLICATION_JSON.toString());
        if (Constants.DEBUG) {

            if (userRole.equals("SC")) {
                headers.put(Constants.COOKIE, Constants.SC_COOKIE);
            }
            if (userRole.equals("DSM")) {
                headers.put(Constants.COOKIE, Constants.DSM_COOKIE);
            }
            if (userRole.equals("DRM")) {
                headers.put("Cookie", Constants.DRM_COOKIE);
            }
            if (userRole.equals("ADMIN")) {
                headers.put(Constants.COOKIE, Constants.ADMIN_COOKIE);
            }


        }

        return headers;

    }

    public static Map<String, String> getGenericAPIHeaderForBE(String accessToken) {


        Map<String, String> headers = new HashMap<>();
        headers.put(HttpHeaders.CONTENT_TYPE, ContentType.APPLICATION_JSON.toString());
        headers.put(Constants.AUTHORIZATION, accessToken);

        return headers;

    }

    public static Map<String, String> getGenericAPIHeaderWithEmptyAccessTokenForBE() {
        Map<String, String> headers = new HashMap<>();
        headers.put(HttpHeaders.CONTENT_TYPE, ContentType.APPLICATION_JSON.toString());
        headers.put(Constants.AUTHORIZATION, "");
        return headers;
    }
    public static HashMap<String, String> getHeadersForSettings(String accessToken) {
        HashMap<String, String> headers = new HashMap();
        headers.put(HttpHeaders.CONTENT_TYPE, ContentType.APPLICATION_JSON.toString());
        headers.put(HttpHeaders.ACCEPT, ContentType.APPLICATION_JSON.toString());
        headers.put(Constants.AUTHORIZATION, accessToken);

        return headers;
    }
}