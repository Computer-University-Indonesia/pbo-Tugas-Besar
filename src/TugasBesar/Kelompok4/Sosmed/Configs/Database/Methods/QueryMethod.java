/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasBesar.Kelompok4.Sosmed.Configs.Database.Methods;

import TugasBesar.Kelompok4.Sosmed.Configs.Database.Database;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Stack;

/**
 *
 * @author sahanya
 */
public class QueryMethod extends Database {
     public Stack query(String query){
           Stack<Stack> result = new Stack<>();
        try {
            ResultSet resultSql = this.sqlStatement.executeQuery(query);
            ResultSetMetaData meta = resultSql.getMetaData();
            while (resultSql.next()) {
                Stack<String> collumns = new Stack<>();
                for (int i = 1; i <= meta.getColumnCount(); i++) {
                    String name = meta.getColumnName(i);
                    collumns.push(resultSql.getString(name));
                }
                result.push(collumns);
            }
        } catch (SQLException e) {
            System.out.println("Sql Exception Get All : " + e.getMessage());
        } catch (Exception e) {
            System.out.println("GetAll Method Error : " + e.getMessage());
        }
        return result;
     }
}
