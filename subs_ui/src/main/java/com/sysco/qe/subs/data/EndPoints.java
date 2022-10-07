package com.sysco.qe.subs.data;


public class EndPoints {
    public static final String EXTERNAL_EXCEPTION_CREATION_URL = "https://dds-external-qa.prcp-rm-np.us-east-1.aws.sysco.net/dds/exception/v1/exceptions/";
    public static final String EXTERNAL_EXCEPTION_CREATION_URI = "exception/v1/exceptions";
    public static final String EXCEPTION_LIST_URI = "exception/v1/exceptions";
    public static final String EXCEPTION_LIST_VIEW = "exceptions";
    public static final String USER_DETAILS_URL = "userdetails";
    public static final String USERS_URL = "users";
    public static final String MARKETS = "/settings/v1/markets";
    public static final String REGIONS = "regions";
    public static final String CMIMDATA = "cmim-data";
    public static final String SITES = "sites";
    public static final String ESCALATION_URL = "exception/v1/exceptions:escalate";

    public static final String REVIEW_DETAIL_CUSTOMER = "customers/";
    public static final String REVIEW_DETAIL_GROUP = "groups/";
    public static final String REVIEW_DETAIL_SC = "/sc";
    public static final String REVIEW_DETAIL_PENDING_EXCEPTIONS_CUSTOMER = "exception/v1/customers/<customer_id>/exceptions";
    public static final String REVIEW_DETAIL_PENDING_EXCEPTIONS_GROUP = "exception/v1/groups/<group_id>/exceptions";
    public static final String REVIEW_DETAIL_PENDING_EXCEPTIONS_CUSTOMER_ITEM_DETAIL = "exception/v1/customers/<customer_id>/line-items/<line_item_id>";
    public static final String CUSTOMER_TRENDS_URI = "exception/v1/customers/";
    public static final String GROUP_TRENDS_URI = "exception/v1/groups/";
    public static final String CUSTOMER_TRENDS_WITHCUSTOMERID = "exception/v1/customers/customer_id/metrics";
    public static final String GROUP_TRENDS_WITHGROUPID = "exception/v1/groups/group_id/metrics";
    //item search
    public static final String ITEM_SEARCH = "settings/v1/items?siteId=opco_id";
    public static final String ITEM_SEARCH_QUERY = "settings/v1/items?siteId=opco_id&query='param'";
    //Exception Review
    public static final String EXCEPTION_REVIEW_URL = "exception/v1/customers/exceptions";
    //Category Setting
    public static final String CATEGORY_SETTING_URL = "category-settings/";
    //Add item setting
    public static final String ADD_ITEM_SETTING_URL = "settings/v1/item-settings";
    //Add item setting margin
    public static final String ADD_ITEM_SETTING_MARGIN_URL = "settings/v1/item-settings?type=MARGIN";
    // Category margin setting
    public static final String CAT_MARGIN_SETTING_URL = "settings/v1/category-settings?type=MARGIN";
    public static final String DELETE_CAT_MARGIN_SETTING_URL = "settings/v1/category-settings/%s?type=MARGIN&category_type=%s&site_id=%s&price_zone=%s";
    public static final String OPCO_MARGIN_SETTING_URL = "settings/v1/opco-settings?type=MARGIN";
    public static final String CREATE_OPCO_MARGIN_SETTING_URL = "settings/v1/opco-settings/%s?type=MARGIN";
    public static final String CREATE_OPCO_SCORE_SETTING_URL = "settings/v1/opco-settings/%s?type=SCORING";
    public static final String ITEM_MARGIN_SETTINGS_URL = "settings/v1/item-settings?type=MARGIN";
    public static final String CUSTOMER_SETTING_URL = "settings/v1/customer-settings";
    public static final String UPLOAD_EXCEPTION_HISTORY_URL = "exception-settings/v1/upload-history";
    public static final String UPLOAD_EXCEPTION_URL = "exception-settings/v1/upload";
    public static final String EDIT_ITEM_MARGIN_SETTING_URL = "settings/v1/item-settings/%s?type=MARGIN";
    public static final String UPLOAD_EXCEPTION_ERROR_URL = "exception-settings/v1/upload-exceptions/%s/errors";

    //Renewal Margin settings
    public static final String OPCO_RENEWAL_MARGIN_SETTING_URL = "settings/v1/opco-settings?type=RENEW_MARGIN";
    public static final String CREATE_OPCO_RENEW_MARGIN_SETTING_URL = "settings/v1/opco-settings/%s?type=RENEW_MARGIN";

    //View Category Setting
    public static final String CATEGORY_SETTING = "settings/v1/category-settings/";
    // Get Item History
    public static final String ITEM_SETTING_HISTORY_URL = "settings/v1/item-settings/item_id/history?price_zone=%s";
    public static final String CATEGORY_SETTING_HISTORY_URL = "settings/v1/category-settings/category_id/history";

    //ADD Category Setting
    public static final String CATEGORY_SETTING_ADD_URL = "settings/v1/category-settings";
    public static final String CATEGORY_SETTING_DELETE_URL = "settings/v1/category-settings/category_id";
    public static final String CATEGORY_SETTING_EDIT_URL = "settings/v1/category-settings/category_id";
    //View Customer Setting
    public static final String CUSTOMER_SETTING = "settings/v1/customer-settings/";
    public static final String DELETE_CUSTOMER_SETTING_URL = "settings/v1/customer-settings/%s?type=%s&priceZone=%s";
    public static final String EDIT_CUSTOMER_SETTING_URL = "settings/v1/customer-settings/%s";
    public static final String CUSTOMER_SETTING_HISTORY_URL = "settings/v1/customer-settings/%s/history?price_zone=%s";

    //opco settings
    public static final String OPCO_SETTING_HISTORY_URL = "settings/v1/opco-settings/%s/history?price_zone=%s";
    public static final String OPCO_SETTING_VIEW_URL = "settings/v1/opco-settings?type=%s";
    public static final String OPCO_SETTING_DELETE_URL = "settings/v1/opco-settings/%s?type=%s&price_zone=%s";

    //Group Settings
    public static final String GROUP_SETTING_URL = "settings/v1/group-settings";
    public static final String DELETE_GROUP_SETTING_URL = "settings/v1/group-settings/%s?type=%s&priceZone=%s";
    public static final String EDIT_GROUP_SETTING_URL = "settings/v1/group-settings/%s";
    public static final String GROUP_SETTING_HISTORY_URL = "settings/v1/group-settings/%s/history?price_zone=%s";
    public static final String ADD_EXCEPTION_NOTE_URL = "exception/v1/exceptions/%s/line-items/%s/notes";
    public static final String GROUP_SEARCH_QUERY = "settings/v1/groups?query='param'";
    public static final String GROUP_SEARCH_WITH_ALL_PARAMS = "settings/v1/groups?siteId='site'&regionId='region'&marketId='market'&groupNumber='groupNum'&groupName='groupName'&leadSCName='leadName'";

    //Item Settings
    public static final String ITEM_SETTING_EDIT_URL = "settings/v1/item-settings/item_id";

    public static final String ITEM_SETTING_DELETE_URL = "settings/v1/item-settings/%s?type=%s&price_zone=%s";

    public static final String EDIT_THRESHOLD_SETTING_URL = "settings/v1/item-settings/%s?type=SCORING";

    public static final String ITEM_SETTING_SEARCH_URL = "settings/v1/items";

    public static final String ITEM_EXCEPTION_HISTORY_CUSTOMER = "exception/v1/customers/%s/items/%s/history";
    public static final String ITEM_EXCEPTION_HISTORY_GROUP = "exception/v1/groups/%s/items/%s/history";
    public static final String ITEM_DETAIL_CUSTOMER = "exception/v1/customers/%s/line-items/%s";
    public static final String ITEM_DETAIL_GROUP = "exception/v1/groups/%s/line-items/%s";

    //Decision Update
    public static final String DECISION_UPDATE = "exception/v1/decisions:decide";

    //Review Detail - Group Customers
    public static final String REVIEW_DETAIL_GROUP_CUSTOMERS = "exception/v1/groups/%s/customers";
    public static final String END_EXCEPTION_NORMAL = "exception-settings/v1/end?type=NORMAL";
    public static final String END_EXCEPTION_IMMEDIATELY = "exception-settings/v1/end?type=IMMEDIATE";

    public static final String REVIEW_DETAIL_CUSTOMER_ITEM_TRENDS = "exception/v1/customers/%s/items/%s/metrics";
    public static final String REVIEW_DETAIL_GROUP_ITEM_TRENDS = "exception/v1/groups/%s/items/%s/metrics";
    public static final String REVIEW_DETAIL_NOTES_HISTORY = "exception/v1/exceptions/%s/notes";
    //Search Customer
    public static final String CUSTOMER_SEARCH_URL = "settings/v1/customers?customerSyscoId=%s&marketId=%s&customerName=%s&siteId=%s";
    public static final String CUSTOMER_SEARCH_URL_TO_SEARCH_BY_NAME = "settings/v1/customers?customerName=%s";
    public static final String CUSTOMER_SEARCH_URL_TO_SEARCH_BY_SYSCO_ID = "settings/v1/customers?customerSyscoId=%s";
    public static final String CUSTOMER_SEARCH_URL_TO_SEARCH_BY_SC = "settings/v1/customers?scName=%s";
    public static final String CUSTOMER_SEARCH_URL_TO_SEARCH_BY_MARKET_ID = "settings/v1/customers?marketId=%s";
    public static final String CUSTOMER_SEARCH_URL_TO_SEARCH_BY_REGION_ID = "settings/v1/customers?regionId=%s";
    public static final String CUSTOMER_SEARCH_URL_TO_SEARCH_BY_SITE_ID = "settings/v1/customers?siteId=%s";
    public static final String PRODUCT_PRICE_URL = "https://pricing-api-stg.prcp-np.us-east-1.aws.sysco.net/v1/pricing/product-prices";

    public static final String EXCEPTIONS_FILTER_DATA = "exception/v1/exceptions/filter-data";

    //Vacation Coverage
    public static final String VACATION_COVERAGE = "user/v1/vacation-coverage";

    //Add Bulk item setting
    public static final String ADD_BULK_ITEM_SETTING_URL = "settings/v1/item-settings/bulk";

    //Renewal margin
    public static final String GET_ITEM_SETTING_RENEW_MARGIN_URL = "settings/v1/item-settings";
    public static final String ADD_ITEM_SETTING_RENEW_MARGIN_URL = "settings/v1/item-settings?type=RENEW_MARGIN";
    public static final String EDIT_ITEM_RENEW_MARGIN_SETTING_URL = "settings/v1/item-settings/%s?type=RENEW_MARGIN";

    //ADD Net cost Setting
    public static final String CATEGORY_NET_COST_SETTING_ADD_URL = "settings/v1/category-netcost-settings";
    public static final String CATEGORY_NET_COST_SETTING_SEARCH_URL = "settings/v1/category-netcost-settings/search";
    public static final String CATEGORY_NET_COST_SETTING_EDIT_URL = "settings/v1/category-netcost-settings/settingId";
    public static final String ITEM_NET_COST_SETTING_ADD_URL = "settings/v1/item-netcost-settings";
    public static final String ITEM_NET_COST_SETTING_EDIT_URL = "settings/v1/item-netcost-settings/%s";

    //Delete Net cost Setting

    public static final String CATEGORY_NET_COST_SETTING_DELETE_URL = "settings/v1/category-netcost-settings/<SETTING_ID>";
    public static final String ITEM_NET_COST_SETTING_DELETE_URL = "settings/v1/item-netcost-settings/<SETTING_ID>";

    //Add Bulk item net cost setting
    public static final String ADD_BULK_ITEM_NET_COST_SETTING_URL = "settings/v1/item-netcost-settings/bulk";

    private EndPoints() {
    }


}
