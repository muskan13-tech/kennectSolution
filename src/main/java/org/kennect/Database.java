package org.kennect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private static Connection connection;

    // Connect to the SQLite database
    public static Connection connect() {
        if (connection == null) {
            try {
                Class.forName("org.sqlite.JDBC");
                connection = DriverManager.getConnection("jdbc:sqlite:appointment_system.db");
                System.out.println("Connected to the database.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return connection;
    }

    // Disconnect from the database
    public static void disconnect() {
        try {
            if (connection != null) {
                connection.close();
                System.out.println("Disconnected from the database.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

