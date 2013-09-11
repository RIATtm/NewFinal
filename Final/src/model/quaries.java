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
public class quaries {

    public static void autosave(String table, String field[],String login[]) throws Exception {
        DBConnection.setConnection().createStatement().executeUpdate("INSERT INTO " + table + " VALUES('" + field[0] + "','" + field[1] + "','" + field[2] + "','" + field[3] + "','" + field[4] + "','" + field[5] + "','" + field[6] + "','" + field[7] + "')");
        DBConnection.setConnection().createStatement().executeUpdate("INSERT INTO login VALUES('"+login[0]+"','"+login[1]+"','"+login[2]+"')");


    }

    public static void waitersave(String table, String field[]) throws Exception {
        DBConnection.setConnection().createStatement().executeUpdate("insert into " + table + " values ('" + field[0] + "','" + field[1] + "','" + field[2] + "','" + field[3] + "','" + field[4] + "','" + field[5] + "','" + field[6] + "','" + field[7] + "')");


    }

    public static void supsave(String table, String field[]) throws Exception {
        DBConnection.setConnection().createStatement().executeUpdate("insert into " + table + " values ('" + field[0] + "','" + field[1] + "','" + field[2] + "','" + field[3] + "','" + field[4] + "','" + field[5] + "','" + field[6] + "')");


    }
    public static ResultSet searchusers(String table)throws Exception{
        

 //DBConnection.setConnection().executeQuery("Select * from "+table+" where "+nic+"="+idnic+"");

 ResultSet rs =DBConnection.setConnection().createStatement().executeQuery("Select * from "+table+" ");

    return rs;
    }
    
    //________________________________________________________________________+++++____________________________________________________________-
             public static ResultSet searchpic(String table,String nic)throws Exception{
        

 

 ResultSet rs =DBConnection.setConnection().createStatement().executeQuery("Select pic from "+table+" where user_nic=" +nic+" ");
       

    return rs;
    }
    
           public static void update(String table, String name[],String column[],String id,String colid) throws Exception {
         
        DBConnection.setConnection().createStatement().executeUpdate("UPDATE "+table+" SET "+name[0]+"='"+column[0]+"',"+name[1]+"='"+column[1]+"',"+name[2]+"='"+column[2]+"',"+name[3]+"='"+column[3]+"',"+name[4]+"='"+column[4]+"' WHERE "+colid+"='"+id+"'");
    


    } public static void supupdate(String table, String name[],String column[],String id,String colid) throws Exception {
         
        DBConnection.setConnection().createStatement().executeUpdate("UPDATE "+table+" SET "+name[0]+"='"+column[0]+"',"+name[1]+"='"+column[1]+"',"+name[2]+"='"+column[2]+"',"+name[3]+"='"+column[3]+"',"+name[4]+"='"+column[4]+"',"+name[5]+"='"+column[5]+"' WHERE "+colid+"='"+id+"'");
    


    }
             
             
             
}
