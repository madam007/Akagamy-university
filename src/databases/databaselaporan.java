/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package databases;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author adam
 */
public class databaselaporan {
    static String jdbc_driver ="com.mysql.cj.jdbc.Driver";
    static String url ="jdbc:mysql://localhost:3306/Data_laporan";
    static String user="root";
    static String pass="adamsjr123";
    static Connection laporan;
    
    static ResultSet rs;
    
    public static Connection connectDatabaseLaporan(){
        try{
            Class.forName(jdbc_driver);
        }catch(ClassNotFoundException cnf){
            
        }try{
            laporan=(Connection) DriverManager.getConnection(url,user,pass);
            JOptionPane.showMessageDialog(null, "Koneksi Database Laporan berhasil");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Koneksi Database Laporan Gagal");
             System.out.println("Koneksi Gagal" + e.getMessage());
        }catch(HeadlessException e){
            
        }
        return laporan;
    }
    
    
}
