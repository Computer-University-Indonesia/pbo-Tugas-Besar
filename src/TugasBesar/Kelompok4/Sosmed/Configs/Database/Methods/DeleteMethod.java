/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasBesar.Kelompok4.Sosmed.Configs.Database.Methods;

import TugasBesar.Kelompok4.Sosmed.Configs.Database.Database;
import java.sql.SQLException;

/**
 *
 * @author sahanya
 */
public class DeleteMethod extends Database {
    
    public Boolean delete(String table, String where){
          try {
            int isCreated = super.sqlStatement.executeUpdate("DELETE FROM" + table  +" WHERE "+where);
            if (isCreated <= 0) {
                return false;
            }
        } catch (SQLException e) {
            System.out.println("SQL Exxception : " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Create Method : " + e.getMessage());
        }
        return true;
    }
}
