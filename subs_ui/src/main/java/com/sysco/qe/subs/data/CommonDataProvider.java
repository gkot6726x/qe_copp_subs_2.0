package com.sysco.qe.subs.data;

import com.sysco.qe.subs.util.DateUtil;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CommonDataProvider {

    //Valid Excluded Customer Id
    public static final String VALID_EXCLUDED_CUSTOMERID_1 = "556936";
    public static final String VALID_EXCLUDED_CUSTOMER_NAME_1 = "Excluded Test user 1";
    public static final String VALID_EXCLUDED_CUSTOMERID_2 = "820238";
    public static final String VALID_EXCLUDED_CUSTOMER_NAME_2 = "Excluded Test user 2";
    //Valid Customer Ids in a Excluded Group
    public static final String VALID_CUSTOMERID_1_IN_EXCLUDED_GROUP = "103839";
    public static final String VALID_CUSTOMER_NAME_1_IN_EXCLUDED_GROUP = "Test user 1 in Excluded Group";
    public static final String VALID_CUSTOMERID_2_IN_EXCLUDED_GROUP = "103884";
    public static final String VALID_CUSTOMER_NAME_2_IN_EXCLUDED_GROUP = "Test user 2 in Excluded Group";
    //Valid Opco IDs
    public static final String VALID_OPCOID_1 = "123";
    public static final String VALID_OPCOID_2 = "1";
    public static final String VALID_OPCOID_3 = "224";
    public static final String VALID_OPCOID_4 = "67";
    public static final String VALID_OPCOID_5 = "56";
    public static final String VALID_OPCOID_6 = "19";
    public static final String VALID_OPCOID_7 = "38";
    public static final String VALID_OPCOID_8 = "16";
    public static final String VALID_OPCOID_9 = "11";
    public static final String VALID_OPCO_12 = "12";
    public static final String VALID_OPCOID_101 = "101";
    public static final String VALID_OPCOID_10 = "2";
    public static final String VALID_OPCOID_11 = "18";
    public static final String VALID_OPCOID_12 = "102";
    public static final String VALID_OPCOID_13 = "103";
    public static final String INVALID_OPCOID = "17827";
    public static final Integer[] DRM_OPCOS = {66,67};
    public static final String DRM_OPCOS_STRING = "66,67";
    public static final String VALID_OPCO_NAME_67 = "Houston";
    public static final String VALID_REGIONID_10 = "10";
    public static final String VALID_OPCO_10 = "10";
    //Valid Requesters
    public static final String VALID_REQUESTER_ADMIN_1 = "gkot6726";
    public static final String VALID_REQUESTER_SC_1 = "pmttest3";
    public static final String VALID_REQUESTER_DSM_1 = "pmttest4";
    public static final String VALID_REQUESTER_DRM_1 = "pmttest6";
    public static final String VALID_REQUESTER_DRM_2 = "ddstest5";
    public static final String VALID_REQUESTER_CFO = "pmttest8";
    public static final String VALID_REQUESTER_VP_SALES = "pmttest8";
    //Valid Notes
    public static final String VALID_NOTE_1 = "Note 1";
    public static final String VALID_NOTE_AUTOMATION = "Automation Tests";
    public static final String VALID_NOTE_2 = "Test Note 2 @123";
    public static final String VALID_NOTE_3 = "BXv 08Ry5de6 qQ1NezaWS0Nws HcDoisqK1htLRFc4YQ17rSNqliV2qG6SdH75KZeEa7M309CDqunJO2miu1VgNvBTAxiUpaR3524Qr86XwcInKDium749pCUjFP1h01Us c3 SLWCpKkoFhEU F QtghrBB BlMHD f8vN7XYK v9yjyyJ IxE1 8HAcFSoYYDvxv0ZXrL75J gbRpGGP6AP4fjRkXiUyqReLpT7HEgWwDj 0poOzD@hGVvvotUbIqbDFWHvAsoBLb8ZGsOY wee07XGH1I nLEb7 QuXZgo71HHAxRDMOqmpfIjN7SPKN92xxEyfxvGDexIaph3hbNvPQTSZQ0fFEgr74MXH1ia30n5Tp83NCw5Pwav7aIei7AIY5xByNRJu1z7FLwUJjpF9EDhvwHJ2Mnybd4w9AUfWoGX6ytw174wpv9ocZ6yYnacet04cIFTAsG7Kql5DQpvBIl141TUZG5AnW5 ukSQJ3zy  agKnjWp28nPVkzjZH0xt5u89ZQivHLYEcOc9T!nnJawMc1iAvIFkwB4WL0e1zX7rPW9HXVw7cE2m0DyaADBiPe5M5oltSdf3pUczzV eGV1vcTm1iGFXpq49a31XuieLQSq GNAKAW6lJ Jbaw7XgHbeJo FjIlpDFYS8HZU9NSsV0Rgqy9vESzZVm3Xtf 6V2mRR4qn0J22KvseAhl BJUbSVJR3 j6pyvAPxq5fCpwgd3JruFw0dhzVFJFSqCP5eKyYIroEOl1CEfyuPNnt1Ql84z8T9uVOcdJI6gOibfZTfZbaHJNq97qOrLtRBxQ06HJOifomAO dR1qYrDpkEJ0YV j3HGekdOnbn KAhdnwqBLYhCoE7VaxQmKlDvhXG1XjY216Rcsw 6Zj8iavtytHxeTaBwZu12yZed2cVj2XjpL9cXvMCtmYrStHRWdmhbQSPk JauMbyRxfyGQAT24AO7rlNihScIyd3yF0y6c13is2X 9";
    public static final String INVALID_NOTE_1 = "Software testing is an investigation conducted to provide stakeholders with information about the quality of the software product or service under test.[1] Software testing can also provide an objective, independent view of the software to allow the business to appreciate and understand the risks of software implementation. Test techniques include the process of executing a program or application with the intent of finding software bugs (errors or other defects), and verifying that the software product is fit for use.Software testing involves the execution of a software component or system component to evaluate one or more properties of interest. In general, these properties indicate the extent to which the component or system under test: As the number of possible tests for even simple software components is practically infinite, all software testing uses some strategy to select tests that are feasible for the available time and resources. As a result, software testing typically (but not exclusively) attempts to execute a program or application with the intent of finding software bugs (errors or other defects). The job of testing is an iterative process as when one bug is fixed, it can illuminate other, deeper bugs, or can even create new ones.Software testing can provide objective, independent information about the quality of software and risk of its failure to users or sponsors Software testing can be conducted as soon as executable software (even if partially complete) exists. The overall approach to software development often determines when and how testing is conducted. For example, in a phased process, most testing occurs after system requirements have been defined and then implemented in testable programs.";
    public static final String VALID_SC_NOTE = "Automation SC";
    public static final String VALID_DSM_NOTE = "Automation DSM";
    public static final String VALID_RSM_NOTE = "Automation RSM";
    public static final String VALID_DRM_NOTE = "Automation DRM";

    //Valid Item Details
    public static final String VALID_ITEM_DETAILS_1_SUPC = "1630458";
    public static final String VALID_ITEM_DETAILS_1_LIST_PRICE = "34.00";
    public static final String VALID_ITEM_DETAILS_1_REQUESTED_PRICE = "2.8";
    public static final String VALID_ITEM_DETAILS_1_LIST_PRICE_1 = "134.00";
    public static final String VALID_ITEM_DETAILS_1_REQUESTED_PRICE_1 = "132.8";
    public static final String VALID_ITEM_DETAILS_2_SUPC = "0000002";
    public static final String VALID_ITEM_DETAILS_2_LIST_PRICE = "45.00";
    public static final String VALID_ITEM_DETAILS_2_REQUESTED_PRICE = "44.99";
    public static final String VALID_ITEM_DETAILS_3_SUPC = "5794482";
    public static final String VALID_ITEM_DETAILS_3_LIST_PRICE = "9999.00";
    public static final String VALID_ITEM_DETAILS_3_REQUESTED_PRICE = "8500.99";
    public static final String VALID_ITEM_DETAILS_4_LIST_PRICE = "10000.00";
    public static final String VALID_ITEM_DETAILS_4_REQUESTED_PRICE = "9999.00";
    public static final String VALID_ITEM_DETAILS_5_LIST_PRICE = "100.00";
    public static final String VALID_ITEM_DETAILS_5_REQUESTED_PRICE = "99.8";
    public static final String VALID_ITEM_DETAILS_5_SUPC_LB = "0000014";
    public static final String VALID_FILENAME_EX_UPLOAD = "exception-upload";
    public static final int UPLOAD_TYPE_2 = 2;
    public static final int UPLOAD_TYPE_3 = 3;
    public static final int UPLOAD_TYPE_4 = 4;
    public static final String VALID_LOW_REQUESTED_PRICE = "1.1";
    public static final String VALID_ITEM_DETAILS_6_SUPC = "0013553";

    //Valid UOM
    public static final String UOM_CS = "CS";
    public static final String UOM_EA = "EA";
    public static final String UOM_LB = "LB";

    //Invalid Customer IDs
    public static final String INVALID_CUSTOMERID_1 = "abcdef";
    public static final String INVALID_CUSTOMERID_2 = "123@ab";
    public static final String EMPTY_CUSTOMERID = "";
    //Invalid Opco IDs
    public static final String NON_EXISTING_OPCOID_1 = "0";
    //Invalid Item IDs
    public static final String NON_EXISTING_ITEMID_1 = "0000001";
    public static final String INVALID_ITEMID_1 = "69197080";
    //Invalid List Price
    public static final String INVALID_LIST_PRICE_1 = "ab.def";
    public static final String INVALID_LIST_PRICE_2 = "56.ac";
    //Invalid Requested Price
    public static final String INVALID_REQUSTED_PRICE_1 = "ab.def";
    public static final String INVALID_REQUSTED_PRICE_2 = "56.ac";
    //Invalid UOM
    public static final String INVALID_UOM = "12";
    //Valid Excluded Item IDs
    public static final String VALID_EXCLUDED_ITEM_1 = "0000004";
    //Valid Item Id in Excluded Category
    public static final String VALID_ITEM_1_IN_EXCLUDED_CATEGORY = "0000005";
    public static final String VALID_ITEM_2_IN_EXCLUDED_CATEGORY = "0000006";
    //Valid Item Id in Excluded Major Category
    public static final String VALID_ITEM_1_IN_EXCLUDED_MAJOR_CATEGORY = "0000007";
    public static final String VALID_ITEM_2_IN_EXCLUDED_MAJOR_CATEGORY = "0000008";
    //Valid Item Id in Excluded Intermediate Category
    public static final String VALID_ITEM_1_IN_EXCLUDED_INTERMEDIATE_CATEGORY = "0000009";
    public static final String VALID_ITEM_2_IN_EXCLUDED_INTERMEDIATE_CATEGORY = "0000011";
    //Valid Item Id in Excluded Minor Category
    public static final String VALID_ITEM_1_IN_EXCLUDED_MINOR_CATEGORY = "0000012";
    public static final String VALID_ITEM_2_IN_EXCLUDED_MINOR_CATEGORY = "0000013";
    public static final Integer PAGE_SIZE_25 = 25;
    public static final Integer PAGE_SIZE_500 = 500;


    //Exception List View Data
    public static final Integer PAGE_SIZE_ALL = 100000000;
    public static final Integer PAGE_NO_0 = 0;
    public static final Integer PAGE_NO_1 = 1;
    public static final String APPROVAL_STATUS_ALL = "ALL";
    public static final String APPROVAL_STATUS_APPROVED = "ACCEPTED";
    public static final String SORT_COLUMN_DISPLAY_NAME = "displayName";
    public static final String APPROVAL_STATUS_PENDING = "PENDING";
    public static final String APPROVAL_STATUS_REJECTED = "REJECTED";
    //Sort columns
    public static final String SORT_COLUMN_APPROVAL_TIMES_STAMP = "approvalTimestamp";
    public static final String SORT_COLUMN_REQUESTER = "requestor";
    public static final String SORT_DIRECTION_ASC = "ASC";
    public static final String SORT_DIRECTION_DESC = "DESC";
    public static final String EMPTY_PAGE_NO = "";


    //Exception List View Data -RMPI 295
    public static final String INVALID_PAGE_NO = "xyz";
    //Query parameter for Exception List View
    public static final String PAGE_NO = "?pageNo=";
    public static final String PAGE_NO_WITHOUT_QUESTION_MARK = "pageNo=";
    public static final String PAGE_SIZE = "&pageSize=";
    public static final String APPROVAL_STATUS = "&approvalStatus=";
    public static final String SORT_COLUMN = "&sortColumn=";
    public static final String SORT_DIRECTION = "&sortDirection=";
    public static final String QUERY = "&query=";
    public static final String MARKET = "&market=";
    public static final String REGION = "&region=";
    public static final String OPCO = "&opco=";
    public static final String SC_ID = "&scId=";
    public static final String DSM_ID = "&dsmId=";

    //Query parameters/Data for user details API
    public static final String USER_ID = "?userSyscoId=";
    public static final String VALID_USER_ID = "autotest1";
    public static final String VALID_SC_USER_ID = "svc_automationma_000";
    public static final String INVALID_USER_ID = "zxer";
    public static final String VALID_USER_PRIVILEDGE_ID = "68";
    public static final String VALID_USER_ROLE = "AUTO";
    public static final String VALID_USER_ROLE2 = "BOT";
    public static final String SC_USER_ROLE = "SC";
    public static final String UPDATED_USER_EMAIL = "autotest2@dsd.com";
    public static final String OPCO_019 = "019";
    public static final String OPCO_048 = "048";
    public static final String OPCO_067 = "067";


    //Invalid token Id
    public static final String INVALID_TOKEN = "ADFEER%^&*()_";
    //Database Keys
    public static final String MAJOR_CATEGORY_ID = "major_category_id";
    public static final String CATEGORY_ID = "category_id";
    public static final String CATEGORY_NAME_DB = "category_name";
    public static final String MAJOR_CATEGORY_NAME = "major_category_name";
    public static final String INTERMEDIATE_CATEGORY_ID = "intermediate_category_id";
    public static final String INTERMEDIATE_CATEGORY_NAME = "intermediate_category_name";
    public static final String MINOR_CATEGORY_ID = "minor_category_id";
    public static final String MINOR_CATEGORY_NAME = "minor_category_name";
    public static final String ITEM_SETTING_ID = "item_settings_id";
    public static final String CURRENT_APPROVE_THRESHOLD = "current_approve_threshold";
    public static final String CURRENT_REJECTED_THRESHOLD = "current_reject_threshold";
    public static final String NOTES = "notes";
    public static final String ITEM_ID = "item_id";
    public static final String OPCO_ID_SETTING="opco_id";
    public static final String REGION_ID_SETTING="region_id";
    public static final String MARKET_ID_SETTING="market_id";
    public static final String GROUP_NAME="group_name";
    public static final String GROUP_NUMBER="group_number";
    public static final String SC_NAME="sc_name";
    public static final String ITEM_CATEGORY_SETTING_ID="item_category_settings_id";
    public static final String ITEM_CATEGORY_TYPE="item_category_type";
    public static final String MARGIN_SETTING="margin";
    public static final String CHANGED_DATE = "changedDate";
    public static final String CREATEDBY = "created_by";
    public static final String MODIFIED_BY = "modified_by";
    public static final String ITEM_NAME = "item_name";
    public static final String PRICE_ZONE = "price_zone";


    //API Keys
    public static final String MARKET_ID = "marketId";
    public static final String MARKET_NAME = "marketName";
    public static final String REGION_ID = "regionId";
    public static final String REGION_NAME = "regionName";
    public static final String OPCO_ID = "opcoId";
    public static final String OPCO_NAME = "opcoName";
    public static final String MESSAGE = "message";
    public static final String NOTE_ERROR = "errorData.noteError";
    public static final String ERROR_CATEGORY_SETTING= "errorData.error";
    public static final String ERROR_AUTOAPPROVE_SETTING= "errorData.autoApproveThreshError";
    public static final String ERROR_AUTOREJECT_SETTING= "errorData.autoRejectThreshError";
    public static final String CATEGORY_ID_ERROR = "errorData.categoryIdError";
    public static final String CATEGORY_TYPE_ERROR = "errorData.categoryTypeError";
    public static final String MODIFICATION_TYPE_ERROR = "errorData.modificationTypeError";
    public static final String PRICE_ZONE_ERROR = "errorData.priceZone";



    //Escalation
    public static final Integer INVALID_LINE_ITEM_ID = 1;
    public static final String CHARACTER_LINE_ITEM_ID = "abc";
    public static final String ALPHANUMERIC_LINE_ITEM_ID = "ABC123";
    public static final Integer[] INVALID_ITEMLINE_IDS = {1, 2, 3, 4};

    //Query parameters
    public static final String PAGE_NO_EXCEPTIONLISTVIEW = "pageNo";
    public static final String PAGE_SIZE_EXCEPTIONLISTVIEW = "pageSize=";
    public static final String APPROVAL_STATUS_EXCEPTIONLISTVIEW = "approvalStatus";
    public static final String SORT_COLUMN_EXCEPTION = "sortColumn=";
    public static final String USERID_EXCEPTION = "userID";
    public static final String TYPE = "type";
    public static final String CATEGORY_TYPE_DELETE = "category_type";
    public static final String SITE_ID = "site_id";

    //Review Detail Page Data
    public static final String CUSTOMER_ID1_REVIEW_DETAIL = "84097"; //Customer is in opco 067
    public static final String GROUP_ID1_REVIEW_DETAIL = "8"; //Group is in opco 067
    public static final String CUSTOMER_ID2_REVIEW_DETAIL_IN_ANOTHER_OPCO = "57919"; //Customer is not in opco 067
    public static final String GROUP_ID2_REVIEW_DETAIL_IN_ANOTHER_OPCO = "200"; //Group is not in opco 067
    public static final String INVALID_EXCEPTION_ID = "abc";
    public static final String NON_EXISTING_EXCEPTION_ID = "000";

    //Category Data
    public static final String CATEGORY_ID_SETTINGS = "43";
    public static final String MAJOR_CATEGORY_ID_SETTINGS = "38";
    public static final String CATEGORY_TYPE = "1";
    public static final String MAJOR_CATEGORY_TYPE = "2";
    public static final String INTERMEDIATE_CATEGORY_TYPE = "3";
    public static final String MINOR_CATEGORY_TYPE = "4";
    public static final String MODIFICATION_TYPE_EXCLUSION = "0";
    public static final String MODIFICATION_TYPE_THRESHOLD = "1";
    public static final String MODIFICATION_TYPE_MARGIN = "2";
    public static final String MODIFICATION_TYPE_RENEWAL_MARGIN = "3";
    public static final String AUTO_APPROVED_THRESHOLD = "12";
    public static final String AUTO_REJECTED_THRESHOLD = "5";
    public static final String CATEGORY_ID_SETTINGS_INVALID = "430000000000";
    public static final String MARGIN_VALUE = "10";
    public static final String MARGIN_VALUE_1 = "15";
    public static final String AUTO_APPROVED_THRESHOLD_EDITED= "20.000";
    public static final String AUTO_REJECTED_THRESHOLD_EDITED = "10.000";
    public static final String CATEGORY_ID_100 = "100";

    //Request parameters - Exception Creation
    public static final String CUSTOMER_ID_EXCEPTIONCREATION = "customerId";
    public static final String OPCO_ID_EXCEPTIONCREATION = "opCo";
    public static final String REQUESTER_ID_EXCEPTIONCREATION = "requesterId";
    public static final String NOTES_EXCEPTIONCREATION = "notes";
    public static final String ITEM_ID_EXCEPTIONCREATION = "itemId";
    public static final String UOM_EXCEPTIONCREATION = "uom";
    public static final String LIST_PRICE_EXCEPTIONCREATION = "listPrice";
    public static final String REQUESTED_PRICE_EXCEPTIONCREATION = "requestedPrice";
    public static final String ITEMS_EXCEPTIONCREATION = "items";
    public static final String PRICE_ZONE_EXCEPTIONCREATION = "priceZone";
    //Request parameters - Add Item Setting
    public static final String OPCOID = "opcoId";
    public static final String MODIFICATIONTYPE = "modificationType";
    public static final String NOTE = "note";
    public static final String AUTOREJECTED_THRESHOLD = "autoRejectThresh";
    public static final String AUTOAPPROVED_THRESHOLD = "autoApproveThresh";
    public static final String PRICE_ZONE_PARAM = "priceZone";
    public static final String ID = "id";
    public static final String NAME = "name";
    public static final String DESCRIPTION = "description";
    public static final String BRAND = "brand";
    public static final String PACK = "pack";
    public static final String SIZE = "size";
    public static final String CATEGORY_NAME = "categoryName";
    public static final String CAT_MAJ_NAME = "catMajName";
    public static final String CAT_INT_NAME = "catIntName";
    public static final String CAT_MIN_NAME = "catMinName";
    public static final String CATCH_WEIGHT_IND = "catchWeightIndicator";
    public static final String SHIP_SPLIT = "shipSplitOnly";
    public static final String PRODUCT_ITEM = "productItem";
    public static final String DISPLAYNAME = "displayName";
    //Request parameters - Add Item setting Margin
    public static final String MARGIN = "margin";
    public static final String RENEW_MARGIN = "renewal_margin";
    public static final int ITEM_SETTING_OPCO = 19;
    public static final int EXCEPTION_LIST_OPCO = 19;
    public static final String ITEM_SETTING_SUPC = "0018127";
    public static final String CREATED_BY = "createdBy";

    //Request parameters - Escalation
    public static final String EXCEPTIONS_ESCALATION = "exceptions";

    //Query parameters -  Item Setting
    public static final String VIEW_ITEM_SETTING_TYPE="SCORING";

    public static final String INVALID_CATEGORY_ID="1111111111";
    public static final String INVALID_CATEGORY_TYPE="12";

    public static final String INVALID_AUTO_APPROVED_THRESHOLD = "1000.34";
    public static final String INVALID_AUTO_REJECTED_THRESHOLD = "500.21";
    public static final List<String> VALID_OPCOID_CATEGORYSETTING= Collections.unmodifiableList(Arrays.asList("67"));
    public static final String LONG_NOTE="BXv 08Ry5de6 qQ1NezaWS0Nws HcDoisqK1htLRFc4YQ17rSNqliV2qG6SdH75KZeEa7M309CDqunJO2miu1VgNvBTAxiUpaR3524Qr86XwcInKDium749pCUjFP1h01Us c3 SLWCpKkoFhEU F QtghrBB BlMHD f8vN7XYK v9yjyyJ IxE1 8HAcFSoYYDvxv0ZXrL75J gbRpGGP6AP4fjRkXiUyqReLpT7HEgWwDj 0poOzD@hGVvvotUbIqbDFWHvAsoBLb8ZGsOY wee07XGH1I nLEb7 QuXZgo71HHAxRDMOqmpfIjN7SPKN92xxEyfxvGDexIaph3hbNvPQTSZQ0fFEgr74MXH1ia30n5Tp83NCw5Pwav7aIei7AIY5xByNRJu1z7FLwUJjpF9EDhvwHJ2Mnybd4w9AUfWoGX6ytw174wpv9ocZ6yYnacet04cIFTAsG7Kql5DQpvBIl141TUZG5AnW5 ukSQJ3zy  agKnjWp28nPVkzjZH0xt5u89ZQivHLYEcOc9T!nnJawMc1iAvIFkwB4WL0e1zX7rPW9HXVw7cE2m0DyaADBiPe5M5oltSdf3pUczzV eGV1vcTm1iGFXpq49a31XuieLQSq GNAKAW6lJ Jbaw7XgHbeJo FjIlpDFYS8HZU9NSsV0Rgqy9vESzZVm3Xtf 6V2mRR4qn0J22KvseAhl BJUbSVJR3 j6pyvAPxq5fCpwgd3JruFw0dhzVFJFSqCP5eKyYIroEOl1CEfyuPNnt1Ql84z8T9uVOcdJI6gOibfZTfZbaHJNq97qOrLtRBxQ06HJOifomAO dR1qYrDpkEJ0YV j3HGekdOnbn KAhdnwqBLYhCoE7VaxQmKlDvhXG1XjY216Rcsw 6Zj8iavtytHxeTaBwZu12yZed2cVj2XjpL9cXvMCtmYrStHRWdmhbQSPk JauMbyRxfyGQAT24AO7rlNihScIyd3yF0y6c13is2X 9BXv 08Ry5de6 qQ1NezaWS0Nws HcDoisqK1htLRFc4YQ17rSNqliV2qG6SdH75KZeEa7M309CDqunJO2miu1VgNvBTAxiUpaR3524Qr86XwcInKDium749pCUjFP1h01Us c3 SLWCpKkoFhEU F QtghrBB BlMHD f8vN7XYK v9yjyyJ IxE1 8HAcFSoYYDvxv0ZXrL75J gbRpGGP6AP4fjRkXiUyqReLpT7HEgWwDj 0poOzD@hGVvvotUbIqbDFWHvAsoBLb8ZGsOY wee07XGH1I nLEb7 QuXZgo71HHAxRDMOqmpfIjN7SPKN92xxEyfxvGDexIaph3hbNvPQTSZQ0fFEgr74MXH1ia30n5Tp83NCw5Pwav7aIei7AIY5xByNRJu1z7FLwUJjpF9EDhvwHJ2Mnybd4w9AUfWoGX6ytw174wpv9ocZ6yYnacet04cIFTAsG7Kql5DQpvBIl141TUZG5AnW5 ukSQJ3zy  agKnjWp28nPVkzjZH0xt5u89ZQivHLYEcOc9T!nnJawMc1iAvIFkwB4WL0e1zX7rPW9HXVw7cE2m0DyaADBiPe5M5oltSdf3pUczzV eGV1vcTm1iGFXpq49a31XuieLQSq GNAKAW6lJ Jbaw7XgHbeJo FjIlpDFYS8HZU9NSsV0Rgqy9vESzZVm3Xtf 6V2mRR4qn0J22KvseAhl BJUbSVJR3 j6pyvAPxq5fCpwgd3JruFw0dhzVFJFSqCP5eKyYIroEOl1CEfyuPNnt1Ql84z8T9uVOcdJI6gOibfZTfZbaHJNq97qOrLtRBxQ06HJOifomAO dR1qYrDpkEJ0YV j3HGekdOnbn KAhdnwqBLYhCoE7VaxQmKlDvhXG1XjY216Rcsw 6Zj8iavtytHxeTaBwZu12yZed2cVj2XjpL9cXvMCtmYrStHRWdmhbQSPk JauMbyRxfyGQAT24AO7rlNihScIyd3yF0y6c13is2X 9";
    public static final String CATEGORY_SETTING_DELETE_THRESHOLD = "THRESHOLD";
    public static final String CATEGORY_SETTING_DELETE_EXCLUSION = "EXCLUSION";
    public static final String CATEGORY_SETTING_RENEW_MARGIN = "RENEW_MARGIN";
    public static final String CATEGORY_SETTING_DELETE_INVALID = "INVALID_TYPE";


    //Query parameters -  Customer Setting
    public static final Integer EXCLUSION_MODIFICATION_TYPE = 0;
    public static final Integer THRESHOLD_MODIFICATION_TYPE = 1;
    public static final Integer INVALID_MODIFICATION_TYPE = 5;
    public static final int SETTINGS_DELETED_STATE = 0;
    public static final int SETTINGS_ACTIVE_STATE = 1;

    //Query parameters -  Group Setting
    public static final Integer INVALID_GROUP_ID = 121212;
    public static final String INVALID_GROUP_ID_2 = "qe12";

    //settings configuration data
    public static final Double VALID_AUTO_APPROVE_THRESHOLD_1 = 99.00d;
    public static final String VALID_AUTO_APPROVE_THRESHOLD_1_STRING = "99.000";
    public static final Double VALID_AUTO_APPROVE_THRESHOLD_2 = 88.00d;
    public static final String VALID_AUTO_APPROVE_THRESHOLD_2_STRING = "88.000";
    public static final Double BOUNDARY_AUTO_APPROVE_THRESHOLD_ = 100.00d;
    public static final Double VALID_AUTO_REJECT_THRESHOLD_1 = 76.66d;
    public static final String VALID_AUTO_REJECT_THRESHOLD_1_STRING = "76.660";
    public static final Double VALID_AUTO_REJECT_THRESHOLD_2 = 44.44d;
    public static final String VALID_AUTO_REJECT_THRESHOLD_2_STRING = "44.440";
    public static final Double VALID_AUTO_APPROVE_THRESHOLD_3 = 2.00d;
    public static final Double VALID_AUTO_REJECT_THRESHOLD_3 = 1.00d;
    public static final Double VALID_AUTO_APPROVE_THRESHOLD_4 = 0.02d;
    public static final Double VALID_AUTO_REJECT_THRESHOLD_4 = 0.01d;
    public static final Double BOUNDARY_AUTO_REJECT_THRESHOLD = 00.00d;
    public static final Double INVALID_THRESHOLD_ABOVE_LIMIT = 110d;
    public static final Double INVALID_THRESHOLD_BELOW_LIMIT = -10d;
    public static String DATE_PATTERN = "MM/dd/yyyy";
    public static final String VALID_NOTE= "Automation Test";

    //settings db field names
    public static final String CURRENT_APPROVE_THRESHOLD_DB_FIELD = "current_approve_threshold";
    public static final String CURRENT_REJECT_THRESHOLD_DB_FIELD = "current_reject_threshold";
    public static final String CREATED_BY_DB_FIELD = "created_by";
    public static final String MODIFIED_BY_DB_FIELD = "modified_by";

    //Request parameters - Decision Update
    public static final String EXCEPTION_REQUEST_ID = "exceptionRequestId";
    public static final String DECISION = "decision";
    public static final String APPROVED_PRICE = "approvedPrice";
    public static final String INVALID_DECISION = "MAR";
    public static final String VALID_APPROVED_PRICE = "5.67";
    public static final String VALID_APPROVED_PRICE2 = "4.67";
    public static final String VALID_DECISION_APPROVED = "MA";
    public static final String VALID_DECISION_REJECTED = "MREJ";
    public static final String APPROVED_PRICE_ZERO = "0.0";
    public static final String APPROVED_PRICE_NEGATIVE = "-9.23";
    public static final double GREATER_PRICE = (Double.parseDouble(VALID_ITEM_DETAILS_1_LIST_PRICE) + 1.1);
    public static final String INVALID_ACCESS_TOKEN = "A2BJ0@eXAiOiJK#V1Qi?LCJra,WQi3OiJlY/2E5YzB0";

    //Opco 19 - Customer & Item
    public static final String VALID_CUSTOMERID_1_019 = "019924";
    public static final String VALID_CUSTOMER_NAME_1_019 = "TEST AUTOMATION USER";
    public static final String VALID_NON_EXCLUDED_ITEM_1_019 = "1234567";
    public static final String VALID_GROUP_ID_019 = "1800";
    public static final String VALID_GROUP_NUMBER_019 = "0000006704";
    public static final String VALID_GROUP_CUSTOMERID_2_019 = "019925";
    public static final String VALID_GROUP_CUSTOMERID_3_019 = "019926";
    public static final String VALID_CUSTOMERID_2_019 = "019924";

    //Query parameters - Review Queue
    public static final String STATUS = "status";
    public static final String GET_AUTO_ESCALATED_EXCEPTIONS = "REJECTED";
    public static final String GET_PENDING_EXCEPTIONS = "PENDING";
    public static final int PARENT_ID_1 = 111;
    public static final int PARENT_ID_2 = 222;
    public static final int PARENT_ID_3 = 333;
    public static final int DAYS_TO_SUBSTRACT = -2;


    public static final String INVALID_MARGIN="abced";
    public static final List<String> VALID_OPCOID_CATEGORY_SETTING_MARGIN= Collections.unmodifiableList(Arrays.asList("67","019"));


    //Review Detail - Group Customers
    public static final String REVIEW_DETAIL_INVALID_GROUP_ID = "0";
    public static final String REVIEW_DETAIL_ALPHANUMERIC_GROUP_ID = "12sd";
    public static final String REVIEW_DETAIL_CHARACTERS_IN_GROUP_ID = "AbC";

    //Invalid Prices

    public static final String PRICE_CHARACTER = "!@$";
    public static final String PRICE_0 = "0.00";
    public static final String PRICE_NEGATIVE = "-12";



    //multi opco category settings
    public static final String CATEGORY_ID_MULTI_OPCO_SETTINGS = "45";
    public static final String[] VALID_OPCO_IDS_CATEGORY_SETTING = {"67","19","11"};
    public static final Double AUTO_APPROVED_THRESHOLD_MULTI_OPCO = 12.0;
    public static final Double AUTO_REJECTED_THRESHOLD_MULTI_OPCO = 5.0;
    public static final String AUTO_APPROVED_THRESHOLD_VALID_1 = "10.5";
    public static final String AUTO_REJECTED_THRESHOLD_VALID_1 = "5.5";

    //exception creation defaults
    public static final String USERNAME = "pmttest10";
    public static final int EXCEPTION_REQUEST_STATUS = 30;
    public static final int EXCEPTION_TYPE = 1;
    public static final double LIST_PRICE = 25.00d;
    public static final double PRICE_REQUESTED = 12.00d;
    public static final int EXCEPTION_REQ_LINE_STATUS = 60;
    public static final String EXCEPTION_NOTE = "Automation Data";
    public static final double ORIGIN_APPROVED_PRICE = 25.00d;
    public static final double EXCEPTION_APPROVED_PRICE = 12.00d;
    //category settings edit
    public static final String MARGIN_VALUE_EDITED = "15.000";
    public static final String CANCEL_STATUS = "50";
    public static final String INVALID_EXCEP_ID_1 = "12jhj1231231231";
    public static final String INVALID_EXCEP_ID_2 = "8888888888888888";
    public static final String INVALID_EXCEP_ID_3 = "0";

    protected CommonDataProvider() {
        //Common data Provider for all APIs
    }

    //Request Parameter - Search Customer
    public static final String VALID_CUSTOMERID_012229_019 = "012229";
    public static final String MARKET_WEST_ID = "901";
    public static final String SOUTH_REGION_ID = "14";
    public static final String VALID_CUSTOMERID_012229_NAME = "CITY";
    public static final String SITE_40_ID= "40";
    public static final String VALID_SC_NAME = "Neal";

    public static final String REJECT_THRESH_MULTIOPCO_1 = "0.01";
    public static final String REJECT_THRESH_MULTIOPCO_2 = "99.98";
    public static final String APPROVE_THRESH_MULTIOPCO_1 = "99.99";
    public static final String EXCLUDED_STATUS = "122";
    public static final String UPLOAD_ERRORS_STATUS = "50";

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
    public static final String CUSTOMER_ID_BRIDGE_UPLOAD_1 = "691149";
    public static final String OPCO_ID_BRIDGE_UPLOAD_1 = "19";
    public static final String SUPC_BRIDGE_UPLOAD_1 = "2190227";
    public static final String UOM_BRIDGE_UPLOAD_1 = "CS";
    public static final String PRICE_BRIDGE_UPLOAD_1 = "12.2";
    public static final String CUSTOMER_ID_BRIDGE_UPLOAD_2 = "669101";
    public static final String SUPC_BRIDGE_UPLOAD_2 = "2190195"; //Use an Item which belongs to same Categories as SUPC_BRIDGE_UPLOAD_1
    public static final String PRICE_BRIDGE_UPLOAD_2 = "15.01";
    public static final String END_DATE = DateUtil.substractDaysFromToDayDate(6);
    public static final String START_DATE = DateUtil.getTodayDate();

    //Upload Creation Job changes
    public static final String VALID_FILENAME_UPLOAD_CREATION = "Upload_Creation_Test";
    public static final String VALID_CATEGORY_ID = "39";
    public static final String VALID_MAJOR_CATEGORY_ID = "156";
    public static final String VALID_MAJOR_CATEGORY_ID_155 = "155";
    public static final String VALID_INTER_CATEGORY_ID = "1048";
    public static final String VALID_INTER_CATEGORY_ID_1037 = "1028";
    public static final String VALID_MINOR_CATEGORY_ID = "5370";
    public static final String VALID_MINOR_CATEGORY_ID_5323 = "5326";

    public static final String VALID_DSM_ID = "rkuh1222";

    //Processing Thresholds
    public static final String REJECT_THRESH_0 = "0";
    public static final String APPROVE_THRESH_1 = "1";
    public static final String REJECT_THRESH_98 = "98";
    public static final String APPROVE_THRESH_100 = "100";

    //Vacation Coverage
    public static final String TENNESSEE_REGION_NAME_IN_CENTRAL_MARKET = "Tennessee Region";
    public static final String REGION_ID_15_TENNESSEE_REGION = "15";
    public static final String INVALID_DRM_ID = "abcd1234";
    public static final String INVALID_REGION_NAME = "Aaaa Region";
    public static final String VALID_REGION_NAME_IN_WEST_MARKET = "Alaska Region";
    public static final String VALID_REGION_NAME_IN_SOUTH_MARKET = "Carolinas Region";
    public static final String REGION_ID_25_IN_CENTRAL_MARKET = "25";
    public static final String MARKET_ID_CENTRAL_MARKET = "902";
    public static final String MICHIGAN_REGION_NAME_IN_CENTRAL_MARKET = "Michigan Region";
    public static final String REGION_ID_23_MICHIGAN_REGION = "23";
    public static final String QUERY_PARAM_DRM_ID = "drmSyscoId";
    public static final String QUERY_PARAM_REGION = "regionName";
    public static final String GREATLAKES_REGION_NAME_IN_CENTRAL_MARKET = "Great Lakes";
    public static final String REGION_ID_10_IN_SOUTH_MARKET = "10";
    public static final String ROLE_DRM = "DRM";
    public static final String USBL_REGION = "region";
    public static final String ROLE_SC = "SC";
    public static final String USBL_OPCO = "opco";
    public static final String USBL_MARKET = "market";
    public static final String ROLE_DSM = "DSM";
    public static final String ROLE_RSM = "RSM";
    public static final String ROLE_ADMIN = "ADMIN";
    public static final String ROLE_VP_OF_SALES = "VP_OF_SALES";
    public static final String ROLE_CFO = "CFO";
    public static final String ROLE_SUPPORT= "SUPPORT";

    public static final int CUSTOMER_COUNT_LARGE_GROUP = 100;
    public static final int CUSTOMER_COUNT_NORMAL_GROUP = 30;
    public static final int CUSTOMER_COUNT_SMALL_GROUP = 10;
    public static final int EXCEPTION_LINE_STATUS_MANUALLY_APPROVED = 50;
    public static final String PRODUCT_NAME="CHEESE PEPPER JACK SLI";
    public static final String PRODUCT_BRAND="TILLAMOOK CHEESE";
    public static final int PRODUCT_PACK=12;
    public static final String PRODUCT_SIZE="2#";
    public static final String PRODUCT_CATEGORY_NAME="DAIRY PRODUCTS";
    public static final String PRODUCT_CATEGORY_MAJOR="CHEESE";
    public static final String PRODUCT_CATEGORY_MINOR="CHEESE MISC";
    public static final String PRODUCT_CATEGORY_INDICATOR="N";

    public static final String  SCORING_EXCLUSION="Scoring Exclusion";
    public static final String  SCORING_THRESHOLD="Scoring Threshold";
    public static final String  DELETION_NO="No";
    public static final String  DELETION_YES="Yes";
    public static final String  BULK_ITEM_SETTING_TRUE="t";
    public static final String  BULK_ITEM_SETTING_APPROVE_THRESHOLD="20.347";
    public static final String  BULK_ITEM_SETTING_REJECTED_THRESHOLD="10.378";
    public static final String  INVALID_SCORING_EXCLUSION="Exclusion";
    public static final String  INVALID_SCORING_THRESHOLD="Scoring";
    public static final String  INVALID_EXCLUSION="Scoring Excluio";
    public static final String  INVALID_THRESHOLD="ScoringThreshold";
    public static final String INVALID_SCORING="!@#$$%^&*(()><";
    public static final String  INVALID_DELETION="N";
    public static final String  INVALID_DELETION_WITH_SPACES="N  o";
    public static final String NON_EXISTING_OPCOID="890";
    public static final String SUPC_WITH_SPACES="21902 7";
    public static final String NON_EXISTING_SUPC="1234567";
    public static final String INVALID_SUPC="12345678";
    public static final String MARGIN_WITH_SPACES="Mar gin";
    public static final String  INVALID_MARGIN_WITH_SPACES="5 3";
    public static final String TYPE_MARGIN = "Margin";
    public static final String  UOM_WITH_SPACES="C S";
    public static final String  TYPE_EXCLUSION="SCORING EXCLUSION";
    public static final String  TYPE_MARGIN_PARAMETER="MARGIN";
    public static final String AUTO_APPROVED_THRESHOLD_FOR_BULK = "12.000";
    public static final String AUTO_REJECTED_THRESHOLD_FOR_BULK = "5.000";
    public static final String MARGIN_VALUE_FOR_BULK = "10.000";
    public static final String SETTING_TYPE_ERROR = "Values provided for type should be Scoring Exclusion, Scoring Threshold or Margin";
    public static final String UOM_ERROR = "UOM provided for item is incorrect";
    public static final String INCORRECT_DATA_ERROR = "Incorrect data provided";
    public static final String EXIST_ERROR = "Item settings already exists";
    public static final String OPCO_ERROR = "Operating Site Id can not be blank";
    public static final String EMPTY_NOTE_ERROR = "Settings DTO validation failure";
    public static final String BULK_UPLOAD_SUCCESS = "Item settings created successfully";
    public static final String UOM_ERROR_INVALID = "Values provided for UOM should be EA, CS or LB";
    public static final String EMPTY_SUPC = "Supc should not be null";
    public static final String SUPC_LENGTH_ERROR = "SUPC length must be between 1 and 7";
    public static final String SUPC_INVALID_ERROR = "SUPC field entered contains invalid characters";
    public static final String SUPC_RETURN_ERROR = "Could not retrieve item data from PDIS";
    public static final String MARGIN_VALUE_WITH_DECIMAL = "10.347";
    public static final String INCORRECT_DELETION_ERROR = "Values provided for Deletion should be Yes or No";
    public static final String DUPLICATE_DATA_ERR_MSG = "Duplicated data";
    public static final String NOTE_EDITED = "Bulk Item Note";
    public static final String MARGIN_INVALID = "0.03";
    public static final String HIGH_MARGIN = "100";
    public static final String THRESHOLD_ERROR = "Reject threshold cannot be greater than or equal to Approve threshold";
    public static final String BULK_UPLOAD_UPDATE_SUCCESS = "Item settings updated successfully";
    public static final String BULK_UPLOAD_MARGIN_ERROR = "Margin cannot be lesser than 0.1 or greater than or equal to 100";
    public static final String EXIST_ERROR_THRESHOLD = "A threshold setting already exists";
    public static final String EXIST_ERROR_EXCLUSION = "An exclusion setting already exists";
    public static final String BULK_UPLOAD_DELETE_SUCCESS = "Item settings deleted successfully";
    public static final String ITEM_SETTING_NOT_FOUND  = "Item settings not found";

    //Renew Margin
    public static final String MODIFICATION_TYPE_RENEW_MARGIN = "3";
    public static final Integer MARGIN_VALUE2 = 20;
    public static final String RENEW_MARGIN_VALUE = "21.670";
    public static final String RENEW_MARGIN_VALUE_EXPECTED = "21.67";
    public static final Integer MARGIN_VALUE2_EXPECTED = 20;
    public static final String VIEW_ITEM_SETTING_TYPE_RENEW_MARGIN="RENEW_MARGIN";
    public static final String INCORRECT_RENEW_MARGIN_VALUE = "-21.67";
    public static final String VALUE_NULL = null;
    public static final String VALUE_EMPTY = "";
    public static final String VALUE_ZZ = "zz";
    public static final String RENEW_MARGIN_EDITED_VALUE = "99.926";
    public static final String MARGIN_EDITED_VALUE_EXPECTED_ZERO = "0.00";
    public static final String RENEW_MARGIN_EDITED_VALUE_EXPECTED = "99.93";
//Renewal Margin

    public static final String ERROR = "error";
    public static final String CREATED_BY_USER_ID = "ddstest6";
    public static final String MODIFIED_BY_USER_ID = "ddstest6";
    public static final int OPCO_19 = 19;
    public static final int OPCO_18 = 18;
    public static final int OPCO_1 = 1;
    public static final int OPCO_2 = 2;
    public static final double CAT_RENEWAL_MARGIN_1 = 22.11;
    public static final double CAT_RENEWAL_MARGIN_2 = 30.01;
    public static final String MARGIN_NAME = "Margin";
    public static final String RENEW_MARGIN_NAME = "Renew Margin";


    //Renewal category Margin
    public static final String CATEGORY_MARGIN_SETTING_ERROR  = "Margin value must exists";
    public static final String CATEGORY_SETTING_EXIST_ERROR = "Settings already exists";
    public static final List<String> VALID_OPCOID_CATEGORY_SETTING= Collections.unmodifiableList(Arrays.asList("019"));



    //RSM user changes

    public static final String VALID_RSM_USER_ID = "pmttest5";
    public static final String REGION_ID_SOUTH_TEXAS = "10";
    public static final Integer NUMBER_OF_EXCEPTIONS_5 = 5;

    //Netcost Override

    public static final Integer VALID_CATEGORY_ID_SETTINGS_1 = 40;
    public static final Integer VALID_MAJOR_CATEGORY_ID_SETTINGS_1 = 34;
    public static final Integer VALID_INTERMEDIATE_CATEGORY_ID_SETTINGS_1 = 35;
    public static final Integer VALID_MINOR_CATEGORY_ID_SETTINGS_1 = 42;
    public static final Integer VALID_CATEGORY_TYPE= 1;
    public static final Integer VALID_CATEGORY_TYPE_2= 2;
    public static final Integer VALID_CATEGORY_TYPE_3= 3;
    public static final Integer VALID_CATEGORY_TYPE_4= 4;
    public static final List<Integer> VALID_OPCO_ID_LIST=Arrays.asList(19, 67, 38);
    public static final Integer MODIFICATION_TYPE= 0;
    public static final Integer MODIFICATION_TYPE_NETCOST_MARGIN= 2;
    public static final Double VALID_DOLLER_PER_CASE_VALUE= 21.22;
    public static final String VALID_DOLLER_PER_CASE_VALUE_2= "51.330";
    public static final Double VALID_DOLLER_PER_POUND_VALUE= 12.34;
    public static final String INVALID_DOLLER_PER_CASE_VALUE_1= "test";
    public static final String INVALID_DOLLER_PER_CASE_VALUE_2= "!@#$$%%^^";
    public static final String VALID_STATUS= "1";
    public static final Double VALID_MARGIN_VALUE= 99.5678;
    public static final Double VALID_MARGIN_VALUE_2= 10.981;
    public static final String VALID_MARGIN_VALUE_3= "10.980";
    public static final Double VALID_NET_COST_OVERRIDE_VALUE= 21.22;
    public static final String VALID_NET_COST_OVERRIDE_VALUE_2 = "90.000";
    public static final Double VALID_DOLLER_PER_CASE_VALUE_WITH_FOUR_DECIMALS = 199.2081;
    public static final Double VALID_DOLLER_PER_POUND_VALUE_WITH_FOUR_DECIMALS = 201.0160;
    public static final String VALID_NETCOST_NOTE = "CS";
    public static final String ALREADY_EXISTING_ERROR_FOR_CATEGORY = "Net Cost Settings already exists for Category with category id %s type %s of opco [19, 67, 38]";
    public static final String SITE = "&site="; //Query parameter for GET netcost category
    public static final String SORTING_COLUMN_OPCO_ID = "opcoId";
    public static final String SORTING_COLUMN_CATEGORY_NAME = "catName";
    public static final String SORTING_COLUMN_MAJOR_CATEGORY_NAME = "majorCatName";
    public static final String SORTING_COLUMN_INTER_CATEGORY_NAME = "interCatName";
    public static final String SORTING_COLUMN_MINOR_CATEGORY_NAME = "minorCatName";
    public static final String SORTING_COLUMN_MARGIN = "margin";
    public static final String SORTING_COLUMN_DOLLAR_PER_CASE = "dollarPerCase";
    public static final String SORTING_DB_COLUMN_DOLLAR_PER_CASE = "dollar_per_case";
    public static final String SORTING_COLUMN_DOLLAR_PER_POUND = "dollarPerPound";
    public static final String SORTING_DB_COLUMN_DOLLAR_PER_POUND = "dollar_per_pound";
    public static final String DB_COLUMN_OPCO = "opco_id";
    public static final String DB_COLUMN_CATEGORY_NETCOST_SETTING_ID = "item_category_netcost_settings_id";
    public static final String VALID_NOTE_EDIT_CATEGORY_NETCOST = "Edit category net cost note1";
    public static final Integer PAGE_SIZE_5 = 5;
    public static final Integer PAGE_NO_2 = 2;
    public static final Integer PAGE_SIZE_10 = 10;
    public static final Integer PAGE_SIZE_1000 = 1000;
    public static final List<Integer> VALID_OPCO_IDS_01_AND_10=Arrays.asList(01,10);
    public static final String  NET_COST_SETTING_NOT_FOUND = "Net cost setting for id <ID> not found";
    public static final String  NET_COST_SETTING_ALREADY_EXIST_ITEM = "Net cost Item settings already exists for item <supc>";
    public static final String NET_COST_ITEM_SETTING_NOT_FOUND = "Item Net cost setting for id {0} not found";

    public static final String  NET_COST_SETTING_NOT_FOUND_ITEM = "Item Net cost setting for id <ID> not found";


    public static final String CATEGORY_ID_PARAM = "categoryId="; //Query parameter for SEARCH category netcost
    public static final String CATEGORY_TYPE_PARAM = "&categoryType="; //Query parameter for SEARCH category netcost
    public static final Integer NON_EXISTING_CATEGORY_ID = 1001;
    public static final Integer NON_EXISTING_CATEGORY_TYPE = 0;
    public static final String CATEGORY_TYPE_ERROR_SEARCH = "errorData.categoryType";
    public static final String DOLLAR_PER_CASE_REQUEST_PARAM = "dollarPerCase";
    public static final String DOLLAR_PER_POUND_REQUEST_PARAM = "dollarPerPound";
    public static final String MODIFICATION_TYPE_REQUEST_PARAM = "modificationType";
    public static final String MARGIN_REQUEST_PARAM = "margin";
    public static final String NOTE_REQUEST_PARAM = "note";
    public static final String INVALID_SETTING_ID = "ab34";
    public static final String NON_EXISTING_NUMERIC_SETTING_ID = "1110022";

    //CS Item data for Netcost Override

    public static final String ITEM_SUPC_CS = "0018127";
    public static final String ITEM_NAME_CS = "CHEESE PEPPER JACK SLI";
    public static final String ITEM_DESCRIPTION_CS = "Cheese Pepper Jack Sliced";
    public static final String ITEM_BRAND_CS = "TILLAMOOK CHEESE";
    public static final Integer ITEM_PACK_CS = 12;
    public static final String ITEM_SIZE_CS = "2#";
    public static final String ITEM_CATEGORY_NAME_CS = "DAIRY PRODUCTS";
    public static final String ITEM_MAJOR_CATEGORY_NAME_CS = "CHEESE";
    public static final String ITEM_INT_CATEGORY_NAME_CS = "CHEESE MISC";
    public static final String ITEM_MINOR_CATEGORY_NAME_CS = "CHEESE MISC";
    public static final String ITEM_CATCH_WEIGHT_INDICATOR_CS = "N";
    public static final String ITEM_SHIP_SPLIT_ONLY_CS = "N";


    //EA Item data for Netcost Override

    public static final String ITEM_SUPC_EA = "2481356";
    public static final String ITEM_NAME_EA = "STIRRER WOOD COFF WRPD 5.5";
    public static final String ITEM_DESCRIPTION_EA = "2481356-STIRRER WOOD COFF WRPD 5.5";
    public static final String ITEM_BRAND_EA = "ROFSON INDUSTRIES";
    public static final Integer ITEM_PACK_EA = 12;
    public static final String ITEM_SIZE_EA = "2#";
    public static final String ITEM_CATEGORY_NAME_EA = "PAPER & DISP";
    public static final String ITEM_MAJOR_CATEGORY_NAME_EA = "PICKS-STIRRERS";
    public static final String ITEM_INT_CATEGORY_NAME_EA = "WOOD";
    public static final String ITEM_MINOR_CATEGORY_NAME_EA = "STIRRERS";
    public static final String ITEM_CATCH_WEIGHT_INDICATOR_EA = "N";
    public static final String ITEM_SHIP_SPLIT_ONLY_EA = "Y";



    //LB Item data for Netcost Override

    public static final String ITEM_SUPC_LB = "2330474";
    public static final String ITEM_NAME_LB = "CHEESE PROVOLONE NON SMK";
    public static final String ITEM_DESCRIPTION_LB = "2330474-CHEESE PROVOLONE NON SMK";
    public static final String ITEM_BRAND_LB = "ARREZZIO IMPERIAL";
    public static final Integer ITEM_PACK_LB = 12;
    public static final String ITEM_SIZE_LB = "2#";
    public static final String ITEM_CATEGORY_NAME_LB = "DAIRY PRODUCTS";
    public static final String ITEM_MAJOR_CATEGORY_NAME_LB = "CHEESE";
    public static final String ITEM_INT_CATEGORY_NAME_LB = "NATURAL BULK";
    public static final String ITEM_MINOR_CATEGORY_NAME_LB = "MOZZ/PROVOLONE";
    public static final String ITEM_CATCH_WEIGHT_INDICATOR_LB = "Y";
    public static final String ITEM_SHIP_SPLIT_ONLY_LB = "N";


    //CS Item data for Netcost Override

    public static final String NEW_ITEM_SUPC_CS = "5624192";
    public static final String NEW_ITEM_NAME_CS = "BISCUIT BTRMLK GOLDN E-Z SPLIT";
    public static final String NEW_ITEM_DESCRIPTION_CS = "5624192-BISCUIT BTRMLK GOLDN E-Z SPLIT";
    public static final String NEW_ITEM_BRAND_CS = "PILLSBURY BAKERIES";
    public static final Integer NEW_ITEM_PACK_CS = 12;
    public static final String NEW_ITEM_SIZE_CS = "2#";
    public static final String NEW_ITEM_CATEGORY_NAME_CS = "FROZEN";
    public static final String NEW_ITEM_MAJOR_CATEGORY_NAME_CS = "BAKERY PRODUCT";
    public static final String NEW_ITEM_INT_CATEGORY_NAME_CS = "BISCUITS";
    public static final String NEW_ITEM_MINOR_CATEGORY_NAME_CS = "FULLY BAKED";
    public static final String NEW_ITEM_CATCH_WEIGHT_INDICATOR_CS = "N";
    public static final String NEW_ITEM_SHIP_SPLIT_ONLY_CS = "N";


    //EA Item data for Netcost Override

    public static final String NEW_ITEM_SUPC_EA = "9806423";
    public static final String NEW_ITEM_NAME_EA = "SPICE PEPPER RED CRUSHED";
    public static final String NEW_ITEM_DESCRIPTION_EA = "9806423-SPICE PEPPER RED CRUSHED";
    public static final String NEW_ITEM_BRAND_EA = "IMPERIAL/MCCORMICK";
    public static final Integer NEW_ITEM_PACK_EA = 12;
    public static final String NEW_ITEM_SIZE_EA = "2#";
    public static final String NEW_ITEM_CATEGORY_NAME_EA = "CANNED AND DRY";
    public static final String NEW_ITEM_MAJOR_CATEGORY_NAME_EA = "SALT/SEASN/SPCE";
    public static final String NEW_ITEM_INT_CATEGORY_NAME_EA = "SPICES";
    public static final String NEW_ITEM_MINOR_CATEGORY_NAME_EA = "MISC.";
    public static final String NEW_ITEM_CATCH_WEIGHT_INDICATOR_EA = "N";
    public static final String NEW_ITEM_SHIP_SPLIT_ONLY_EA = "Y";



    //LB Item data for Netcost Override

    public static final String NEW_ITEM_SUPC_LB = "9909678";
    public static final String NEW_ITEM_NAME_LB = "CBEEF KNUCKLE FAJ STRIPS";
    public static final String NEW_ITEM_DESCRIPTION_LB = "9909678-BEEF KNUCKLE FAJ STRIPS";
    public static final String NEW_ITEM_BRAND_LB = "CAB BUCKHEAD NEWPORT";
    public static final Integer NEW_ITEM_PACK_LB = 12;
    public static final String NEW_ITEM_SIZE_LB = "2#";
    public static final String NEW_ITEM_CATEGORY_NAME_LB = "MEATS";
    public static final String NEW_ITEM_MAJOR_CATEGORY_NAME_LB = "BEEF FRESH";
    public static final String NEW_ITEM_INT_CATEGORY_NAME_LB = "FAJITA";
    public static final String NEW_ITEM_MINOR_CATEGORY_NAME_LB = "RAW";
    public static final String NEW_ITEM_CATCH_WEIGHT_INDICATOR_LB = "Y";
    public static final String NEW_ITEM_SHIP_SPLIT_ONLY_LB = "N";


    //Item netcost override modification type
    public static final Integer DOLLAR_PER_CASE_MODIFICATION_TYPE  = 0;
    public static final Integer DOLLAR_PER_POUND_MODIFICATION_TYPE  = 1;
    public static final Integer MARGIN_MODIFICATION_TYPE  = 2;
    public static final Integer NETCOST_OVERRIDE_MODIFICATION_TYPE  = 3;
    public static final String OVERRIDE_TYPE_DOLLAR_PER_CASE = "DOLLAR PER CASE";
    public static final String OVERRIDE_TYPE_DOLLAR_PER_POUND = "DOLLAR PER POUND";
    public static final String OVERRIDE_TYPE_MARGIN = "MARGIN";
    public static final String OVERRIDE_TYPE_NETCOST_OVERRIDE = "OVERRIDE NETCOST";
    public static final String SORTING_COLUMN_VALUE = "value";
    public static final String SORTING_COLUMN_SUPC = "supc";
    public static final String SORTING_COLUMN_ITEM_NAME = "itemName";
    public static final String SORTING_COLUMN_BRAND = "brand";
    public static final String SORTING_COLUMN_CATCH_WEIGHT = "catchWeight";
    public static final String SORTING_DB_COLUMN_CATCH_WEIGHT = "catch_weight_indicator";
    public static final String SORTING_COLUMN_SHIP_SPLIT_ONLY = "shipSplitOnly";
    public static final String SORTING_DB_COLUMN_SHIP_SPLIT_ONLY = "ship_split_only";
    public static final String SORTING_COLUMN_OVERRIDE_TYPE = "overrideType";

    //Item Setting
    public static final String SITE_ID_PARAM = "siteId="; //Query parameter for SEARCH item settings
    public static final String SUPC_PARAM = "&supc="; //Query parameter for SEARCH item settings
    public static final String DESCRIPTION_PARAM = "&description="; //Query parameter for SEARCH item settings
    public static final String BRAND_PARAM = "&brand="; //Query parameter for SEARCH item settings
    public static final String SETTING_TYPE_PARAM = "&settingsType="; //Query parameter for SEARCH item settings
    public static final String SETTING_TYPE_NETCOST = "NETCOST"; //Query parameter for SEARCH item settings

    //Item 1 with brand = 'ORE IDA'
    public static final String ITEM_SUPC_CS_2 = "0013534";
    public static final String ITEM_NAME_CS_2 = "POTATO TATER SPUD BITE";
    public static final String ITEM_DESCRIPTION_CS_2 = "Potato Tater Spud Bite";
    public static final String ITEM_BRAND_CS_2 = "ORE IDA";
    public static final Integer ITEM_PACK_CS_2 = 6;
    public static final String ITEM_SIZE_CS_2 = "5LB";
    public static final String ITEM_CATEGORY_NAME_CS_2 = "FROZEN";
    public static final String ITEM_MAJOR_CATEGORY_NAME_CS_2 = "POTATOES FROZEN";
    public static final String ITEM_INT_CATEGORY_NAME_CS_2 = "PREFORMED";
    public static final String ITEM_MINOR_CATEGORY_NAME_CS_2 = "CIR,RNDABOUT,BU";
    public static final String ITEM_CATCH_WEIGHT_INDICATOR_CS_2 = "N";
    public static final String ITEM_SHIP_SPLIT_ONLY_CS_2 = "N";
    //Item 2 with brand = 'ORE IDA'
    public static final String ITEM_SUPC_CS_3 = "0013553";
    public static final String ITEM_NAME_CS_3 = "POTATO TATER TOT VERSITOT";
    public static final String ITEM_BRAND_CS_3 = "ORE IDA";
    public static final String ITEM_CATEGORY_NAME_CS_3 = "FROZEN";
    public static final String ITEM_MAJOR_CATEGORY_NAME_CS_3 = "POTATOES FROZEN";
    public static final String ITEM_INT_CATEGORY_NAME_CS_3 = "PREFORMED";
    public static final String ITEM_MINOR_CATEGORY_NAME_CS_3 = "BARL,PUFF,TOT,G";
    public static final String ITEM_CATCH_WEIGHT_INDICATOR_CS_3 = "N";
    public static final String ITEM_SHIP_SPLIT_ONLY_CS_3 = "N";
    //Item 3 with brand = 'ORE IDA'
    public static final String ITEM_SUPC_CS_4 = "0013567";
    public static final String ITEM_NAME_CS_4 = "POTATO H/BRN IQF LOOSE SHRED";
    public static final String ITEM_DESCRIPTION_CS_4 = "Potato Hash Brown Iqf Loose Shredded";
    public static final String ITEM_BRAND_CS_4 = "ORE IDA";
    public static final String ITEM_CATEGORY_NAME_CS_4 = "FROZEN";
    public static final String ITEM_MAJOR_CATEGORY_NAME_CS_4 = "POTATOES FROZEN";
    public static final String ITEM_INT_CATEGORY_NAME_CS_4 = "HASH BROWNS";
    public static final String ITEM_MINOR_CATEGORY_NAME_CS_4 = "SHREDDED LOOSE";
    //Item 4 with brand = 'ORE IDA'
    public static final String ITEM_SUPC_CS_5 = "0017354";
    public static final String ITEM_NAME_CS_5 = "POTATO HASH BRN GLDN PTY";
    public static final String ITEM_DESCRIPTION_CS_5 = "Potato Hash Brown Golden Patty";
    public static final String ITEM_BRAND_CS_5 = "ORE IDA";
    public static final Integer ITEM_PACK_CS_5 = 120;
    public static final String ITEM_SIZE_CS_5 = "2.25OZ";
    public static final String ITEM_CATEGORY_NAME_CS_5 = "FROZEN";
    public static final String ITEM_MAJOR_CATEGORY_NAME_CS_5 = "POTATOES FROZEN";
    public static final String ITEM_INT_CATEGORY_NAME_CS_5 = "PREFORMED";
    public static final String ITEM_MINOR_CATEGORY_NAME_CS_5 = "PREFRD/OVN RDY";

    public static final String INVALID_NETCOST_SETTING_ID = "abc";
    public static final long INVALID_NETCOST_SETTING_ID_NUMBER = 110001101010111L;

    //Exception Creation throttling
    public static final String  CREATION_LIMIT_EXCEEDED_ERROR_MESSAGE = "Exception request limit for this Customer or Group/Item combination has been reached";
    public static final String  CREATION_LIMIT_EXCEEDED_ERROR = "Creation Limit Exceeded for Customer <customer> and Item <item>";

    //Price Zone Exclusion
    public static final String CATEGORY_ID_EXCLUSION = "42";
    public static final String CATEGORY_ID2_EXCLUSION = "40"; //This Category Id, Major Category Id, Intermediate category Id & Minor category Id combination should be there for a supc
    public static final String MAJOR_CATEGORY_ID_EXCLUSION = "85";
    public static final String INTERMEDIATE_CATEGORY_ID_EXCLUSION = "501";
    public static final String MINOR_CATEGORY_ID_EXCLUSION = "3414";
    public static final String INVALID_PRICE_ZONE_1 = "ott";
    public static final List<String> VALID_OPCOS_18_AND_19_CATEGORY_EXCLUSION = Collections.unmodifiableList(Arrays.asList("18","19"));
    public static final List<String> VALID_OPCOS_11_AND_16_CATEGORY_EXCLUSION = Collections.unmodifiableList(Arrays.asList("011","016"));
    public static final List<String> VALID_OPCOS_56_11_AND_16_CATEGORY_EXCLUSION = Collections.unmodifiableList(Arrays.asList("056","011","016"));
    public static final String INACTIVE_OPCO = "20";

    //Modified By system
    public static final String MODIFIED_BY_SYSTEM = "System generated";

    //bulk item net cost upload
    public static final String TYPE_DOLLAR_PER_CASE= "dpc";
    public static final String TYPE_DOLLAR_PER_POUND= "dpp";
    public static final String TYPE_OVERRIDE= "override";
    public static final String VALID_FILENAME_BULK_ITEM_NET_COST_UPLOAD = "bulk-item-net-cost-upload";
    public static final String VALID_SUPC_WITH_MULTIPLE_UOM = "5935648";
    public static final String VALID_MARGIN_VALUE_4 = "90.540";

}
