/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class ProbarConexion {
    public static void main(String[] args) {
        Connection con=null;//inicializar la coneccion 
        try{
         con =Conexion.conectarse("root","");
            System.out.println("Te conectaste!");
            //aqui vienene queries de mysql 
        }catch(ClassNotFoundException e){
            System.out.println("No se cargo bien el driver");
        }catch(SQLException e){
            System.out.println("Un error de sql"+e.getMessage());
            }finally{
            
            }
        try {
            if(con!=null)con.close();
            System.out.println("Ya se cerro todo");
        } catch (SQLException ex) {
           
        }
    } 
}
