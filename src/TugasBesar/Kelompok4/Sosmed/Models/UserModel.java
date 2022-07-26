/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasBesar.Kelompok4.Sosmed.Models;

import java.util.Stack;




/**
 *
 * @author sahanya
 */
public class UserModel  extends Model{
    public UserModel(){
     super.getDatabase().setTable("users");   
    }
    public Stack getWhere(String where){
        return super.getDatabase().GetDetail(where);
    }
    public Stack getUserWithRoleWhere(String where){
        return super.getDatabase()
                .getAllUseQuery("SELECT users.id as user_id,users.name AS name,roles.name AS user_role,username,password "
                        + "FROM users JOIN roles ON users.role_id = roles.id WHERE "+where);
        
    }
    @Override
    public void create(String[] values) {
//        {"AS","ASD","PASSWORD"}
        super.getDatabase().create("name,username,password,role_id", values);
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(String set, String where) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Stack getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String where) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
