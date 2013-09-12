/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import control.DBConnection;
import java.sql.ResultSet;

/**
 *
 * @author SJ slash
 */
public class Grnquaries {
    
    public static ResultSet invoiceSeach(String field) throws Exception {
        ResultSet rs = DBConnection.setConnection().createStatement().executeQuery("SELECT * FROM product WHERE pro_name LIKE '" + field + "%'");
        return rs;
    }
    
}
