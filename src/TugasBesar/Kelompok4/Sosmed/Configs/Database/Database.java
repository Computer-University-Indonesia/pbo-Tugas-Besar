/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasBesar.Kelompok4.Sosmed.Configs.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.*;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

/**
 *
 * @author br4nchs
 */
public class Database {

    private Connection sqlConnection;
    protected Statement sqlStatement;
    public Database() {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            this.sqlConnection = DriverManager.getConnection("jdbc:mysql://localhost/sosmed", "root", "");
            this.sqlStatement = this.sqlConnection.createStatement();
            
        } catch (SQLException e) {
            System.out.println("Sql Exception : " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Connection error : " + e.getMessage());
        }
    }

    public Stack GetAll(String table) {
        Stack<Stack> result = new Stack<>();
        try {
            ResultSet resultSql = this.sqlStatement.executeQuery("SELECT * FROM " + table);
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

//    public Stack GetAllJoin(String table1, String table2, String forignKey, String primaryKey , String collumns) {
//        Stack<Stack> result = new Stack<>();
//        try {
//            ResultSet resultSql = this.sqlStatement.executeQuery(
//                    "SELECT " + collumns + " FROM " + table1
//                    + " JOIN " + table2 + " ON " + table1 + "." + forignKey + " = " + table2 + "." + primaryKey
//            );
//            ResultSetMetaData meta = resultSql.getMetaData();
//            while (resultSql.next()) {
//                Stack<String> collumn = new Stack<>();
//                for (int i = 1; i <= meta.getColumnCount(); i++) {
//                    String name = meta.getColumnLabel(i);
////                    System.out.println(meta.getColumnLabel(i));
//                    collumn.push(resultSql.getString(name));
//                }
//                result.push(collumn);
//            }
//        } catch (SQLException e) {
//            System.out.println("Sql Exception Get All Join: " + e.getMessage());
//        } catch (Exception e) {
//            System.out.println("GetAll Method Error : " + e.getMessage());
//        }
//        return result;
//    }

    public Stack GetDetail(String table, String where) {
        Stack<String> result = new Stack<>();
        try {
            ResultSet resultSql = this.sqlStatement.executeQuery("SELECT * FROM " + table + " WHERE " + where);
            ResultSetMetaData meta = resultSql.getMetaData();
            for (int i = 1; i <= meta.getColumnCount(); i++) {
                String name = meta.getColumnName(i);
                result.push(resultSql.getString(name));
            }
        } catch (SQLException e) {
            System.out.println("SQL Exception : " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Get Detail : " + e.getMessage());
        }
        return result;
    }

  
    public Boolean update(String table,String set,String where){
         try {
            int isCreated = this.sqlStatement.executeUpdate("UPDATE INTO " + table + "SET "+set +" WHERE "+where);
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
    public Boolean delete(String table, String where){
          try {
            int isCreated = this.sqlStatement.executeUpdate("DELETE FROM" + table  +" WHERE "+where);
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
