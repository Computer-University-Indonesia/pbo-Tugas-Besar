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
public class CreateMethod extends Database {
      public Boolean create(String table, String fields, String[] values) {
        try {
            String valueSql = "";
            for (String value : values) {
                valueSql += "'"+value + "' ,";
            }
            StringBuffer valueSqlRemoved = new StringBuffer(valueSql);
            valueSqlRemoved.deleteCharAt(valueSql.length()-1);
            
            int isCreated = super.sqlStatement.executeUpdate("INSERT INTO " + table + "(" + fields + ") VALUES("+ valueSqlRemoved +")");
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
