package utils;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DBConnection {
    public Connection getDBConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        FileReader fr = new FileReader("database.login.properties");
        Properties property = new Properties();
        property.load(fr);
        Connection con = DriverManager.getConnection(property.getProperty("sampledb_url") , property.getProperty("userName_sql"), property.getProperty("password_sql"));
        return con;
    }
}
