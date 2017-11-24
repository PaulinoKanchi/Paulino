/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.*;
public class ProbarConexion {
    public static void main(String[] args) {
        Connection con=null;
        try{
         con =Conexion.conectarse("root", "");
            System.out.println("Te conectaste!");
            //aqui vienene queries de mysql 
        }catch(ClassNotFoundException e){
            
        }catch(SQLException e){
            
            }finally{
            
            }
            con.close();
    }  
}
