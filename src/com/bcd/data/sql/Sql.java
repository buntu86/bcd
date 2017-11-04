package com.bcd.data.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.bcd.utils.Log;


//https://mariadb.com/kb/en/library/about-mariadb-connector-j/
public class Sql {

    public static Connection Conn(){
            String serverName = "adi-rasp.internet-box.ch:3306";
            String userName = "typo";
            String pass = "pass";
            String dataBase = "bacad";
            Connection connection = null;
            
        try{
            connection = DriverManager.getConnection("jdbc:mariadb://" + 
                    serverName + 
                    "/" + dataBase + 
                    "?user=" + userName + 
                    "&password=" + pass);
            
        } catch (SQLException ex) {
            Log.msg(1, "" + ex);
        }   
        
        return connection;
    }
}
