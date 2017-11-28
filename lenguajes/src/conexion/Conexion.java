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
        // primero escribimos la url del servidor dmysql
        String url="jdbc:mysql://localhost:3306/mysql";
        //Ahora hacemos el cargador con codigo del driver
        //cargamos el driver de mysql para que sepa que nos conectaremos a mysql
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, login, password);
                return con;
    }
}
