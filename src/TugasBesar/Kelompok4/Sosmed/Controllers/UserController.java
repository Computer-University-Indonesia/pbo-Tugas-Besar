/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasBesar.Kelompok4.Sosmed.Controllers;

import TugasBesar.Kelompok4.Sosmed.Configs.Database.Database;
import java.util.Stack;

/**
 *
 * @author sahanya
 */
public class UserController {

    Database db;

    UserController() {
        db = new Database();
    }

    public void login() {
//          Stack<Stack> users = db.GetAllJoin("users","roles","role_id","id",
//                  "users.id as user_id, users.name AS user_name,roles.id AS role_id,roles.name AS role_name");
//Stack<Stack> users = db.GetDetail("users","id = 1" );
        String[] values = {"baktot", "baktot123", "anjing", "2"};
        db.create("users", "name,username,password,role_id", values);
//          System.out.println(users);
    }

    public static void main(String[] args) {
        UserController controller = new UserController();

        controller.login();
    }
}
