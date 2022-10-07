package com.sysco.qe.subs.data.category_setting;

import com.google.gson.Gson;
import com.sysco.qe.subs.data.CommonDataProvider;
import com.sysco.qe.subs.data.SQLQueries;
import com.sysco.qe.subs.request.data.*;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.sysco.qe.subs.common.Constants.*;


public class CategorySettingDataProvider extends CommonDataProvider {

    private Gson gson = new Gson();

    public CategorySettingsThreshold createCategorySettingThreshold() {
        return new CategorySettingsThreshold(CommonDataProvider.VALID_OPCOID_CATEGORYSETTING, CommonDataProvider.CATEGORY_ID_SETTINGS, CommonDataProvider.MINOR_CATEGORY_TYPE,
                CommonDataProvider.MODIFICATION_TYPE_THRESHOLD, CommonDataProvider.VALID_NOTE_1, CommonDataProvider.AUTO_REJECTED_THRESHOLD, CommonDataProvider.AUTO_APPROVED_THRESHOLD,PRICE_ZONE_3);
    }

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

    public String createCategoryMarginSettingForGivenPZAndMargin(String opco, String categoryId, String type,String margin, String priceZone) {
        CategoryMarginSetting categoryMarginSetting = new CategoryMarginSetting(Arrays.asList(opco), categoryId, type,
                CommonDataProvider.MODIFICATION_TYPE_MARGIN, margin,priceZone);
        return gson.toJson(categoryMarginSetting);
    }
    public Map<String, String> getPathVariablesForViewCategorySetting(String type) {
        Map<String, String> queryParameters = new HashMap<>();
        queryParameters.put(TYPE, type);
        return queryParameters;
    }

    public Map<String, String> getPathVariablesForViewCategorySettingHistory(String categorType, String siteID,String priceZone) {
        Map<String, String> queryParameters = new HashMap<>();
        queryParameters.put(CommonDataProvider.CATEGORY_TYPE_DELETE, categorType);
        queryParameters.put(SITE_ID, siteID);
        queryParameters.put(PRICE_ZONE, priceZone);
        return queryParameters;
    }

    public Map<String, String> getPathVariablesForEditCategorySetting(String type, String categoryType,String priceZone) {
        Map<String, String> queryParameters = new HashMap<>();
        queryParameters.put(TYPE, type);
        queryParameters.put(CommonDataProvider.CATEGORY_TYPE_DELETE, categoryType);
        queryParameters.put(PRICE_ZONE, priceZone);
        return queryParameters;
    }

    public CategorySettingsThreshold createCategorySettingThresholdWithInvalidCategoryType() {
        return new CategorySettingsThreshold(CommonDataProvider.VALID_OPCOID_CATEGORYSETTING, CommonDataProvider.CATEGORY_ID_SETTINGS, CommonDataProvider.INVALID_CATEGORY_TYPE,
                CommonDataProvider.MODIFICATION_TYPE_THRESHOLD, CommonDataProvider.VALID_NOTE_1, CommonDataProvider.AUTO_REJECTED_THRESHOLD, CommonDataProvider.AUTO_APPROVED_THRESHOLD,PRICE_ZONE_3);
    }

    public CategorySettingsThreshold createCategorySettingThresholdWithInvalidCategoryID() {
        return new CategorySettingsThreshold(CommonDataProvider.VALID_OPCOID_CATEGORYSETTING, CommonDataProvider.CATEGORY_ID_SETTINGS_INVALID, CommonDataProvider.MINOR_CATEGORY_TYPE,
                CommonDataProvider.MODIFICATION_TYPE_THRESHOLD, CommonDataProvider.VALID_NOTE_1, CommonDataProvider.AUTO_REJECTED_THRESHOLD, CommonDataProvider.AUTO_APPROVED_THRESHOLD,PRICE_ZONE_3);
    }

    public CategorySettingsThreshold createCategorySettingThresholdForLongNote() {
        return new CategorySettingsThreshold(CommonDataProvider.VALID_OPCOID_CATEGORYSETTING, CommonDataProvider.CATEGORY_ID_SETTINGS, CommonDataProvider.MINOR_CATEGORY_TYPE,
                CommonDataProvider.MODIFICATION_TYPE_THRESHOLD, CommonDataProvider.LONG_NOTE, CommonDataProvider.AUTO_REJECTED_THRESHOLD, CommonDataProvider.AUTO_APPROVED_THRESHOLD,PRICE_ZONE_3);
    }

    public CategorySettingsThreshold createCategorySettingThresholdWithModificationTypeZero() {
        return new CategorySettingsThreshold(CommonDataProvider.VALID_OPCOID_CATEGORYSETTING, CommonDataProvider.CATEGORY_ID_SETTINGS, CommonDataProvider.MINOR_CATEGORY_TYPE,
                CommonDataProvider.MODIFICATION_TYPE_EXCLUSION, CommonDataProvider.VALID_NOTE_1, CommonDataProvider.AUTO_REJECTED_THRESHOLD, CommonDataProvider.AUTO_APPROVED_THRESHOLD,PRICE_ZONE_3);
    }

    public CategorySettingsThreshold createCategorySettingInvalidThreshold() {
        return new CategorySettingsThreshold(CommonDataProvider.VALID_OPCOID_CATEGORYSETTING, CommonDataProvider.CATEGORY_ID_SETTINGS, CommonDataProvider.MINOR_CATEGORY_TYPE,
                CommonDataProvider.MODIFICATION_TYPE_THRESHOLD, CommonDataProvider.VALID_NOTE_1, CommonDataProvider.INVALID_AUTO_REJECTED_THRESHOLD, CommonDataProvider.INVALID_AUTO_APPROVED_THRESHOLD,PRICE_ZONE_3);
    }

    public CategorySettingsThreshold createCategorySettingThresholdWithAutoApproveThresholdIsLessThanAutoRejectedThreshold() {
        return new CategorySettingsThreshold(CommonDataProvider.VALID_OPCOID_CATEGORYSETTING, CommonDataProvider.CATEGORY_ID_SETTINGS, CommonDataProvider.MINOR_CATEGORY_TYPE,
                CommonDataProvider.MODIFICATION_TYPE_THRESHOLD, CommonDataProvider.VALID_NOTE_1, CommonDataProvider.AUTO_APPROVED_THRESHOLD, CommonDataProvider.AUTO_REJECTED_THRESHOLD,PRICE_ZONE_3);
    }

    public CategorySettingsThreshold createCategorySettingThresholdWithNullCategoryID() {
        return new CategorySettingsThreshold(CommonDataProvider.VALID_OPCOID_CATEGORYSETTING, null, CommonDataProvider.MINOR_CATEGORY_TYPE,
                CommonDataProvider.MODIFICATION_TYPE_THRESHOLD, CommonDataProvider.VALID_NOTE_1, CommonDataProvider.AUTO_REJECTED_THRESHOLD, CommonDataProvider.AUTO_APPROVED_THRESHOLD,PRICE_ZONE_3);
    }

    public CategorySettingsThreshold createCategorySettingThresholdWithNullCategoryType() {
        return new CategorySettingsThreshold(CommonDataProvider.VALID_OPCOID_CATEGORYSETTING, CommonDataProvider.CATEGORY_ID_SETTINGS, null,
                CommonDataProvider.MODIFICATION_TYPE_THRESHOLD, CommonDataProvider.VALID_NOTE_1, CommonDataProvider.AUTO_REJECTED_THRESHOLD, CommonDataProvider.AUTO_APPROVED_THRESHOLD,PRICE_ZONE_3);
    }

    public CategorySettingsThreshold createCategorySettingThresholdWithEmptyNotes() {
        return new CategorySettingsThreshold(CommonDataProvider.VALID_OPCOID_CATEGORYSETTING, CommonDataProvider.CATEGORY_ID_SETTINGS, CommonDataProvider.MINOR_CATEGORY_TYPE,
                CommonDataProvider.MODIFICATION_TYPE_THRESHOLD, "", CommonDataProvider.AUTO_REJECTED_THRESHOLD, CommonDataProvider.AUTO_APPROVED_THRESHOLD,PRICE_ZONE_3);
    }

    public CategorySettingsThreshold createCategorySettingThresholdWithNullAutoApproveThreshold() {
        return new CategorySettingsThreshold(CommonDataProvider.VALID_OPCOID_CATEGORYSETTING, CommonDataProvider.CATEGORY_ID_SETTINGS, CommonDataProvider.MINOR_CATEGORY_TYPE,
                CommonDataProvider.MODIFICATION_TYPE_THRESHOLD, CommonDataProvider.VALID_NOTE_1, CommonDataProvider.AUTO_REJECTED_THRESHOLD, null,PRICE_ZONE_3);
    }

    public CategorySettingsThreshold createCategorySettingThresholdWithNullAutoRejectedThreshold() {
        return new CategorySettingsThreshold(CommonDataProvider.VALID_OPCOID_CATEGORYSETTING, CommonDataProvider.CATEGORY_ID_SETTINGS, CommonDataProvider.MINOR_CATEGORY_TYPE,
                CommonDataProvider.MODIFICATION_TYPE_THRESHOLD, CommonDataProvider.VALID_NOTE_1, null, CommonDataProvider.AUTO_APPROVED_THRESHOLD,PRICE_ZONE_3);
    }


    public CategorySettingsExclusion createCategorySettingExclusion() {
        return new CategorySettingsExclusion(CommonDataProvider.VALID_OPCOID_CATEGORYSETTING, CommonDataProvider.CATEGORY_ID_SETTINGS, CommonDataProvider.MINOR_CATEGORY_TYPE,
                CommonDataProvider.MODIFICATION_TYPE_EXCLUSION, CommonDataProvider.VALID_NOTE_1, PRICE_ZONE_0);
    }

    public CategorySettingsExclusion createCategorySettingExclusionWithInvalidCategoryID() {
        return new CategorySettingsExclusion(CommonDataProvider.VALID_OPCOID_CATEGORYSETTING, CommonDataProvider.CATEGORY_ID_SETTINGS_INVALID, CommonDataProvider.MINOR_CATEGORY_TYPE,
                CommonDataProvider.MODIFICATION_TYPE_THRESHOLD, CommonDataProvider.VALID_NOTE_1, PRICE_ZONE_0);
    }

    public CategorySettingsExclusion createCategorySettingExclusionWithModificationTypeOne() {
        return new CategorySettingsExclusion(CommonDataProvider.VALID_OPCOID_CATEGORYSETTING, CommonDataProvider.CATEGORY_ID_SETTINGS, CommonDataProvider.MINOR_CATEGORY_TYPE,
                CommonDataProvider.MODIFICATION_TYPE_THRESHOLD, CommonDataProvider.VALID_NOTE_1, PRICE_ZONE_0);
    }

    public CategorySettingsExclusion createCategorySettingExclusionWithLongDescriptionForNote() {
        return new CategorySettingsExclusion(CommonDataProvider.VALID_OPCOID_CATEGORYSETTING, CommonDataProvider.CATEGORY_ID_SETTINGS, CommonDataProvider.MINOR_CATEGORY_TYPE,
                CommonDataProvider.MODIFICATION_TYPE_EXCLUSION, CommonDataProvider.LONG_NOTE, PRICE_ZONE_0);
    }

    public CategorySettingsExclusion createCategorySettingExclusionWithEmptyNote() {
        return new CategorySettingsExclusion(CommonDataProvider.VALID_OPCOID_CATEGORYSETTING, CommonDataProvider.CATEGORY_ID_SETTINGS, CommonDataProvider.MINOR_CATEGORY_TYPE,
                CommonDataProvider.MODIFICATION_TYPE_EXCLUSION, "", PRICE_ZONE_0);
    }

    public CategorySettingsExclusion createCategorySettingExclusionWithNullModificationType() {
        return new CategorySettingsExclusion(CommonDataProvider.VALID_OPCOID_CATEGORYSETTING, CommonDataProvider.CATEGORY_ID_SETTINGS, CommonDataProvider.MINOR_CATEGORY_TYPE,
                null, CommonDataProvider.VALID_NOTE_1, PRICE_ZONE_0);
    }

    public CategorySettingsExclusion createCategorySettingExclusionWithNullCategoryID() {
        return new CategorySettingsExclusion(CommonDataProvider.VALID_OPCOID_CATEGORYSETTING, null, CommonDataProvider.MINOR_CATEGORY_TYPE,
                CommonDataProvider.MODIFICATION_TYPE_EXCLUSION, CommonDataProvider.VALID_NOTE_1, PRICE_ZONE_0);
    }

    public CategorySettingsExclusion createCategorySettingExclusionWithNullCategoryType() {
        return new CategorySettingsExclusion(CommonDataProvider.VALID_OPCOID_CATEGORYSETTING, CommonDataProvider.CATEGORY_ID_SETTINGS, null,
                CommonDataProvider.MODIFICATION_TYPE_EXCLUSION, CommonDataProvider.VALID_NOTE_1, PRICE_ZONE_0);
    }

    public CategorySettingEditThreshold editCategorySettingThreshold() {
        return new CategorySettingEditThreshold(CommonDataProvider.VALID_OPCOID_4, CommonDataProvider.MODIFICATION_TYPE_THRESHOLD, CommonDataProvider.VALID_NOTE_1, CommonDataProvider.AUTO_REJECTED_THRESHOLD_EDITED, CommonDataProvider.AUTO_APPROVED_THRESHOLD_EDITED);
    }

    public CategorySettingEditExclusion editCategorySettingExclusion() {
        return new CategorySettingEditExclusion(CommonDataProvider.VALID_OPCOID_4, CommonDataProvider.MODIFICATION_TYPE_EXCLUSION, CommonDataProvider.VALID_NOTE_1);
    }

    public CategorySettingEditThreshold editCategorySettingThresholdWithWrongData() {
        return new CategorySettingEditThreshold(CommonDataProvider.VALID_OPCOID_4, CommonDataProvider.MODIFICATION_TYPE_THRESHOLD, CommonDataProvider.VALID_NOTE_1, CommonDataProvider.INVALID_AUTO_REJECTED_THRESHOLD, CommonDataProvider.INVALID_AUTO_APPROVED_THRESHOLD);
    }

    public CategorySettingEditThreshold editCategorySettingThresholdWithLongNote() {
        return new CategorySettingEditThreshold(CommonDataProvider.VALID_OPCOID_4, CommonDataProvider.MODIFICATION_TYPE_THRESHOLD, CommonDataProvider.LONG_NOTE, CommonDataProvider.AUTO_REJECTED_THRESHOLD_EDITED, CommonDataProvider.AUTO_APPROVED_THRESHOLD_EDITED);
    }

    public CategorySettingEditExclusion editCategorySettingExclusionWithLongNote() {
        return new CategorySettingEditExclusion(CommonDataProvider.VALID_OPCOID_4, CommonDataProvider.MODIFICATION_TYPE_EXCLUSION, CommonDataProvider.LONG_NOTE);
    }

    public CategorySettingEditThreshold editCategorySettingThresholdWithIncorrectModificationType() {
        return new CategorySettingEditThreshold(CommonDataProvider.VALID_OPCOID_4, CommonDataProvider.INVALID_MODIFICATION_TYPE.toString(), CommonDataProvider.VALID_NOTE_1, CommonDataProvider.AUTO_REJECTED_THRESHOLD_EDITED, CommonDataProvider.AUTO_APPROVED_THRESHOLD_EDITED);
    }

    public CategorySettingEditExclusion editCategorySettingExclusionWithincorrectModificationType() {
        return new CategorySettingEditExclusion(CommonDataProvider.VALID_OPCOID_4, CommonDataProvider.INVALID_MODIFICATION_TYPE.toString(), CommonDataProvider.VALID_NOTE_1);
    }

    public CategorySettingEditThreshold editCategorySettingThresholdWithoutOpcoId() {
        return new CategorySettingEditThreshold(null, CommonDataProvider.MODIFICATION_TYPE_THRESHOLD, CommonDataProvider.VALID_NOTE_1, CommonDataProvider.AUTO_REJECTED_THRESHOLD_EDITED, CommonDataProvider.AUTO_APPROVED_THRESHOLD_EDITED);
    }

    public CategorySettingEditExclusion editCategorySettingExclusionWithoutOpcoId() {
        return new CategorySettingEditExclusion(null, CommonDataProvider.MODIFICATION_TYPE_EXCLUSION, CommonDataProvider.VALID_NOTE_1);
    }

    public CategorySettingEditThreshold editCategorySettingThresholdWithoutNote() {
        return new CategorySettingEditThreshold(CommonDataProvider.VALID_OPCOID_4, CommonDataProvider.MODIFICATION_TYPE_THRESHOLD, null, CommonDataProvider.AUTO_REJECTED_THRESHOLD_EDITED, CommonDataProvider.AUTO_APPROVED_THRESHOLD_EDITED);
    }

    public CategorySettingEditExclusion editCategorySettingExclusionWithoutNote() {
        return new CategorySettingEditExclusion(CommonDataProvider.VALID_OPCOID_4, CommonDataProvider.MODIFICATION_TYPE_EXCLUSION, null);
    }

    public CategorySettingEditThreshold editCategorySettingThresholdWithoutModType() {
        return new CategorySettingEditThreshold(CommonDataProvider.VALID_OPCOID_4, null, CommonDataProvider.VALID_NOTE_1, CommonDataProvider.AUTO_REJECTED_THRESHOLD_EDITED, CommonDataProvider.AUTO_APPROVED_THRESHOLD_EDITED);
    }

    public CategorySettingEditExclusion editCategorySettingExclusionWithoutModType() {
        return new CategorySettingEditExclusion(CommonDataProvider.VALID_OPCOID_4, null, CommonDataProvider.VALID_NOTE_1);
    }

    public CategorySettingEditThreshold editCategorySettingThresholdWithoutRejectThresh() {
        return new CategorySettingEditThreshold(CommonDataProvider.VALID_OPCOID_4, CommonDataProvider.MODIFICATION_TYPE_THRESHOLD, CommonDataProvider.VALID_NOTE_1, null, CommonDataProvider.AUTO_APPROVED_THRESHOLD_EDITED);
    }

    public CategorySettingEditThreshold editCategorySettingThresholdWithoutApproveThresh() {
        return new CategorySettingEditThreshold(CommonDataProvider.VALID_OPCOID_4, CommonDataProvider.MODIFICATION_TYPE_THRESHOLD, CommonDataProvider.VALID_NOTE_1, CommonDataProvider.AUTO_REJECTED_THRESHOLD_EDITED, null);
    }

    public String createCategoryMarginSettingForIncorrectMargin(String opco, String categoryId, String type,String margin) {
        CategoryMarginSetting categoryMarginSetting = new CategoryMarginSetting(Arrays.asList(opco), categoryId, type,
                CommonDataProvider.MODIFICATION_TYPE_MARGIN, margin,PRICE_ZONE_3);
        return gson.toJson(categoryMarginSetting);
    }

    public String createCategoryMarginSettingForMultiOpco(List<String> opco, String categoryId, String type) {
        CategoryMarginSetting categoryMarginSetting = new CategoryMarginSetting(opco, categoryId, type,
                CommonDataProvider.MODIFICATION_TYPE_MARGIN, CommonDataProvider.MARGIN_VALUE,PRICE_ZONE_3);
        return gson.toJson(categoryMarginSetting);
    }
    public CategorySettingsThreshold createCategorySettingThresholdForMultiOpco(List<String> opcos, String categoryId, String categoryType, Double rejectThresh,
                                                                                Double approveThresh) {
        return new CategorySettingsThreshold(opcos, categoryId, categoryType,
                CommonDataProvider.MODIFICATION_TYPE_THRESHOLD, CommonDataProvider.VALID_NOTE_1,
                String.valueOf(rejectThresh), String.valueOf(approveThresh),PRICE_ZONE_3);
    }

    public CategorySettingsExclusion createCategorySettingExclusionForMultiOpco(List<String> opcos, String categoryId, String categoryType, String priceZone) {
        return new CategorySettingsExclusion(opcos, categoryId, categoryType,
                CommonDataProvider.MODIFICATION_TYPE_EXCLUSION, CommonDataProvider.VALID_NOTE_1, priceZone);

    }
    public String editCategoryMarginSetting(String opco,String margin) {
        CategorySettingEditMargin categorySettingEditMargin = new CategorySettingEditMargin(opco, CommonDataProvider.MODIFICATION_TYPE_MARGIN, margin);
        return gson.toJson(categorySettingEditMargin);
    }
    public String editCategoryRenewMarginSetting(String opco,String margin) {
        CategorySettingEditMargin categorySettingEditMargin = new CategorySettingEditMargin(opco, CommonDataProvider.MODIFICATION_TYPE_RENEWAL_MARGIN, margin);
        return gson.toJson(categorySettingEditMargin);
    }
    public  String getOpcosForRegion(String syscoId) throws SQLException {
        String userID = ViewCategorySettingDAOFunction.getItemCategoryData(SQLQueries.GET_USER_ID.replace("<sysco_id>", syscoId));
        String referenceID = ViewCategorySettingDAOFunction.getItemCategoryData(SQLQueries.GET_REFERENCE_ID.replace("<user_id>", userID));
        return  ViewCategorySettingDAOFunction.getItemCategoryData(SQLQueries.GET_OPCO_ID_LIST.replace("<region_id>", referenceID));
    }
    public List<String> getOpcos(String opcoList){
        String[] opco=opcoList.replace("[","").replace("]","").split(",",4);
        return  Arrays.asList(opco);
    }

    public CategorySettingsExclusion createCategorySettingExclusionForMinorCat() {
        return new CategorySettingsExclusion(CommonDataProvider.VALID_OPCOID_CATEGORYSETTING, CommonDataProvider.CATEGORY_ID_100, CommonDataProvider.MINOR_CATEGORY_TYPE,
                CommonDataProvider.MODIFICATION_TYPE_EXCLUSION, CommonDataProvider.VALID_NOTE_1, PRICE_ZONE_0);
    }

    public String createCategoryRenewMarginSetting(List<String> opco, String categoryId, String type,String renewMarginValue) {
        CategoryMarginSetting categoryMarginSetting = new CategoryMarginSetting(opco, categoryId, type,
                CommonDataProvider.MODIFICATION_TYPE_RENEWAL_MARGIN, renewMarginValue,PRICE_ZONE_3);
        return gson.toJson(categoryMarginSetting);
    }

    public String createCategoryRenewMarginSettingForGivenPZ(List<String> opco, String categoryId, String type,String renewMarginValue,String priceZone) {
        CategoryMarginSetting categoryMarginSetting = new CategoryMarginSetting(opco, categoryId, type,
                CommonDataProvider.MODIFICATION_TYPE_RENEWAL_MARGIN, renewMarginValue,priceZone);
        return gson.toJson(categoryMarginSetting);
    }

    public String createCategoryRenewalMarginSettingForSingleOpco(String opco, String categoryId, String type, Double margin) {
        CategoryRenewalMarginSetting categoryMarginSetting = new CategoryRenewalMarginSetting(Arrays.asList(opco), categoryId, type, CommonDataProvider.MODIFICATION_TYPE_RENEWAL_MARGIN, margin,PRICE_ZONE_3);
        return gson.toJson(categoryMarginSetting);
    }

    public CategorySettingsExclusion createCategoryExclusionForMultiOpcoAndPriceZone(List<String> opcos, String categoryId, String categoryType, String priceZone) {
        return new CategorySettingsExclusion(opcos, categoryId, categoryType, CommonDataProvider.MODIFICATION_TYPE_EXCLUSION, CommonDataProvider.VALID_NOTE_1, priceZone);

    }

    public CategorySettingsThreshold createCategorySettingThresholdForMultiOpcoForGivenPriceZone(List<String> opcos, String categoryId, String categoryType, Double rejectThresh,
                                                                                Double approveThresh,String priceZone) {
        return new CategorySettingsThreshold(opcos, categoryId, categoryType,
                CommonDataProvider.MODIFICATION_TYPE_THRESHOLD, CommonDataProvider.VALID_NOTE_1,
                String.valueOf(rejectThresh), String.valueOf(approveThresh),priceZone);
    }

    public CategorySettingsThreshold createCategorySettingThresholdForSingleOpcoForGivenPriceZone(String priceZone) {
        return new CategorySettingsThreshold(CommonDataProvider.VALID_OPCOID_CATEGORYSETTING, CommonDataProvider.CATEGORY_ID_SETTINGS, CommonDataProvider.MINOR_CATEGORY_TYPE,
                CommonDataProvider.MODIFICATION_TYPE_THRESHOLD, CommonDataProvider.VALID_NOTE_1, CommonDataProvider.AUTO_REJECTED_THRESHOLD,  CommonDataProvider.AUTO_APPROVED_THRESHOLD,priceZone);
    }

    public CategorySettingsExclusion createCategorySettingExclusionForSinglePZ(String priceZone) {
        return new CategorySettingsExclusion(CommonDataProvider.VALID_OPCOID_CATEGORYSETTING, CommonDataProvider.CATEGORY_ID_SETTINGS, CommonDataProvider.MINOR_CATEGORY_TYPE,
                CommonDataProvider.MODIFICATION_TYPE_EXCLUSION, CommonDataProvider.VALID_NOTE_1, priceZone);
    }

    public CategorySettingsThreshold createCategorySettingThresholdForForGivenPriceZoneOpcoAndThresholds(String priceZone,String autoRejThresholdValue,String autoApproveThresholdValue) {
        return new CategorySettingsThreshold(CommonDataProvider.VALID_OPCOID_CATEGORYSETTING, CommonDataProvider.CATEGORY_ID_SETTINGS, CommonDataProvider.MINOR_CATEGORY_TYPE,
                CommonDataProvider.MODIFICATION_TYPE_THRESHOLD, CommonDataProvider.VALID_NOTE_1, autoRejThresholdValue,  autoApproveThresholdValue,priceZone);
    }
}

