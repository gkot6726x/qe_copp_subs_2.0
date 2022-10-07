package com.sysco.qe.subs.tests;

import com.sysco.qe.subs.common.Constants;
import com.sysco.qe.subs.common.StatusCodes;
import com.sysco.qe.subs.data.CommonDataProvider;
import com.sysco.qe.subs.data.SQLQueries;
import com.sysco.qe.subs.data.category_setting.CategorySettingDAOFunctions;
import com.sysco.qe.subs.data.category_setting.CategorySettingDataProvider;
import com.sysco.qe.subs.util.*;
import io.restassured.response.Response;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.sql.SQLException;
import java.util.List;

public class CategoryMarginSettingAddTest extends TestBase {
    private String accessToken;
    private String supportUser = Constants.USER_ROLE_SUPPORT;
    CategorySettingDataProvider categorySettingDataProvider = new CategorySettingDataProvider();
    CategorySettingUtil categorySettingUtil = new CategorySettingUtil();


    @BeforeClass(alwaysRun = true)
    public void init(ITestContext iTestContext) {
        iTestContext.setAttribute("feature", "Category_Settings - Category_Setting_Margin_Add");
        RequestUtil.setRequestBaseUrls(URL.AWS_BASE_URL, URL.BASE_PATH);
    }


    @Test(alwaysRun = true, description = "RMPI-2350", priority = 2)
    public void testVerifyCategorySettingAddMargintoMajorCategoryAPIWithValidData() throws SQLException {
        accessToken = RequestUtil.getToken(supportUser);
        CategorySettingDAOFunctions.deleteCategoryIDFromItemSetting(SQLQueries.DELETE_CATEGORY_SETTING.replace("<category_id>", CommonDataProvider.CATEGORY_ID_SETTINGS).replace("<opco_id>", CommonDataProvider.VALID_OPCOID_4));
        String requestBody = categorySettingDataProvider.createCategoryMarginSetting(CommonDataProvider.VALID_OPCOID_4, CommonDataProvider.CATEGORY_ID_SETTINGS, CommonDataProvider.MAJOR_CATEGORY_TYPE);

        Response response = categorySettingUtil.createCategorySettingMargin(accessToken, requestBody);
        softAssert.assertEquals(response.statusCode(), StatusCodes.SUCCESS_201_CODE, "Invalid Response Code returned when calling CategorySetting API");
        List<String> categorySettingMarginData = CategorySettingDAOFunctions.getCategorySettingMarginData(SQLQueries.SELECT_CATEGORY_DETAILS_OF_CATEGORY_SETTING.replace("<modification_type>", "2").replace("<item_category_id>", CommonDataProvider.CATEGORY_ID_SETTINGS).replace("<opco_id>", CommonDataProvider.VALID_OPCOID_4));
        softAssert.assertEquals(categorySettingMarginData.get(0), null, "Approve Threshold is incorrect");
        softAssert.assertEquals(categorySettingMarginData.get(1), null, "Rejected Threshold is incorrect");
        softAssert.assertEquals(categorySettingMarginData.get(2), null, "Note is incorrect");
        softAssert.assertEquals(Float.valueOf(categorySettingMarginData.get(3)), Float.valueOf(CommonDataProvider.MARGIN_VALUE), "Margin is incorrect");
        softAssert.assertEquals(categorySettingMarginData.get(4), CommonDataProvider.MAJOR_CATEGORY_TYPE, "Item Category type is incorrect");

        softAssert.assertAll();
    }


    @Test(alwaysRun = true, description = "RMPI-2355", priority = 6)
    public void testVerifyCategorySettingAddMarginWithIncorrectMargin() throws SQLException {
        accessToken = RequestUtil.getToken(supportUser);
        CategorySettingDAOFunctions.deleteCategoryIDFromItemSetting(SQLQueries.DELETE_CATEGORY_SETTING.replace("<category_id>", CommonDataProvider.CATEGORY_ID_SETTINGS).replace("<opco_id>", CommonDataProvider.VALID_OPCOID_4));
        String requestBody = categorySettingDataProvider.createCategoryMarginSettingForIncorrectMargin(CommonDataProvider.VALID_OPCOID_4, CommonDataProvider.CATEGORY_ID_SETTINGS, CommonDataProvider.CATEGORY_TYPE, "");
        Response response = categorySettingUtil.createCategorySettingMargin(accessToken, requestBody);
        softAssert.assertEquals(response.statusCode(), StatusCodes.BAD_REQUEST_400_CODE, "Invalid Response Code returned when calling CategorySetting API");
        softAssert.assertTrue(ResponseUtil.getValueInResponse(response, CommonDataProvider.ERROR_CATEGORY_SETTING).contains("Margin value must exists"));

        requestBody = categorySettingDataProvider.createCategoryMarginSettingForIncorrectMargin(CommonDataProvider.VALID_OPCOID_4, CommonDataProvider.CATEGORY_ID_SETTINGS, CommonDataProvider.CATEGORY_TYPE, null);
        response = categorySettingUtil.createCategorySettingMargin(accessToken, requestBody);
        softAssert.assertEquals(response.statusCode(), StatusCodes.BAD_REQUEST_400_CODE, "Invalid Response Code returned when calling CategorySetting API");
        softAssert.assertTrue(ResponseUtil.getValueInResponse(response, CommonDataProvider.ERROR_CATEGORY_SETTING).contains("Margin value must exists"));

        requestBody = categorySettingDataProvider.createCategoryMarginSettingForIncorrectMargin(CommonDataProvider.VALID_OPCOID_4, CommonDataProvider.CATEGORY_ID_SETTINGS, CommonDataProvider.CATEGORY_TYPE, CommonDataProvider.INVALID_MARGIN);
        response = categorySettingUtil.createCategorySettingMargin(accessToken, requestBody);
        softAssert.assertEquals(Integer.valueOf(response.statusCode()), Integer.valueOf(StatusCodes.BAD_REQUEST_406_CODE), "Invalid Response Code returned when calling CategorySetting API");

        softAssert.assertAll();
    }


}
