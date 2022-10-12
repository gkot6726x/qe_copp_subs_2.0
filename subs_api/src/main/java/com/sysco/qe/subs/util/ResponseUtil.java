package com.sysco.qe.subs.util;

import com.sysco.qe.subs.common.Constants;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ResponseUtil {

    private ResponseUtil() {
    }

    public static List<String> getValuesOfResponse(Response response, String key) {
        JsonPath jsonPathEvaluator = response.jsonPath();
        return ((List) jsonPathEvaluator.get(key));
    }

    public static Map<String, String> getValuesOfOpcoDetailsAsMAP(Response response, String key1, String key2) {
        Map<String, String> sitesData = new LinkedHashMap<>();
        JsonPath jsonPathEvaluator = response.jsonPath();
        int size = jsonPathEvaluator.getList(key2).size();
        for (int i = 0; i < size; i++) {
            String categoryID = jsonPathEvaluator.getList(key1).get(i).toString();
            String categoryName = jsonPathEvaluator.getList(key2).get(i).toString();
            String[] catName = categoryName.split(",");
            sitesData.put(categoryID, catName[1].trim());
        }
        sitesData.put(Constants.DEFAULT_SITDE_ID, Constants.DEFAULT_SITE_NAME);
        return sitesData;
    }
    public static String getValueInResponse(Response response,String key) {
        return response.path(key);
    }
}
