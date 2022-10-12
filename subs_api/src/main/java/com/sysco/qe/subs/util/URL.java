package com.sysco.qe.subs.util;

import com.sysco.qe.subs.common.Constants;
import com.sysco.qe.subs.environment.SubsEnv;
import com.syscolab.qe.core.common.LoggerUtil;

public class URL {

    public static final String URL_EXCEPTION = "An exception in getting the URL";
    public static final String AWS_BASE_URL = SubsEnv.valueOf(Constants.TEST_ENV).getUrl();
    public static final String AWS_BASE_PATH = "/tst";
    public static final String BASE_URL = SubsEnv.valueOf(Constants.TEST_ENV).getUrl();
    public static final String BASE_PATH = "/dds";
    public static final String MICRO_SERVICE_PATH = "/exception/v1/";
    public static final String USER_DETAILS_PATH = "user/v1/";
    public static final String SETTING_DETAILS_PATH = "/settings/v1/";

    URL() {
    }

    public static String getUrlForGivenEndPoint(String endPoint) {

        try {

            String url = AWS_BASE_URL + BASE_PATH + endPoint;
            LoggerUtil.logINFO(url);
            return url;
        } catch (Exception e) {
            LoggerUtil.logINFO(e.toString());
            return URL_EXCEPTION;
        }
    }

    public static String getUrlForExceptionListViewEndPint(String endPoint, String pathVariablesToAppendToURL) {

        try {

            String url = AWS_BASE_URL + BASE_PATH + MICRO_SERVICE_PATH + endPoint + pathVariablesToAppendToURL;
            LoggerUtil.logINFO(url);
            return url;
        } catch (Exception e) {
            LoggerUtil.logINFO(e.toString());
            return URL_EXCEPTION;
        }
    }

    public static String getUrlForUserDetailsEndPoint(String endPoint, String pathVariablesToAppendToURL) {

        try {

            String url = AWS_BASE_URL + BASE_PATH + USER_DETAILS_PATH + endPoint + pathVariablesToAppendToURL;
            LoggerUtil.logINFO(url);
            return url;
        } catch (Exception e) {
            LoggerUtil.logINFO(e.toString());
            return URL_EXCEPTION;
        }
    }

    public static String getUrlForMarketEndPoint(String endPoint, String pathVariablesToAppendToURL) {

        try {

            String url = AWS_BASE_URL + BASE_PATH + SETTING_DETAILS_PATH + endPoint + pathVariablesToAppendToURL;
            LoggerUtil.logINFO(url);
            return url;
        } catch (Exception e) {
            LoggerUtil.logINFO(e.toString());
            return URL_EXCEPTION;
        }
    }

    public static String getUrlForExceptionListViewEndPoint(String endPoint) {

        try {

            String url = AWS_BASE_URL + BASE_PATH + MICRO_SERVICE_PATH + endPoint;
            LoggerUtil.logINFO(url);
            return url;
        } catch (Exception e) {
            LoggerUtil.logINFO(e.toString());
            return URL_EXCEPTION;
        }
    }


    public static String getUrlForReviewDetailPage(String endPoint, String pathVariablesToAppendToURL) {

        try {
            String url = AWS_BASE_URL + BASE_PATH + MICRO_SERVICE_PATH + endPoint + pathVariablesToAppendToURL;
            LoggerUtil.logINFO(url);
            return url;
        } catch (Exception e) {
            LoggerUtil.logINFO(e.toString());
            return URL_EXCEPTION;
        }
    }
    public static String getUrlForSettingEndPoint(String endPoint,String categoryID) {

        try {

            String url = AWS_BASE_URL + BASE_PATH + SETTING_DETAILS_PATH + endPoint +categoryID;
            LoggerUtil.logINFO(url);
            return url;
        } catch (Exception e) {
            LoggerUtil.logINFO(e.toString());
            return URL_EXCEPTION;
        }
    }

    public static String getUrlForNetcostSettingEndPoint(String endPoint,String pathVariablesToAppendToURL) {
        try {
            String url = AWS_BASE_URL + BASE_PATH + "/"+ endPoint +pathVariablesToAppendToURL;
            LoggerUtil.logINFO(url);
            return url;
        } catch (Exception e) {
            LoggerUtil.logINFO(e.toString());
            return URL_EXCEPTION;
        }
    }

}
