/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuestionario;

import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/**
 *
 * @author T-102
 */
public class Interfaz extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();
        nuestrometodo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        etiquetaTitulo = new javax.swing.JLabel();
        panelOpciones = new javax.swing.JPanel();
        botonRespuesta = new javax.swing.JButton();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(102, 255, 102));

        etiquetaTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        etiquetaTitulo.setForeground(new java.awt.Color(240, 240, 240));
        etiquetaTitulo.setText("Capital de Finlandia");

        panelOpciones.setForeground(new java.awt.Color(51, 51, 255));
        panelOpciones.setLayout(new java.awt.GridLayout(4, 1));

        botonRespuesta.setText("Checar Respuesta");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonRespuesta)
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonRespuesta)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(etiquetaTitulo)
                        .addGap(29, 29, 29)
                        .addComponent(panelOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonRespuesta;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelOpciones;
    // End of variables declaration//GEN-END:variables

    private void nuestrometodo() {
        /*JRadioButton r1=new JRadioButton("opcion1");
        JRadioButton r2=new JRadioButton("opcion2");
        JRadioButton r3=new JRadioButton("opcion3");
        JRadioButton r4=new JRadioButton("opcion4");
        
        //agrupadores 
        ButtonGroup grupo=new ButtonGroup();
        grupo.add(r1);
        grupo.add(r2);
        grupo.add(r3);
        grupo.add(r4);
        
        panelOpciones.add(r1);
        panelOpciones.add(r2);
        panelOpciones.add(r3);
        panelOpciones.add(r4);*/
        
        //Vamos a indicarle que ponga la pregunta y sus respecivas opciones
         ButtonGroup grupo=new ButtonGroup();
        ArrayList<Pregunta> preguntas=new GenerarCuestionario().generar();
        
        //Del arraylist que se llama preguntas obtendremos el titulo de la primera
       
        //ArrayList<JRadioButton> radios=new ArrayList<>();
                JRadioButton[]radios2=new JRadioButton[preguntas.get(0).getOpciones().size()];
                etiquetaTitulo.setText(preguntas.get(0).getTitulo());
                int indice=0;
                for(JRadioButton radio:radios2){
                    radio=new JRadioButton();
                    grupo.add(radio);
                    radio.setText(preguntas.get(0).getOpciones().get(indice).getTitulo());
                    panelOpciones.add(radio);
                    indice++;
                }
                
        
        //etiquetaTitulo.setText(preguntas.get(0).getTitulo());
        /*r1.setText(preguntas.get(0).getOpciones().get(0).getTitulo());
        r2.setText(preguntas.get(0).getOpciones().get(1).getTitulo());
        r3.setText(preguntas.get(0).getOpciones().get(2).getTitulo());
        r4.setText(preguntas.get(0).getOpciones().get(3).getTitulo());*/
        
        
        //aqui vamos a prgramar el evento del boton checar respuesta con programacion funcional
        //Vaos a buscar la opcion correcta
        
        botonRespuesta.addActionListener(evento->{
        JOptionPane.showConfirmDialog(this,"Probando esto ");
       // if(Opcionsetcorrecta==true){
            
        //}
    });
        
        
    }
}