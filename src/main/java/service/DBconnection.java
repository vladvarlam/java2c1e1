package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {


    private static final String JDBC_URL = "jdbc:mysql://localhost/java2c1e1";
        private static final String USER = "root";
        private static final String PASSWORD = "";

        public static final Connection getConnection() throws SQLException {
            return DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
        }
    }
//    private static DBconnection instance;
//    private DBconnection(){
//        final String JDBC_URL = "jdbc:mysql://localhost/java2c1e1";
//        final String USER = "root";
//        final String PASSWORD = "";
//        try {
//            DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    public static DBconnection getInstance() {
//        return instance=new DBconnection();
//    }

