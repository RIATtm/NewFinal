/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import control.DBConnection;
import java.io.File;
import java.util.Scanner;

/**
 *
 * @author AT
 */
public class fingerprint {
    public static void fingerPrint()throws Exception{
        
            File file = new File("C:\\Users\\AT\\Documents\\finger.txt");
            Scanner input = new Scanner(file);
            while(input.hasNextLine()){
                String line = input.nextLine();
                String u_id = line.substring(0, 10);
                String date = line.substring(10, 18);
                String time = line.substring(18, 22);
                
                DBConnection.setConnection().createStatement().executeUpdate("INSET INTO fingureprint VALUES('"+ u_id+"','"+ date+"','"+ time+"')");
                
            }
       
    }
}
