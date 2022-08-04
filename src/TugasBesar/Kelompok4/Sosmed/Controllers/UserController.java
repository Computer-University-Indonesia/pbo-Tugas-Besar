/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasBesar.Kelompok4.Sosmed.Controllers;

import TugasBesar.Kelompok4.Sosmed.Models.UserModel;
import java.util.Stack;

/**
 *
 * @author Muhammad Sabilil
 */
public class UserController {
    
    UserModel model = new UserModel();
    
    public Stack Get(){
        Stack<Stack> User = model.getUserWithRole();
        return User;
    }
    
}
