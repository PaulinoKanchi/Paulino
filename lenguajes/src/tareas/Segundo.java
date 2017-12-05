package tareas;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Segundo extends Thread{
    
    public void run(){
        while(true){
        //aqui pone la accion de tu thread
        System.out.println("Soy un el segundo thread no hago nada");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Segundo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
