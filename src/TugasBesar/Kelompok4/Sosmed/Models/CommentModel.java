/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasBesar.Kelompok4.Sosmed.Models;

import java.util.Stack;

/**
 *
 * @author FRZ
 */
public class CommentModel extends Model{

    public CommentModel(){
        super.getDatabase().setTable("comments");
    }
    @Override
    public void create(String[] values) {
        super.getDatabase().create("post_id, comment, user_id", values);
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
    
    public Stack getWithUserWhere(String id){
        return super.getDatabase().getAllUseQuery("SELECT comments.post_id,users.username,comments.comment FROM comments JOIN users "
                + "ON comments.user_id = users.id JOIN posts "
                + "ON comments.post_id = posts.id WHERE post_id = "+id);
    }
}
