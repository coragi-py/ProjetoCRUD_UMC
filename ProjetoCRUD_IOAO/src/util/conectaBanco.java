package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Fabio Saruwataru
 */


public class conectaBanco {
    
    public static Connection getConexao() throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");
        String URL = "jdbc:mysql://localhost:3306/db_crud";
        String USER = "root";
        String PASSWORD = "root";
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
    
}

