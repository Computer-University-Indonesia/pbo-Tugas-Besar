package TugasBesar.Kelompok4.Sosmed.Models;

import TugasBesar.Kelompok4.Sosmed.Configs.Database;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sahanya
 */
public abstract class Model {
    Database database;
    Model(){
        database = new Database();
    }
    protected Database getDatabase(){
        return this.database;
    }
    abstract public void create(String[] values);

    abstract public void update(String set,String where);

    abstract public void getAll();

    abstract public void delete(String where);

}
