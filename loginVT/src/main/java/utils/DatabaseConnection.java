package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/logindb";
    private static final String USER = "root"; // Cambia esto si tu usuario de MySQL es diferente
    private static final String PASSWORD = ""; // Añade tu contraseña de MySQL

   public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    // Método de prueba
    public static void main(String[] args) {
        Connection conn = getConnection();
        if (conn != null) {
            System.out.println("Conexión exitosa!");
        } else {
            System.out.println("Fallo en la conexión.");
        }
    }
}
