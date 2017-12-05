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
            //con la conexion que se llama con vamos a generar una sentencia la cuyal es una clase
            //aqui vienene queries de mysql 
           //Statement st =con.createStatement();
            //st.execute("create table tablita(id integer primary key,nombre varchar(40) )");
            //tambien se cierran las sentencias al igual que las conecciones
            //caso1:insert
            PreparedStatement st=con.prepareStatement("insert into tablita values(?,?)");
            
            st.setInt(1,1 );
            st.setString(2, "juan");
            st.execute();
            st.close();
            System.out.println("Registro insertado");
           
            st.close();
            System.out.println("Tabla generada con exito");
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
