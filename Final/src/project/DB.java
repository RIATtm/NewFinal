/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Naveen
 */
public class DB {
    public static Connection con() throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/neelagiri", "root", "123");
        return c;
    }
}
