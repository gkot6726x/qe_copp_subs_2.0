package com.sysco.qe.subs.util;

import com.syscolab.qe.core.common.LoggerUtil;

import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseUtil {
    private static PropertyFileReader propertyFileReader = new PropertyFileReader();
    private static String fileName = "config";
    private static String dbEndpoint = propertyFileReader.getProperty(fileName, "dbEndpoint");
    private static String dbUser = propertyFileReader.getProperty(fileName, "dbUser");
    private static String dbPassword = propertyFileReader.getProperty(fileName, "dbPassword");
    private static String logErrorMessage = "Error";

    private DatabaseUtil() {
    }

    public static Connection getConnection() throws SQLException {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(dbEndpoint, dbUser, EncryptData.decrypt(dbPassword));
        } catch (UnsupportedEncodingException e) {
            LoggerUtil.logERROR(logErrorMessage, e);
        }
        return conn;
    }

    public static void closeConnection(Connection connection) throws SQLException {
        connection.close();
    }

    public static int updateQuery(String updateQuery) {
        int noOfUpdatedRows = -1;

        try (Connection conn = DriverManager.getConnection(dbEndpoint, dbUser, EncryptData.decrypt(dbPassword));
             PreparedStatement preparedStatement = conn.prepareStatement(updateQuery)) {

            noOfUpdatedRows = preparedStatement.executeUpdate();
        } catch (Exception e) {
            LoggerUtil.logERROR(logErrorMessage, e);
        }
        return noOfUpdatedRows;
    }
}
