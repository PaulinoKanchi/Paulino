package conexion;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
public class ProbarConexion1 {
    public static void main(String[] args) {
        Connection con=null;//inicializar la coneccion 
        try{
         con =Conexion.conectarse("root","");
            System.out.println("Te conectaste!");
            //caso especial del select
            //paso 1 generar una consulta(querry)
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from tablita where ID=1");
            //Result set para mapear
            //vvine la traduccion
            ArrayList<Tablita> registros=new ArrayList<>();
            while(rs.next()){
                Tablita t=new Tablita();
                t.setID(rs.getInt(1));
                t.setNombre(rs.getString(2));
                registros.add(t);
            }
            for(Tablita t:registros){
                System.out.println("id: "+t.getID()+" Nombre: "+ t.getNombre());
            }
            
            st.close();
            
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
