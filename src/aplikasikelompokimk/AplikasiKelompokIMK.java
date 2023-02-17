/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplikasikelompokimk;

import javax.swing.JOptionPane;

/**
 *
 * @author adam
 */
public class AplikasiKelompokIMK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         /* Create and display the form */
         try{
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new logInMenu().setVisible(true);

            }
        });
         }catch(Exception e){
           JOptionPane.showMessageDialog(null, "aplikasi crash", "error crash", JOptionPane.ERROR_MESSAGE);

         }
    }
    
}
