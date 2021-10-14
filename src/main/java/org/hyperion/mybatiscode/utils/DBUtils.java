package org.hyperion.mybatiscode.utils;

import org.hyperion.mybatiscode.model.Db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {
    private static Connection connection;

    public static Connection getConnection(){
        return connection;
    }

    public static Connection initDb(Db db){
        if (connection == null){
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection(db.getUrl(), db.getUsername(), db.getPassword());
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
}
