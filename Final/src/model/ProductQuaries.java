/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import control.DBConnection;

/**
 *
 * @author AT
 */
public class ProductQuaries {
    public static void save(String field[])throws Exception{
        DBConnection.setConnection().createStatement().executeUpdate("INSERT INTO product VALUES('"+field[0]+"','"+field[1]+"','"+field[2]+"','"+field[3]+"')");
    
    }
}
