package com.sysco.qe.subs.data.category_setting;

import com.sysco.qe.subs.util.DatabaseUtil;
import com.syscolab.qe.core.common.LoggerUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ViewCategorySettingDAOFunction {
    private ViewCategorySettingDAOFunction() {
    }

    private static Connection conn;
    private static ResultSet rs;
    private static String logErrorMessage = "Error";

    public static String getItemCategoryData(String selectQuery) throws SQLException {
        String itemCategoryData = null;

        PreparedStatement preparedStatement = null;
        try {
            conn = DatabaseUtil.getConnection();
            preparedStatement = conn.prepareStatement(selectQuery);
            rs = preparedStatement.executeQuery();
            while (rs.next()) {
                itemCategoryData = rs.getString(1);

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
        return itemCategoryData;
    }
}
