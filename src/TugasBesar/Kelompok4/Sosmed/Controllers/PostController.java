/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasBesar.Kelompok4.Sosmed.Controllers;

import TugasBesar.Kelompok4.Sosmed.Models.PostModel;
import java.util.Stack;

/**
 *
 * @author sahanya
 */
public class PostController {
    PostModel model = new PostModel();
    public Stack get(){
        Stack<Stack> result = model.getWithUser();
        return result;
    }
}
