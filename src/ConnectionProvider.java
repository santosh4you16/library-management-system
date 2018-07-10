
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Santosh
 */
public class ConnectionProvider {
    public static Connection conn;
    public static Connection getConnection()
    {
        try
        {
        Class.forName("com.mysql.jdbc.Driver");
        String uuid;
        String ppwd;
        String uid="root";
        String pwd="tiger";
        String DB="jdbc:mysql://localhost/librarymanagement?user="+uid+"&password="+pwd;
        conn=DriverManager.getConnection(DB);
        
        }
        
     
         catch(Exception e) 
         {
            JOptionPane.showMessageDialog(null,e);
        }

    return conn;
}
}
