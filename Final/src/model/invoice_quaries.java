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
public class invoice_quaries {

    public static ResultSet invoiceSeach(String field) throws Exception {
        ResultSet rs = DBConnection.setConnection().createStatement().executeQuery("SELECT * FROM product WHERE pro_name LIKE '" + field + "%' ");
        return rs;
    }
    
    public static ResultSet invoiceTable(String field1)throws Exception{
        ResultSet rs = DBConnection.setConnection().createStatement().executeQuery("SELECT * FROM product WHERE pro_name='"+ field1+"'");
        return rs;
    }
}
