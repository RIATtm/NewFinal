/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import control.DBConnection;
import java.sql.ResultSet;

/**
 *
 * @author Win -8
 */
public class Queries {
    public static ResultSet autoSearch(String table,String idName,String id)throws Exception{
        ResultSet rs=DBConnection.setConnection().createStatement().executeQuery("SELECT * FROM "+table+" WHERE "+idName+"='"+id+"' ");
        return rs;
    }
}
