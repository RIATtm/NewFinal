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
        ResultSet rs = DBConnection.setConnection().createStatement().executeQuery("SELECT * FROM labourer WHERE lab_id LIKE '" + field2 + "%'");
        return rs;
    }

    public static void invoiceaddDb(String field3[]) throws Exception {
        DBConnection.setConnection().createStatement().executeUpdate("INSERT INTO invoice_bill VALUES ('" + field3[0] + "','" + field3[1] + "','" + field3[2] + "','" + field3[3] + "')");
    }

    public static void invoiceTreat(String treat[]) throws Exception {
        DBConnection.setConnection().createStatement().executeUpdate("INSERT INTO treat_bill VALUES('" + treat[0] + "','" + treat[1] + "','" + treat[2] + "','" + treat[3] + "')");
    }

    public static ResultSet invoiceSearchLabour(String field2) throws Exception {
        ResultSet rs = DBConnection.setConnection().createStatement().executeQuery("SELECT * FROM labourer WHERE lab_nic LIKE '" + field2 + "%'");
        return rs;
    }

    public static ResultSet invoiceSearchUser(String field2) throws Exception {
        ResultSet rs = DBConnection.setConnection().createStatement().executeQuery("SELECT * FROM usertype WHERE user_nic LIKE '" + field2 + "%'");
        return rs;
    }

    public static void invoiceAddUser(String field3[]) throws Exception {
        DBConnection.setConnection().createStatement().executeUpdate("INSERT INTO invoice VALUES ('" + field3[0] + "','" + field3[1] + "','" + field3[2] + "','" + field3[3] + "','" + field3[4] + "','" + field3[5] + "')");
    }

    public static void invoiceTakeAdd(String field3[]) throws Exception {
        DBConnection.setConnection().createStatement().executeUpdate("INSERT INTO invoice_takeaway VALUES ('" + field3[0] + "','" + field3[1] + "','" + field3[2] + "','" + field3[3] + "')");
    }

    public static void invoiceTreatAdd(String field3[]) throws Exception {
        DBConnection.setConnection().createStatement().executeUpdate("INSERT INTO invoice_treat VALUES ('" + field3[0] + "','" + field3[1] + "','" + field3[2] + "','" + field3[3] + "','" + field3[4] + "')");
    }
}