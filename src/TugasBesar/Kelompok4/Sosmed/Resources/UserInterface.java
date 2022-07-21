/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasBesar.Kelompok4.Sosmed.Resources;

import TugasBesar.Kelompok4.Sosmed.Configs.Database.Database;
import TugasBesar.Kelompok4.Sosmed.Configs.Database.Methods.*;

/**
 *
 * @author sahanya
 */
public interface UserInterface {

   
    public String table="users";
    public void getAll(GetAllMethod get);
    public void create(CreateMethod create);
    public void update(UpdateMethod update);
    public void delete(DeleteMethod delete);
    
}
