/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasBesar.Kelompok4.Sosmed.Controllers;

import TugasBesar.Kelompok4.Sosmed.Constants.Authentication;
import TugasBesar.Kelompok4.Sosmed.Models.CommentModel;
import java.util.Stack;
import javax.swing.JOptionPane;

/**
 *
 * @author FRZ
 */
public class CommentController {
    
    CommentModel model = new CommentModel();
    
    public void store(String[] value){
        String post_id = value[0];
        String comment = value[1];
        String user_id = Authentication.getId();
        String[] inputs = {post_id, comment,user_id};
        if(comment.length() ==0){
            JOptionPane.showMessageDialog(null, "Isi Field Comment Terlebih Dahulu!");
        }else{
            model.create(inputs);   
        }
    }
    
    public Stack getDetail(String id ){
        Stack<Stack> result = model.getWithUserWhere(id);
        System.out.println(result);
        return result;
    }
    
}
