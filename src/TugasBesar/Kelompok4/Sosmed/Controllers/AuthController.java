/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasBesar.Kelompok4.Sosmed.Controllers;

import TugasBesar.Kelompok4.Sosmed.Models.Model;
import TugasBesar.Kelompok4.Sosmed.Models.UserModel;
import java.util.Stack;
import javax.swing.JOptionPane;

/**
 *
 * @author sahanya
 */
public class AuthController {

    UserModel model = new UserModel();

    public void login(String username, String password) {
        if (username.length() == 0 || password.length() == 0) {
            JOptionPane.showMessageDialog(null, "Masukan Username/ password");
        }
        Stack<Stack> result = model.getUserWithRoleWhere("username = '" + username + "' AND password='" + password + "'");
        if (result.empty()) {
            JOptionPane.showMessageDialog(null, "Username / Password Salah");
        } else {
            Stack<String> user = result.get(0);
            if ("admin".equals(user.get(1))) {
//                admin
                JOptionPane.showMessageDialog(null, "Monyet sia UPI");
            } else {
//                user  
                JOptionPane.showMessageDialog(null, "Selamat datang Fariz ganteng");
            }
        }

        System.out.println(result);
    }
}
