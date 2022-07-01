package com.project1;

import java.sql.*;

/**
 * @author wangyc
 * @version 1.11
 * @description
 * @data 2022/7/1 16:01
 */
public class MysqlUtil {
    private static Connection connection;
    private static Statement statement;
    private static ResultSet rs;

    public static Connection getConnection() throws Exception {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/test";
            String user = "root";
            String password = "root";
            Connection connection = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            return connection;
        }
    }
    public static void close() throws SQLException {
        if(rs != null) {
            rs.close();
        }
        if(statement != null) {
            statement.close();
        }
        if(connection != null) {
            connection.close();
        }
    }
}
