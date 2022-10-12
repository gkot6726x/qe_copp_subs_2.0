package com.sysco.qe.subs.data.category_setting;

import com.google.gson.Gson;
import com.sysco.qe.subs.data.CommonDataProvider;
import com.sysco.qe.subs.request.data.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static com.sysco.qe.subs.common.Constants.*;


public class CategorySettingDataProvider extends CommonDataProvider {

    private Gson gson = new Gson();


    public Map<String, String> getPathVariablesForCategorySettingDelete(String type, String categoryType, String siteid, String priceZone) {
        Map<String, String> queryParameters = new HashMap<>();
        queryParameters.put(TYPE, type);
        queryParameters.put(CommonDataProvider.CATEGORY_TYPE_DELETE, categoryType);
        queryParameters.put(SITE_ID, siteid);
        queryParameters.put(PRICE_ZONE, priceZone);
        return queryParameters;
    }
    public String createCategoryMarginSetting(String opco, String categoryId, String type) {
        CategoryMarginSetting categoryMarginSetting = new CategoryMarginSetting(Arrays.asList(opco), categoryId, type,
                CommonDataProvider.MODIFICATION_TYPE_MARGIN, CommonDataProvider.MARGIN_VALUE,PRICE_ZONE_3);
        return gson.toJson(categoryMarginSetting);
    }

    public Map<String, String> getPathVariablesForViewCategorySetting(String type) {
        Map<String, String> queryParameters = new HashMap<>();
        queryParameters.put(TYPE, type);
        return queryParameters;
    }

    public Map<String, String> getPathVariablesForEditCategorySetting(String type, String categoryType,String priceZone) {
        Map<String, String> queryParameters = new HashMap<>();
        queryParameters.put(TYPE, type);
        queryParameters.put(CommonDataProvider.CATEGORY_TYPE_DELETE, categoryType);
        queryParameters.put(PRICE_ZONE, priceZone);
        return queryParameters;
    }


    public String createCategoryMarginSettingForIncorrectMargin(String opco, String categoryId, String type,String margin) {
        CategoryMarginSetting categoryMarginSetting = new CategoryMarginSetting(Arrays.asList(opco), categoryId, type,
                CommonDataProvider.MODIFICATION_TYPE_MARGIN, margin,PRICE_ZONE_3);
        return gson.toJson(categoryMarginSetting);
    }


}

