package com.sysco.qe.subs.data.category_setting;

import com.sysco.qe.subs.util.DatabaseUtil;
import com.syscolab.qe.core.common.LoggerUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CategorySettingDAOFunctions {

    private CategorySettingDAOFunctions() {}

    private static Connection conn;
    private static String logErrorMessage = "Error";

    private static Integer opcoId;
    private static String opcoName;
    private static Integer marketId;
    private static String marketName;
    private static Integer regionId;
    private static String regionName;
    private static String autoApproveThresh;
    private static String autoRejectThresh;
    private static String notes;
    private static String categorySettingId;
    private static String categoryType;
    private static String categoryId;
    private static String categoryName;
    private static Integer majorCategoryId;
    private static String majorCategoryName;
    private static Integer interCategoryId;
    private static String interCategoryName;
    private static Integer minorCategoryId;
    private static String minorCategoryName;
    private static String itemId;
    private static double margin;
    private static double renewMargin;
    private static boolean exclusion;
    private static int status;
    private static String groupId;
    private static String customerId;
    private static String customerSyscoId;
    private static String modificationType;
    private static String priceZone;

    public static Integer getOpcoId() {
        return opcoId;
    }

    public static void setOpcoId(Integer opcoId) {
        CategorySettingDAOFunctions.opcoId = opcoId;
    }

    public static String getOpcoName() {
        return opcoName;
    }

    public static void setOpcoName(String opcoName) {
        CategorySettingDAOFunctions.opcoName = opcoName;
    }

    public static Integer getMarketId() {
        return marketId;
    }

    public static void setMarketId(Integer marketId) {
        CategorySettingDAOFunctions.marketId = marketId;
    }

    public static String getMarketName() {
        return marketName;
    }

    public static void setMarketName(String marketName) {
        CategorySettingDAOFunctions.marketName = marketName;
    }

    public static Integer getRegionId() {
        return regionId;
    }

    public static void setRegionId(Integer regionId) {
        CategorySettingDAOFunctions.regionId = regionId;
    }

    public static String getRegionName() {
        return regionName;
    }

    public static void setRegionName(String regionName) {
        CategorySettingDAOFunctions.regionName = regionName;
    }

    public static String getAutoApproveThresh() {
        return autoApproveThresh;
    }

    public static void setAutoApproveThresh(String autoApproveThresh) {
        CategorySettingDAOFunctions.autoApproveThresh = autoApproveThresh;
    }

    public static String getAutoRejectThresh() {
        return autoRejectThresh;
    }

    public static void setAutoRejectThresh(String autoRejectThresh) {
        CategorySettingDAOFunctions.autoRejectThresh = autoRejectThresh;
    }

    public static String getNotes() {
        return notes;
    }

    public static void setNotes(String notes) {
        CategorySettingDAOFunctions.notes = notes;
    }

    public static String getCategorySettingId() {
        return categorySettingId;
    }

    public static void setCategorySettingId(String categorySettingId) {
        CategorySettingDAOFunctions.categorySettingId = categorySettingId;
    }

    public static String getCategoryType() {
        return categoryType;
    }

    public static void setCategoryType(String categoryType) {
        CategorySettingDAOFunctions.categoryType = categoryType;
    }

    public static String getCategoryId() {
        return categoryId;
    }

    public static void setCategoryId(String categoryId) {
        CategorySettingDAOFunctions.categoryId = categoryId;
    }

    public static String getCategoryName() {
        return categoryName;
    }

    public static void setCategoryName(String categoryName) {
        CategorySettingDAOFunctions.categoryName = categoryName;
    }

    public static Integer getMajorCategoryId() {
        return majorCategoryId;
    }

    public static void setMajorCategoryId(Integer majorCategoryId) {
        CategorySettingDAOFunctions.majorCategoryId = majorCategoryId;
    }

    public static String getMajorCategoryName() {
        return majorCategoryName;
    }

    public static void setMajorCategoryName(String majorCategoryName) {
        CategorySettingDAOFunctions.majorCategoryName = majorCategoryName;
    }

    public static Integer getInterCategoryId() {
        return interCategoryId;
    }

    public static void setInterCategoryId(Integer interCategoryId) {
        CategorySettingDAOFunctions.interCategoryId = interCategoryId;
    }

    public static String getInterCategoryName() {
        return interCategoryName;
    }

    public static void setInterCategoryName(String interCategoryName) {
        CategorySettingDAOFunctions.interCategoryName = interCategoryName;
    }

    public static Integer getMinorCategoryId() {
        return minorCategoryId;
    }

    public static void setMinorCategoryId(Integer minorCategoryId) {
        CategorySettingDAOFunctions.minorCategoryId = minorCategoryId;
    }

    public static String getMinorCategoryName() {
        return minorCategoryName;
    }

    public static void setMinorCategoryName(String minorCategoryName) {
        CategorySettingDAOFunctions.minorCategoryName = minorCategoryName;
    }

    public static double getMargin() {
        return margin;
    }

    public static void setMargin(double margin) {
        CategorySettingDAOFunctions.margin = margin;
    }

    public static double getRenewMargin() {
        return renewMargin;
    }

    public static void setRenewMargin(double renewMargin) {
        CategorySettingDAOFunctions.renewMargin = renewMargin;
    }

    public static boolean isExclusion() {
        return exclusion;
    }

    public static void setExclusion(boolean exclusion) {
        CategorySettingDAOFunctions.exclusion = exclusion;
    }

    public static int getStatus() {
        return status;
    }

    public static void setStatus(int status) {
        CategorySettingDAOFunctions.status = status;
    }

    public static String getItemId() {
        return itemId;
    }

    public static void setItemId(String itemId) {
        CategorySettingDAOFunctions.itemId = itemId;
    }

    public static String getGroupId() {
        return groupId;
    }

    public static void setGroupId(String groupId) {
        CategorySettingDAOFunctions.groupId = groupId;
    }

    public static String getCustomerId() {
        return customerId;
    }

    public static void setCustomerId(String customerId) {
        CategorySettingDAOFunctions.customerId = customerId;
    }

    public static String getCustomerSyscoId() {
        return customerSyscoId;
    }

    public static void setCustomerSyscoId(String customerSyscoId) {
        CategorySettingDAOFunctions.customerSyscoId = customerSyscoId;
    }
    public static String getModificationType() {
        return modificationType;
    }

    public static void setModificationType(String modificationType) {
        CategorySettingDAOFunctions.modificationType = modificationType;
    }
    public static String getPriceZone() {
        return priceZone;
    }

    public static void setPriceZone(String priceZone) {
        CategorySettingDAOFunctions.priceZone = priceZone;
    }

    public static void selectCategoryMarginSettingFromId(String selectQuery, int type) throws SQLException {
        PreparedStatement preparedStatement = null;
        try {
            conn = DatabaseUtil.getConnection();
            preparedStatement = conn.prepareStatement(selectQuery);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
                opcoId = rs.getInt("opco_id");
                opcoName = rs.getString("opco_name");
                marketId = rs.getInt("market_id");
                marketName = rs.getString("market_name");
                regionId = rs.getInt("region_id");
                regionName = rs.getString("region_name");
                exclusion = false;
                margin = rs.getDouble("margin");
                renewMargin = rs.getDouble("renew_margin");
                categorySettingId = rs.getString("item_category_settings_id");
                categoryType = rs.getString("item_category_type");
                categoryId = rs.getString("category_id");
                categoryName = rs.getString("category_name");
                if (type > 1) {
                    majorCategoryId = rs.getInt("major_category_id");
                    majorCategoryName = rs.getString("major_category_name");
                    if (type > 2) {
                        interCategoryId = rs.getInt("intermediate_category_id");
                        interCategoryName = rs.getString("intermediate_category_name");
                        if (type > 3) {
                            minorCategoryId = rs.getInt("minor_category_id");
                            minorCategoryName = rs.getString("minor_category_name");
                        }
                    }
                }
            }
        } catch (SQLException e) {
            LoggerUtil.logERROR(logErrorMessage, e);
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (conn != null) {
                DatabaseUtil.closeConnection(conn);
            }
        }
    }

    public static void executeQuery(String query) throws SQLException {
        PreparedStatement preparedStatement = null;
        try {
            conn = DatabaseUtil.getConnection();
            preparedStatement = conn.prepareStatement(query);
            preparedStatement.execute();
        } catch (SQLException e) {
            LoggerUtil.logERROR(logErrorMessage, e);
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (conn != null) {
                DatabaseUtil.closeConnection(conn);
            }
        }
    }

    public static void selectCatItemSettingRecord(String selectQuery) throws SQLException {
        PreparedStatement preparedStatement = null;
        try {
            conn = DatabaseUtil.getConnection();
            preparedStatement = conn.prepareStatement(selectQuery);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
                opcoId = rs.getInt("opco_id");
                exclusion = false;
                margin = rs.getDouble("margin");
                renewMargin = rs.getDouble("renew_margin");
                categorySettingId = rs.getString("item_category_settings_id");
                categoryType = rs.getString("item_category_type");
                status = rs.getInt("status");
                autoApproveThresh = rs.getString("current_approve_threshold");
                autoRejectThresh = rs.getString("current_reject_threshold");
                categoryId = rs.getString("item_category_id");
                modificationType = rs.getString("modification_type");
                priceZone = rs.getString("price_zone");
                notes = rs.getString("notes");
            }
        } catch (SQLException e) {
            LoggerUtil.logERROR(logErrorMessage, e);
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (conn != null) {
                DatabaseUtil.closeConnection(conn);
            }
        }

    }
    public static void deleteCategoryIDFromItemSetting(String deleteQuery) throws SQLException {

        Statement statement = null;
        try {
            conn = DatabaseUtil.getConnection();
            statement = conn.createStatement();
            statement.executeUpdate(deleteQuery);

        } catch (SQLException e) {
            LoggerUtil.logERROR(logErrorMessage, e);
        } finally {
            if (statement != null) {
                statement.close();
            }
            if (conn != null) {
                DatabaseUtil.closeConnection(conn);
            }
        }
    }
  public static List<String> selectCatSettingsIdsForGivenConditions(String selectQuery) throws SQLException {
        PreparedStatement preparedStatement = null;
        List<String> cateSettingsIds = new ArrayList<>();
        try {
            conn = DatabaseUtil.getConnection();
            preparedStatement = conn.prepareStatement(selectQuery);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
                categorySettingId = rs.getString("item_category_settings_id");
                cateSettingsIds.add(categorySettingId);
            }
        } catch (SQLException e) {
            LoggerUtil.logERROR(logErrorMessage, e);
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (conn != null) {
                DatabaseUtil.closeConnection(conn);
            }
        }
        return cateSettingsIds;
    }
    public static List<String> getCategorySettingMarginData(String selectQuery) throws SQLException {
        PreparedStatement preparedStatement = null;
        List<String> categorySettingDataList = new ArrayList<>();
        categorySettingDataList.clear();

        try {
            conn = DatabaseUtil.getConnection();
            preparedStatement = conn.prepareStatement(selectQuery);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                categorySettingDataList.add(rs.getString("current_approve_threshold"));
                categorySettingDataList.add(rs.getString("current_reject_threshold"));
                categorySettingDataList.add(rs.getString("notes"));
                categorySettingDataList.add(rs.getString("margin"));
                categorySettingDataList.add(rs.getString("item_category_type"));
                categorySettingDataList.add(rs.getString("renew_margin"));
                categorySettingDataList.add(rs.getString("modified_by"));
                categorySettingDataList.add(rs.getString("price_zone"));
                categorySettingDataList.add(rs.getString("status"));

            }
        } catch (SQLException e) {
            LoggerUtil.logERROR(logErrorMessage, e);
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (conn != null) {
                DatabaseUtil.closeConnection(conn);
            }
        }
        return categorySettingDataList;
    }

    public static void getItemDbRecord(String selectQuery) throws SQLException {
        PreparedStatement preparedStatement = null;
        try {
            conn = DatabaseUtil.getConnection();
            preparedStatement = conn.prepareStatement(selectQuery);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                minorCategoryId = rs.getInt("minor_category_id");
                interCategoryId = rs.getInt("intermediate_category_id");
                majorCategoryId = rs.getInt("major_category_id");
                categoryId = rs.getString("category_id");
                itemId = rs.getString("item_id");
            }
        } catch (SQLException e) {
            LoggerUtil.logERROR(logErrorMessage, e);
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (conn != null) {
                DatabaseUtil.closeConnection(conn);
            }
        }
    }

    public static void getCustGroupDetails(String selectQuery, boolean isGroup) throws SQLException {
        PreparedStatement preparedStatement = null;
        try {
            conn = DatabaseUtil.getConnection();
            preparedStatement = conn.prepareStatement(selectQuery);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                customerId = rs.getString("customer_id");
                customerSyscoId = rs.getString("customer_sysco_id");
                if (isGroup) {
                    groupId = rs.getString("group_id");
                }
            }
        } catch (SQLException e) {
            LoggerUtil.logERROR(logErrorMessage, e);
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (conn != null) {
                DatabaseUtil.closeConnection(conn);
            }
        }
    }

    public static String getItemSettingId(String selectQuery) throws SQLException {
        String itemSettingId = null;
        PreparedStatement preparedStatement = null;
        try {
            conn = DatabaseUtil.getConnection();
            preparedStatement = conn.prepareStatement(selectQuery);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                itemSettingId = rs.getString("item_settings_id");
            }
        } catch (SQLException e) {
            LoggerUtil.logERROR(logErrorMessage, e);
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (conn != null) {
                DatabaseUtil.closeConnection(conn);
            }
        }
        return itemSettingId;
    }

    public static List<String> getItemCategoryMinorMajorIntermediateIDS(String selectQuery) throws SQLException {
        PreparedStatement preparedStatement = null;
        List<String> categoryIDList = new ArrayList<>();
        categoryIDList.clear();
        try {
            conn = DatabaseUtil.getConnection();
            preparedStatement = conn.prepareStatement(selectQuery);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                categoryIDList.add(rs.getString("category_id"));
                categoryIDList.add(rs.getString("major_category_id"));
                categoryIDList.add(rs.getString("intermediate_category_id"));
                categoryIDList.add(rs.getString("minor_category_id"));
            }
        } catch (SQLException e) {
            LoggerUtil.logERROR(logErrorMessage, e);
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (conn != null) {
                DatabaseUtil.closeConnection(conn);
            }
        }
        return  categoryIDList;
    }
}

