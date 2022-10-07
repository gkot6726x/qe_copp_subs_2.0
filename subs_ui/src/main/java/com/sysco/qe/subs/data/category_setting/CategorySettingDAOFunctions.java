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
    private static double margin;


    public static double getMargin() {
        return margin;
    }

    public static void setMargin(double margin) {
        CategorySettingDAOFunctions.margin = margin;
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

    }


