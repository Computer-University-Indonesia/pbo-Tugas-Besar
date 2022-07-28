/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasBesar.Kelompok4.Sosmed.Controllers;

import TugasBesar.Kelompok4.Sosmed.Constants.Authentication;
import TugasBesar.Kelompok4.Sosmed.Models.PostModel;
import java.util.Stack;
import javax.swing.JOptionPane;

/**
 *
 * @author sahanya
 */
public class PostController {

    PostModel model = new PostModel();

    public Stack get() {
        Stack<Stack> result = model.getWithUser();
        return result;
    }

    public void store(String[] inputs) {
        String title = inputs[0];
        String desc = inputs[1];
        String now = String.valueOf(java.time.LocalDate.now());
        String[] values = {title,desc,Authentication.getId(),now};
        model.create(values);
        JOptionPane.showMessageDialog(null, "berhasil menambahkan post");
    }
}
