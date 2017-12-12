/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

//este paquete es de java no es del driver de mysql
import java.sql.*;

public class Conexion {
    
    public static Connection conectarse(String login,String password) throws SQLException, ClassNotFoundException{
        
        String url="jdbc:mysql://localhost:3306/mysql";
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, login, password);
                return con;
    }
}
