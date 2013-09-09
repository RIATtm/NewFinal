/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Win -8
 */
public class DBConnection {
    public static Connection setConnection()throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3308/viva","root","123");
        return c;
    }
}
