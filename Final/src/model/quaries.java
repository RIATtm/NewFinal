/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import control.DBConnection;
import java.sql.ResultSet;

/**
 *
 * @author AT
 */
public class quaries {

    public static void autosave(String table, String field[]) throws Exception {
        DBConnection.setConnection().createStatement().executeUpdate("INSERT INTO " + table + " VALUES('" + field[0] + "','" + field[1] + "','" + field[2] + "','" + field[3] + "','" + field[4] + "','" + field[5] + "','" + field[6] + "','" + field[7] + "','" + field[8] + "','" + field[9] + "','" + field[10] + "')");


    }

    public static void waitersave(String table, String field[]) throws Exception {
        DBConnection.setConnection().createStatement().executeUpdate("insert into " + table + " values ('" + field[0] + "','" + field[1] + "','" + field[2] + "','" + field[3] + "','" + field[4] + "','" + field[5] + "','" + field[6] + "','" + field[7] + "')");


    }

    public static void supsave(String table, String field[]) throws Exception {
        DBConnection.setConnection().createStatement().executeUpdate("insert into " + table + " values ('" + field[0] + "','" + field[1] + "','" + field[2] + "','" + field[3] + "','" + field[4] + "','" + field[5] + "','" + field[6] + "','" + field[7] + "','" + field[8] + "')");


    }
    public static void searchusers(String table,String nic,String idnic)throws Exception{
        
 //DBConnection.setConnection().executeQuery("Select * from "+table+" where "+nic+"="+idnic+"");
    
    }
    
}
