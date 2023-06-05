package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Conn {
    Statement ejecutor = null; //declaración de sql statement
    PreparedStatement preparar = null;
    /*Declaración de variables de conexión */
    Connection conn;
    String driver = "com.mysql.cj.jdbc.Driver";
    String user = "root";
    String pass = "";
    String url = "jdbc:mysql://"
            + "/game?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

    public void getConnection() throws SQLException {
        conn = null;
        try {
            Class.forName(driver);
            conn = (Connection) DriverManager.getConnection(url, user, pass);
            if (conn != null) {
                System.out.println("Conexión exitosa");
                //JOptionPane.showMessageDialog(null, "Conexión exitosa");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No funcionó la conexión");
            e.printStackTrace();
        } 
    }
}
