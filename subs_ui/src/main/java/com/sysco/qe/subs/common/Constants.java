package com.sysco.qe.subs.common;

import com.sysco.qe.subs.util.DateUtil;

public class Constants {

    public static final boolean DEBUG = true;
    public static final String TEST_ENV = System.getProperty("tests.env", "QA");
    public static final String TEST_RELEASE = getBuildName();
    // public static final String TEST_RELEASE = System.getProperty("test.release", "DDS_API_Feature_Release");
    public static final String TEST_PROJECT = System.getProperty("tests.project", "DDS API");
    public static final boolean UPDATE_DASHBOARD = Boolean.parseBoolean(System.getProperty("update.dashboard", "true"));

    //Cookies
    public static final String ADMIN_COOKIE = "utag_main=v_id:017351e46cd0001c3e748fa251fd03073002a06b0086e$_sn:2$_se:3$_ss:0$_st:1595922333387$dc_visit:1$ses_id:1595920134492%3Bexp-session$_pn:3%3Bexp-session; mp_755b4c6db22d62730470201e13ac4f1c_mixpanel=%7B%22distinct_id%22%3A%20%2217351e46c2d3c-00458efc7b8af6-4353760-100200-17351e46c2e2fd%22%2C%22%24initial_referrer%22%3A%20%22%24direct%22%2C%22%24initial_referring_domain%22%3A%20%22%24direct%22%2C%22app_id%22%3A%20%22cxs-shop%22%7D; AWSELBAuthSessionCookie-0=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; AWSELBAuthSessionCookie-1=8MM0et3mH6mQaFuGaGwqk/MpLufBqp07u/B0ceBEeBojFPs7ZCl8SdlppwDHD6vmHDrAp0+wqkpcyfuLlmUatVIMsFF6go/0tAm0c6BAcB+MvtHAqufBTAQDSNF4BVf0FWq/M1Z7zR3kiOCWJiaO/1DROdw/PzdlFL8quX+eLx6MpKEbaG/xT40zr7MAQQeSFq/q0KGvFtPsUGC5THulWNlMalcREvAt1UWtTCpS+zpUCN24BvNXSnvnq4gfuSlu0ABPtHf4gfTMjaZTQ95nAd7UwnrH/sHxpCFKkXycd0TorylGfFHXtiJXh1nLqPruI5NYaq0FDe0pPUTjIHjcQvtPC8WfFmyjSsIPIEvVrEk7eUkOM6uXSoVSikbHdGvCfDquDF/a8fooAMV8mCu2aLLRwADoj89EaBtB6MSt561sLlxkekmEaJ3COBBrlV/4OGKtXXHZjoTGYww9Wx+OSol7tibIjrMk53EJLFCBb6Wg0BOjSTpBCp9Nj/ZASpV24dC+jomVS8KckcGlNA+UTta9LbyAgPK7d9Ti3w0tXCVPaqqbaTR3lOw5uqqGScPjJP1XGbOna6R1F8Mc4UzXi+9W618RzNxEj7ELyChEaNaAm+rLh0Wyg3LnwoS+nxX3Z4tu/+KhyhPWBW7rh/VOdyATmld9KM7Y+6Ss2IEZ8zwHYyyhIYGH+6W6LFKZ7F7exg2vTA==";
    public static final String SC_COOKIE = "";
    public static final String DSM_COOKIE = "";
    public static final String DRM_COOKIE = "";
    //Header Parameter
    public static final String COOKIE = "";
    public static final String AUTHORIZATION = "dds-oidc-data";

    public static final String TEST_USER = "test.user";
    public static final String USER_ROLE_SUPPORT_1 = "support";

    public static final String USER_ROLE_SUPPORT = System.getProperty(TEST_USER, USER_ROLE_SUPPORT_1);

    public static final String CUSTOMER_ID = "110490";

    public static final String GROUP_ID = "1";
    public static final String CUSTOMER_ID_IN_19_OPCO = "162560";
    public static final String GROUP_CUSTOMER_ID_IN_19_OPCO = "162561";

    //site
    public static final String DEFAULT_SITE_NAME = "Default";
    public static final String DEFAULT_SITDE_ID = "0";

    public static final String MARGIN = "MARGIN";
    public static final String RENEW_MARGIN = "RENEW_MARGIN";

    public static final String TEST_RESOURCE_PATH = System.getProperty("user.dir") + "/../dds_api/src/main/resources" +
            "/testData/";
    public static final String TEST_DIRECTORY_NAME_BRIDGE_UPLOAD = "bridgepricingupload";
    private static final String PATH_DELIMITER="/";
    public static final String DIR_PATH =
            Constants.TEST_RESOURCE_PATH + Constants.TEST_DIRECTORY_NAME_BRIDGE_UPLOAD +PATH_DELIMITER;



    //Price Zone Exclusion
    public static final String PRICE_ZONE_0 = "0";
    public static final String PRICE_ZONE_3 = "3";


    Constants() {

    }

    public static String getBuildName() {
        return System.getProperty("tests.release", "DDS API") + "_" + DateUtil.getQcenterBuildDate();
    }

}
