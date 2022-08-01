/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasBesar.Kelompok4.Sosmed.Controllers;

import TugasBesar.Kelompok4.Sosmed.Models.UserModel;
import java.util.Stack;
import javax.swing.JOptionPane;
import TugasBesar.Kelompok4.Sosmed.Constants.Authentication;

/**
 *
 * @author sahanya
 */
public class AuthController {

    UserModel model = new UserModel();

    public String login(String username, String password) {
        if (username.length() == 0 || password.length() == 0) {
            JOptionPane.showMessageDialog(null, "Masukan Username/ password");
        }
        Stack<Stack> result = model.getUserWithRoleWhere("username = '" + username + "' AND password='" + password + "'");
        if (result.empty()) {
            JOptionPane.showMessageDialog(null, "Username / Password Salah");
        } else {
            Stack<String> user = result.get(0);
            Authentication.setId(user.get(0));
            Authentication.setName(user.get(1));
            Authentication.setRole(user.get(2));
            Authentication.setUsername(user.get(3));

            return user.get(2);
        }
        return "";
//        System.out.println(result);
    }

    public Boolean register(String[] inputs) {
        if (inputs[0].length() == 0 || inputs[1].length() == 0 || inputs[2].length() == 0 || inputs[3].length() == 0) {
            JOptionPane.showMessageDialog(null, "masukan input dengan benar");
            return false;
        };
        System.out.println(inputs[2]);
        System.out.println(inputs[3]);
        if (!inputs[2].equals(inputs[3])) {
            JOptionPane.showMessageDialog(null, "password dan repassword tidakk sesuai");
            return false;
        }
        Stack<Stack> user = model.getWhere("username='" + inputs[1] + "'");
        if (!user.empty()) {
            JOptionPane.showMessageDialog(null, "Username sudah terdaftar, masukan username lain");
            return false;
        }
        String[] userInput = {inputs[0], inputs[1], inputs[2], "2"};
        model.create(userInput);
        return true;
    }
    public Boolean forgetPassword(String[] inputs){
        Stack<Stack> user = model.getWhere("name='"+inputs[0]+"' AND username ='"+inputs[1]+"'");
        System.out.println(user);
        if(user.empty()){
            JOptionPane.showMessageDialog(null, "Nama / Username Salah");
            return false;
        }else{
            model.update("password = '"+inputs[2]+"'", "id="+user.get(0).get(0));
        }
        return true;
    }
}
