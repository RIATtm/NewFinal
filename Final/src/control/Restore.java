/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Win -8
 */
public class Restore {
    public void restoration(){
        
    }
    public static void backUp(){
         try {
           String sql="E:\\Greate_Softwares\\MySQL\\MySQL Server 5.5\\bin\\mysqldump -uroot -p1234 neelagiri -rD:\\AA3sa3.sql";
           Runtime.getRuntime().exec(sql);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        backUp();
    }
}
