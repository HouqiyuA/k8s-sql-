package com.example.ebpfweb.DBUtil;

import java.sql.*;

public class DBUtil {
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        /*加载驱动*/
        Class.forName("com.mysql.jdbc.Driver");

        /*创建连接*/
        Connection connection= DriverManager.getConnection("jdbc:mysql://192.168.29.146:41101/info","root","password");
        System.out.println("创建连接成功");
        return connection;
    }
    public static void closeAll(ResultSet resultSet, PreparedStatement statement, Connection connection) throws SQLException {

        if (resultSet!=null){
            resultSet.close();
        }
        if (statement!=null){
            statement.close();
        }
        if (connection!=null){
            connection.close();
        }
        System.out.println("所有连接关闭成功");
    }
}
