/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package databases;
import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.ResultSet;
/**
 *
 * @author adam
 */
public class databasematakuliah {
    
    static String jdbc_driver ="com.mysql.cj.jdbc.Driver";
    static String url ="jdbc:mysql://localhost:3306/Mata_kuliah";
    static String user="root";
    static String pass="adamsjr123";
    static Connection conn;
    
    static ResultSet rs;
    
    public static Connection connectDatabaseMatkul(){
        try{
            Class.forName(jdbc_driver);
        }catch(ClassNotFoundException cnf){
            
        }try{
            conn=(Connection) DriverManager.getConnection(url,user,pass);
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Koneksi Database Gagal");
             System.out.println("Koneksi Gagal" + e.getMessage());
        }catch(HeadlessException e){
            
        }
        return conn;
    }
    
    
}
