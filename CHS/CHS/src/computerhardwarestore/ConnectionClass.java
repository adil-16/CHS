/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computerhardwarestore;
import java.sql.* ;
/**
 *
 * @author fahee
 */
public class ConnectionClass {
    public static void main(String[] args) {
        // TODO code application logic heretry
        try {
        Connection mycon = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","orcl");  
        Statement stmt = mycon.createStatement();
        ResultSet result = stmt.executeQuery("Select * FROM ADMIN");
        while (result.next ()){
            
        
        System.out.println(result.getInt(1) + " " +  result.getString(2) + " " + result.getString(3));
        }
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
        
}
}
