/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasBesar.Kelompok4.Sosmed.Configs;

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
    protected String table;

    public void setTable(String table) {
        this.table = table;
    }
//    create connection

    public Database() {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            this.sqlConnection = DriverManager.getConnection("jdbc:mysql://localhost/sosmed", "root", "");
            this.sqlStatement = this.sqlConnection.createStatement();
            System.out.println("[Database] connected to Database sosmed");
        } catch (SQLException e) {
            System.out.println("Sql Exception : " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Connection error : " + e.getMessage());
        }
    }

    public Stack GetAll() {
        Stack<Stack> result = new Stack<>();
        try {
            ResultSet resultSql = this.sqlStatement.executeQuery("SELECT * FROM " + this.table);
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

    public Stack GetDetail(String where) {
        Stack<Stack> result = new Stack<>();
        try {
            String sql = "SELECT * FROM " + this.table + " WHERE " + where;
            ResultSet resultSql = this.sqlStatement.executeQuery(sql);
            ResultSetMetaData meta = resultSql.getMetaData();
            while (resultSql.next()) {
                Stack<String> collumns = new Stack<>();
                for (int i = 1; i <= meta.getColumnCount(); i++) {
                    String name = meta.getColumnName(i);
                    collumns.push(resultSql.getString(name));
                }
                result.push(collumns);
            }
            System.out.println("Success : [Database] " + sql);

            return result;
        } catch (SQLException e) {
            System.out.println("SQL Exception : " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Get Detail : " + e.getMessage());
        }
        return result;
    }

    public Boolean create(String fields, String[] values) {
        try {
            String valueSql = "";
            for (String value : values) {
                valueSql += "'" + value + "' ,";
            }
            StringBuffer valueSqlRemoved = new StringBuffer(valueSql);
            valueSqlRemoved.deleteCharAt(valueSql.length() - 1);

            int isCreated = this.sqlStatement.executeUpdate("INSERT INTO " + this.table + "(" + fields + ") VALUES(" + valueSqlRemoved + ")");
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

    public Boolean update(String set, String where) {
        try {
            int isCreated = this.sqlStatement.executeUpdate("UPDATE INTO " + table + "SET " + set + " WHERE " + where);
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

    public Boolean delete(String where) {
        try {
            int isCreated = this.sqlStatement.executeUpdate("DELETE FROM" + table + " WHERE " + where);
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

    public Stack getAllUseQuery(String query){
         Stack<Stack> result = new Stack<>();
        try {
            ResultSet resultSql = this.sqlStatement.executeQuery(query);
            ResultSetMetaData meta = resultSql.getMetaData();
            while (resultSql.next()) {
                Stack<String> collumn = new Stack<>();
                for (int i = 1; i <= meta.getColumnCount(); i++) {
                    String name = meta.getColumnLabel(i);
//                    System.out.println(meta.getColumnLabel(i));
                    collumn.push(resultSql.getString(name));
                }
                result.push(collumn);
            }
        } catch (SQLException e) {
            System.out.println("Sql Exception Get All Join: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("GetAll Method Error : " + e.getMessage());
        }
        return result;
    }
}
