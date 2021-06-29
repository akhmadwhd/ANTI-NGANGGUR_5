/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anti.nganggur;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author akhma
 */
public class DBConnection {
    private static final String servername = "localhost";
    private static final String username = "root";
    private static final String dbname = "anti-nganggur";
    private static final Integer portnumber = 3306;
    private static final String password = "";
    
    public static Connection getConnection()
    {
        Connection connect = null;
        
        MysqlDataSource datasource = new MysqlDataSource();
        
        datasource.setServerName(servername);
        datasource.setUser(username);
        datasource.setPassword(password);
        datasource.setDatabaseName(dbname);
        datasource.setPortNumber(portnumber);
        
        try {
            connect = datasource.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger("get connection -> " + DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return connect;
    }
}