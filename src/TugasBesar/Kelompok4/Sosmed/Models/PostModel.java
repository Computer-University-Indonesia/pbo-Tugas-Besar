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
public class PostModel extends Model {

    public PostModel() {
        super.getDatabase().setTable("posts");
    }

    @Override
    public void create(String[] values) {
        super.getDatabase().create("title,description,user_id,created_at", values);
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(String set, String where) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Stack getAll() {
        return super.getDatabase().GetAll();
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String where) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public Stack GetPostAndUsers(){
    Stack<Stack>Get=super.getDatabase().getAllUseQuery("SELECT posts.title,users.name,posts.description FROM posts JOIN users ON posts.user_id=users.id");
    return Get;
    
 }
}
