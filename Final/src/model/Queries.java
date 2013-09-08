/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import control.DBConnection;
import java.sql.ResultSet;

/**
 *
 * @author Win -8
 */
public class Queries {
    public static ResultSet autoSearch(String table,String idName,String id)throws Exception{
        ResultSet rs=DBConnection.setConnection().createStatement().executeQuery("SELECT * FROM "+table+" WHERE "+idName+"='"+id+"' ");
        return rs;
    }
    
    public static ResultSet invoiceSeach(String field) throws Exception {
        ResultSet rs = DBConnection.setConnection().createStatement().executeQuery("SELECT * FROM product WHERE pro_name LIKE '" + field + "%' ");
        return rs;
    }
    
    public static ResultSet invoiceTable(String field1)throws Exception{
        ResultSet rs = DBConnection.setConnection().createStatement().executeQuery("SELECT * FROM product WHERE pro_name='"+ field1+"'");
        return rs;
    }
    
    
    public static void autosave(String table, String field[]) throws Exception {
        DBConnection.setConnection().createStatement().executeUpdate("INSERT INTO " + table + " VALUES('" + field[0] + "','" + field[1] + "','" + field[2] + "','" + field[3] + "','" + field[4] + "','" + field[5] + "','" + field[6] + "','" + field[7] + "','" + field[8] + "','" + field[9] + "','" + field[10] + "')");


    }

    public static void waitersave(String table, String field[]) throws Exception {
        DBConnection.setConnection().createStatement().executeUpdate("insert into " + table + " values ('" + field[0] + "','" + field[1] + "','" + field[2] + "','" + field[3] + "','" + field[4] + "','" + field[5] + "','" + field[6] + "','" + field[7] + "')");


    }

    public static void supsave(String table, String field[]) throws Exception {
        DBConnection.setConnection().createStatement().executeUpdate("insert into " + table + " values ('" + field[0] + "','" + field[1] + "','" + field[2] + "','" + field[3] + "','" + field[4] + "','" + field[5] + "','" + field[6] + "','" + field[7] + "','" + field[8] + "')");


    }
    
}
