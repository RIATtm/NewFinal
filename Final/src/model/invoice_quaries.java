/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import control.DBConnection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author AT
 */
public class invoice_quaries {

    public static ResultSet invoiceSeach(String field) throws Exception {
        ResultSet rs = DBConnection.setConnection().createStatement().executeQuery("SELECT * FROM product WHERE pro_name LIKE '" + field + "%'");
        return rs;
    }

    public static ResultSet invoiceTable(String field1) throws Exception {
        ResultSet rs = DBConnection.setConnection().createStatement().executeQuery("SELECT * FROM product WHERE pro_name='" + field1 + "'");
        return rs;
    }

    public static ResultSet invoiceWaiter(String field2) throws Exception {
        ResultSet rs = DBConnection.setConnection().createStatement().executeQuery("SELECT * FROM waiter WHERE waiter_id LIKE '" + field2 + "%'");
        return rs;
    }

    public static void invoiceaddDb(String field3[]) throws Exception {
        DBConnection.setConnection().createStatement().executeUpdate("INSERT INTO bill VALUES ('" + field3[0] + "','" + field3[1] + "','" + field3[2] + "','" + field3[2] + "')");
        JOptionPane.showMessageDialog(null, "done");
    }
}
