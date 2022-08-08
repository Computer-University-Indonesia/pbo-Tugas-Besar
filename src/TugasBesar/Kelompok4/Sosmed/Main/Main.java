/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasBesar.Kelompok4.Sosmed.Main;

import TugasBesar.Kelompok4.Sosmed.Configs.Database;
import TugasBesar.Kelompok4.Sosmed.Views.LoginView;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.scripts.JO;

/**
 *
 * @author sahanya
 */
public class Main {

    public static void main(String[] args) {
        try {
            Connection database = new Database().getConnection();

            JFrame mainFrame = new LoginView();
            mainFrame.setVisible(true);
        } catch (SQLException ex) {
            String errorMessage = ex.getMessage();
            int isOk = JOptionPane.showConfirmDialog(null, "Pastikan Koneksi Anda Tersambung ke internet");
            if (isOk == 0) {
                Main.main(args);

            }
            System.out.println("SQL ERRROR : " + errorMessage);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
