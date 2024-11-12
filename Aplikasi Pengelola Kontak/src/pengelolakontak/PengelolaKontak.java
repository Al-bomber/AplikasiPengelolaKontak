/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pengelolakontak;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ACER
 */
public class PengelolaKontak {
    private static String DB = "jdbc:mysql://localhost/kontak_telp";
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       getKoneksi();
    }
    
    public static Connection getKoneksi(){
        Connection con = null;
        
        MysqlDataSource data = new MysqlDataSource();
        data.setUser("root");
        data.setPassword("");
        data.setURL(DB);
        try {
            con = data.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(PengelolaKontak.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return con;
    }
}
