package util;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DBConnection {

    private static Connection connection;

    public static Connection getConnection() {
        try {
            if (connection == null) {
                Properties props = new Properties();
                FileInputStream fis = new FileInputStream("src/resources/dbconfig.properties");
                props.load(fis);

                Class.forName(props.getProperty("db.driver"));

                connection = DriverManager.getConnection(
                        props.getProperty("db.url"),
                        props.getProperty("db.username"),
                        props.getProperty("db.password")
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
}
