package com.sysco.qe.subs.util;

import com.sysco.qe.subs.common.Constants;
import com.sysco.qe.subs.data.CommonDataProvider;
import com.sysco.qe.subs.data.EndPoints;
import com.sysco.qe.subs.data.category_setting.CategorySettingDataProvider;
import com.syscolab.qe.core.api.jackson.JacksonUtil;
import com.syscolab.qe.core.api.restassured.RestUtil;
import com.syscolab.qe.core.api.util.RequestMethods;
import io.restassured.response.Response;

import java.io.IOException;

public class CategorySettingUtil {
    CategorySettingDataProvider categorySettingDataProvider = new CategorySettingDataProvider();
    private static final String CATEGORY_ID_PARAM = "category_id";

    public Response createCategorySetting(String accessToken, String requestBody) {
        return RestUtil.send(Headers.getGenericAPIHeaderForBE(accessToken), requestBody, EndPoints.CATEGORY_SETTING_ADD_URL,
                RequestMethods.POST.toString(), categorySettingDataProvider.getPathVariablesForViewCategorySetting(CommonDataProvider.VIEW_ITEM_SETTING_TYPE));
    }

    public Response deleteCategorySetting(String accessToken, String categoryID, String categoryType, String opcoID, String priceZone) {
        return RestUtil.send(Headers.getHeadersForSettings(accessToken), "", EndPoints.CATEGORY_SETTING_DELETE_URL.replace(CATEGORY_ID_PARAM, categoryID), RequestMethods.DELETE.toString(), categorySettingDataProvider.getPathVariablesForCategorySettingDelete(CommonDataProvider.CATEGORY_SETTING_DELETE_THRESHOLD, categoryType, opcoID,priceZone));

    }

    public Response deleteCategoryRenewMarginSetting(String accessToken,String categoryID,String categoryType,String opcoID,String priceZone) {
        return   RestUtil.send(Headers.getHeadersForSettings(accessToken), "",
                EndPoints.CATEGORY_SETTING_DELETE_URL.replace(CATEGORY_ID_PARAM, categoryID),
                RequestMethods.DELETE.toString(),
                categorySettingDataProvider.getPathVariablesForCategorySettingDelete(
                        CommonDataProvider.CATEGORY_SETTING_RENEW_MARGIN, categoryType, opcoID,priceZone));
    }

    public Response deleteCategorySettingRenewMargin(String accessToken, String categoryID, String categoryType, String opcoID,String priceZone) {
        return RestUtil.send(Headers.getHeadersForSettings(accessToken), "", EndPoints.CATEGORY_SETTING_DELETE_URL.replace(CATEGORY_ID_PARAM, categoryID), RequestMethods.DELETE.toString(), categorySettingDataProvider.getPathVariablesForCategorySettingDelete(CommonDataProvider.VIEW_ITEM_SETTING_TYPE_RENEW_MARGIN, categoryType, opcoID,priceZone));

    }

    public Response deleteCategorySettingRenewMarginInvalid(String accessToken, String categoryID, String categoryType, String opcoID,String priceZone) {
        return RestUtil.send(Headers.getHeadersForSettings(accessToken), "", EndPoints.CATEGORY_SETTING_DELETE_URL.replace(CATEGORY_ID_PARAM, categoryID), RequestMethods.DELETE.toString(), categorySettingDataProvider.getPathVariablesForCategorySettingDelete(CommonDataProvider.CATEGORY_SETTING_DELETE_INVALID, categoryType, opcoID,priceZone));

    }

    public Response deleteCategorySettingExclusion(String accessToken, String categoryID, String categoryType, String opcoID, String priceZone) {
        return RestUtil.send(Headers.getHeadersForSettings(accessToken), "", EndPoints.CATEGORY_SETTING_DELETE_URL.replace(CATEGORY_ID_PARAM, categoryID), RequestMethods.DELETE.toString(), categorySettingDataProvider.getPathVariablesForCategorySettingDelete(CommonDataProvider.CATEGORY_SETTING_DELETE_EXCLUSION, categoryType, opcoID, priceZone));

    }

    public Response editCategorySetting(String accessToken, String requestBody, String categoryID, String categoryType, String priceZone) {
        return RestUtil.send(Headers.getGenericAPIHeaderForBE(accessToken), requestBody, EndPoints.CATEGORY_SETTING_EDIT_URL.replace(CATEGORY_ID_PARAM, categoryID), RequestMethods.PUT.toString(), categorySettingDataProvider.getPathVariablesForEditCategorySetting(CommonDataProvider.VIEW_ITEM_SETTING_TYPE, categoryType,priceZone));

    }

    public Response createCategorySettingMargin(String accessToken, String requestBody) {
        return RestUtil.send(Headers.getGenericAPIHeaderForBE(accessToken), requestBody, EndPoints.CATEGORY_SETTING_ADD_URL,
                RequestMethods.POST.toString(), categorySettingDataProvider.getPathVariablesForViewCategorySetting(Constants.MARGIN));
    }
    public Response createCategorySettingRenewMargin(String accessToken, String requestBody ) {
        return RestUtil.send(Headers.getGenericAPIHeaderForBE(accessToken), requestBody, EndPoints.CATEGORY_SETTING_ADD_URL,
                RequestMethods.POST.toString(), categorySettingDataProvider.getPathVariablesForViewCategorySetting(Constants.RENEW_MARGIN));
    }
    public Response editCategorySettingMargin(String accessToken,String requestBody,String categoryID,String categoryType,String priceZone) {
        return RestUtil.send(Headers.getGenericAPIHeaderForBE(accessToken), requestBody, EndPoints.CATEGORY_SETTING_EDIT_URL.replace(CATEGORY_ID_PARAM,categoryID), RequestMethods.PUT.toString(),
                categorySettingDataProvider.getPathVariablesForEditCategorySetting(Constants.MARGIN,categoryType,priceZone));
    }
    public Response editCategorySettingRenewMargin(String accessToken,String requestBody,String categoryID,String categoryType,String priceZone) {
        return RestUtil.send(Headers.getGenericAPIHeaderForBE(accessToken), requestBody, EndPoints.CATEGORY_SETTING_EDIT_URL.replace(CATEGORY_ID_PARAM,categoryID), RequestMethods.PUT.toString(),
                categorySettingDataProvider.getPathVariablesForEditCategorySetting(Constants.RENEW_MARGIN, categoryType,priceZone));
    }

    public Response getCategorySetting(String accessToken) {
        return RestUtil.send(Headers.getGenericAPIHeaderForBE(accessToken), "", EndPoints.CATEGORY_SETTING, RequestMethods.GET.toString(), categorySettingDataProvider.getPathVariablesForViewCategorySetting(CommonDataProvider.VIEW_ITEM_SETTING_TYPE));
    }

    public Response createCategoryRenewalMarginSetting(String accessToken, String requestBody) {
        return RestUtil.send(Headers.getGenericAPIHeaderForBE(accessToken), requestBody, EndPoints.CATEGORY_SETTING_ADD_URL, RequestMethods.POST.toString(), categorySettingDataProvider.getPathVariablesForViewCategorySetting(CommonDataProvider.VIEW_ITEM_SETTING_TYPE_RENEW_MARGIN));
    }
    public Response deleteCategorySettingMargin(String accessToken,String categoryID,String categoryType,String opcoID,String priceZone) {
        return   RestUtil.send(Headers.getHeadersForSettings(accessToken), "", EndPoints.CATEGORY_SETTING_DELETE_URL.replace(CATEGORY_ID_PARAM, categoryID), RequestMethods.DELETE.toString(), categorySettingDataProvider.getPathVariablesForCategorySettingDelete(Constants.MARGIN, categoryType, opcoID,priceZone));

    }

    public static Response getCategoryRenewalMarginSetting(String accessToken) {
        CategorySettingDataProvider categorySettingDataProvider = new CategorySettingDataProvider();
        return RestUtil.send(Headers.getGenericAPIHeaderForBE(accessToken), "", EndPoints.CATEGORY_SETTING_ADD_URL, RequestMethods.GET.toString(), categorySettingDataProvider.getPathVariablesForViewCategorySetting(CommonDataProvider.VIEW_ITEM_SETTING_TYPE_RENEW_MARGIN));
    }

    public Response getCategoryMarginSetting(String accessToken) {
        return RestUtil.send(Headers.getGenericAPIHeaderForBE(accessToken), "", EndPoints.CATEGORY_SETTING_ADD_URL, RequestMethods.GET.toString(), categorySettingDataProvider.getPathVariablesForViewCategorySetting(Constants.MARGIN));
    }
    public Response deleteCategoryMarginSetting(String accessToken,String categoryID,String categoryType,String opcoID,String priceZone) {
        return   RestUtil.send(Headers.getHeadersForSettings(accessToken), "",
                String.format(EndPoints.DELETE_CAT_MARGIN_SETTING_URL, categoryID, categoryType, opcoID,priceZone), RequestMethods.DELETE.toString());
    }

}
