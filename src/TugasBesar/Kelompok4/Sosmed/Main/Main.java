/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasBesar.Kelompok4.Sosmed.Main;

import TugasBesar.Kelompok4.Sosmed.Configs.Database;
import TugasBesar.Kelompok4.Sosmed.Views.LoginView;
import javax.swing.JFrame;

/**
 *
 * @author sahanya
 */
public class Main {
    public static void main(String[] args){
        new Database().getConnection();
        JFrame mainFrame = new LoginView();
        mainFrame.setVisible(true);
        
    }
}
