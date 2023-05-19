package edu.shnaiderman.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBManager {
    private static Connection DbConnection;
    private DBManager() {}
    public static Connection getDbConnection() throws SQLException {
        if (DbConnection == null) {
            DbConnection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/postgres",
                    "aslmn",
                    "12345"
            );
        }
        return DbConnection;
    }
}