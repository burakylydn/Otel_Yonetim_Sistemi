/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelmanagementsystem;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Ceyda
 */
public class db {
    public static Connection connect_db () {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection conn=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\1bura\\Desktop\\HotelManagementSystem\\HMSdb.sqlite");
            return conn;
        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex);
            return null;
        }
    }
}
