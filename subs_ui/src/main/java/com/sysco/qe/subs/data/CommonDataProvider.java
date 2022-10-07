package com.sysco.qe.subs.data;


public class CommonDataProvider {


    public static final String VALID_OPCOID_4 = "67";
    public static final String PRICE_ZONE = "price_zone";


    //API Keys

    public static final String ERROR_CATEGORY_SETTING= "errorData.error";



   public static final String TYPE = "type";
    public static final String CATEGORY_TYPE_DELETE = "category_type";
    public static final String SITE_ID = "site_id";


    //Category Data
    public static final String CATEGORY_ID_SETTINGS = "43";
    public static final String CATEGORY_TYPE = "1";
    public static final String MAJOR_CATEGORY_TYPE = "2";

    public static final String MARGIN_VALUE = "10";


    //Query parameters -  Item Setting
    public static final String VIEW_ITEM_SETTING_TYPE="SCORING";
    public static final String CATEGORY_SETTING_DELETE_THRESHOLD = "THRESHOLD";
    public static final String CATEGORY_SETTING_DELETE_EXCLUSION = "EXCLUSION";
    public static final String CATEGORY_SETTING_RENEW_MARGIN = "RENEW_MARGIN";
    public static final String CATEGORY_SETTING_DELETE_INVALID = "INVALID_TYPE";


    public static final String INVALID_MARGIN="abced";

    protected CommonDataProvider() {
        //Common data Provider for all APIs
    }

      //AWS S3 Bridge pricing upload
    public static final String VALID_FILENAME_BRIDGE_UPLOAD = "Bridge_exception_upload";
    public static final String CUSTOMER_ID_COLUMN_NAME = "customer ID";
    public static final String SITE_COLUMN_NAME = "site ID";
    public static final String SUPC_COLUMN_NAME = "supc";
    public static final String UOM_COLUMN_NAME = "UOM";
    public static final String PRICE_COLUMN_NAME = "price";
    public static final String START_DATE_COLUMN_NAME = "start date";
    public static final String END_DATE_COLUMN_NAME = "end date";
    public static final String PRICE_ZONE_COLUMN_NAME = "price zone";
   public static final String VIEW_ITEM_SETTING_TYPE_RENEW_MARGIN="RENEW_MARGIN";
    public static final String MODIFICATION_TYPE_MARGIN = "2";

}
