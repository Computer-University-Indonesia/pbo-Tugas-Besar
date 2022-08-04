/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasBesar.Kelompok4.Sosmed.Models;

import java.time.LocalDate;
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
        super.getDatabase().create("title,description,user_id,created_at",values);
    }

    @Override
    public void update(String set, String where) {
        super.getDatabase().update(set, where);
        
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Stack getAll() {
        return super.getDatabase().GetAll();
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Stack getWithUser() {
         return super.getDatabase()
                .getAllUseQuery("SELECT users.name AS name,title,description,created_at,posts.id as post_id,like_count "
                        + "FROM posts JOIN users ON posts.user_id = users.id ORDER BY post_id DESC");

    }
     public Stack getWithUserWhere(String id ) {
         return super.getDatabase()
                .getAllUseQuery("SELECT users.name AS name,title,description,created_at,posts.id as post_id,like_count "
                        + "FROM posts JOIN users ON posts.user_id = users.id  "
                        + "WHERE posts.id='"+id+"'");

    }

    @Override
    public void delete(String where) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
