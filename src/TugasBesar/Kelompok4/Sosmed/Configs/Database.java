/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasBesar.Kelompok4.Sosmed.Configs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.*;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author br4nchs
 */
public class Database {

    private static Connection sqlConnection;
    protected String table;

    public void setTable(String table) {
        this.table = table;
    }
//    create connection

    public Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Database.sqlConnection = DriverManager.getConnection("jdbc:mysql://mysql-84931-0.cloudclusters.net:17020/sosmed", "admin", "HKZpzPnX");
            System.out.println("[Database] connected to Database sosmed");
        } catch (SQLException e) {
            System.out.println("Sql Exception : " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Connection error : " + e.getMessage());
        }
        return Database.sqlConnection;
    }
    public void closeConnection(){
        
        try {
            Database.sqlConnection.close();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public Stack ExecuteQuery(String query) {
        Stack<Stack> result = new Stack<>();
        Statement statement = null;
        try {
            Database.sqlConnection.setAutoCommit(false);
            statement = Database.sqlConnection.createStatement();
            ResultSet resultSql = statement.executeQuery(query);
            Database.sqlConnection.commit();
            ResultSetMetaData meta = resultSql.getMetaData();
            while (resultSql.next()) {
                Stack<String> collumns = new Stack<>();
                for (int i = 1; i <= meta.getColumnCount(); i++) {
                    String name = meta.getColumnLabel(i);
                    collumns.push(resultSql.getString(name));
                }
                result.push(collumns);
            }
            System.out.println("Success : [DATABASE] " + query);

        } catch (SQLException e) {
            try {
                Database.sqlConnection.rollback();
            } catch (SQLException ex) {
                Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Sql Exception Get : " + e.getMessage());
        }catch(NullPointerException e){
            e.getStackTrace();
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println("GetAll Method Error : " + e.getMessage());
        } finally {
            try {
                Database.sqlConnection.setAutoCommit(true);
                if (statement != null) {

                    statement.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return result;
    }

    public Boolean ExecuteUpdate(String query) {
        PreparedStatement statement = null;
        try {
            sqlConnection.setAutoCommit(false);
            statement = sqlConnection.prepareStatement(query);
            statement.executeUpdate();
            sqlConnection.commit();
            return true;
        } catch (SQLException e) {
            System.out.println("SQL Exxception : " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Create Method : " + e.getMessage());
        } finally {
            try {
                sqlConnection.setAutoCommit(true);
            } catch (SQLException ex) {
                Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
                    System.out.println("sql Exceition : " + ex.getMessage());
                }
            }
        }
        return false;
    }

    public Stack GetAll() {

        return this.ExecuteQuery("SELECT * FROM " + this.table);
    }

    public Stack GetDetail(String where) {
        return this.ExecuteQuery("SELECT * FROM " + this.table + " WHERE " + where);
    }

    public Boolean create(String fields, String[] values) {

        String valueSql = "";
        for (String value : values) {
            valueSql += "'" + value + "' ,";
        }
        StringBuffer valueSqlRemoved = new StringBuffer(valueSql);
        valueSqlRemoved.deleteCharAt(valueSql.length() - 1);
        String sql = "INSERT INTO " + this.table + "(" + fields + ") VALUES(" + valueSqlRemoved + ")";
        return this.ExecuteUpdate(sql);

    }

    public Boolean update(String set, String where) {
        String sql = "UPDATE " + table + " SET " + set + " WHERE " + where;
        return this.ExecuteUpdate(sql);
    }

    public Boolean delete(String where) {
        return this.ExecuteUpdate("DELETE FROM " + table + " WHERE " + where);
    }

    public Stack getAllUseQuery(String query) {

        return this.ExecuteQuery(query);

    }
}
