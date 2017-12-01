/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class ProbarConexion1 {
    public static void main(String[] args) {
        Connection con=null;//inicializar la coneccion 
        try{
         con =Conexion.conectarse("root","");
            System.out.println("Te conectaste!");
            //caso especial del select
            //paso 1 
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from tablita");
            
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
