package RestauranteJyC;

import java.io.IOException;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Interfaz_Restaurante extends javax.swing.JFrame {
    //inicializa los atributos externos
    Empleados empleado1;
    Empleados empleado2;
    Clientes serie[] = new Clientes[200];
    Cocineros cocinero1;
    Cocineros cocinero2;
    Cocineros cocinero3;
    Log_Restaurante logTxt;

    @SuppressWarnings("CallToThreadStartDuringObjectConstruction")
    public Interfaz_Restaurante() throws SecurityException, IOException { //constructor


        initComponents();
        logTxt = new Log_Restaurante("evolucionRestaurante.txt");
        //Y a partir de aquí, lo que se ejecuta
        Mostrador_pedidos mp = new Mostrador_pedidos(10, false, TextoPedidos);
        Mesa_platos mep = new Mesa_platos(20, false, TextoPlatos);

        for (int i = 0; i < 200; i++) {
            String id = String.valueOf(i);
            Clientes cliente = new Clientes(id, mp, logTxt);
            serie[i] = cliente;
            Thread ci = new Thread(serie[i]);
            ci.start();
            
        }

        //declaracion empleado
        empleado1 = new Empleados("empleado_1", mp, mep, TextoEmpleado1, logTxt);
        empleado2 = new Empleados("empleado_2", mp, mep, TextoEmpleado2, logTxt);
        //declaración cocineros
        cocinero1 = new Cocineros("cocinero_1", mep, TextoCocinero1, logTxt);
        cocinero2 = new Cocineros("cocinero_2", mep, TextoCocinero2, logTxt);
        cocinero3 = new Cocineros("cocinero_3", mep, TextoCocinero3, logTxt);
        //      Iniciadores
        //empleados
        empleado1.start();
        empleado2.start();
        //cocineros
        cocinero1.start();
        cocinero2.start();
        cocinero3.start();
    }

    public String getTextoPedidos() {
        System.out.print("esto muestra el get-"+TextoPedidos.getSelectedText());
        return TextoPedidos.getText();
    }

    public String getTextoPlatos() {
        System.out.print("esto muestra el otro get-"+TextoPlatos.getSelectedText());
        return TextoPlatos.getText();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        TextoPedidos = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TextoEmpleado1 = new javax.swing.JTextField();
        TextoEmpleado2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TextoPlatos = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TextoCocinero2 = new javax.swing.JTextField();
        TextoCocinero3 = new javax.swing.JTextField();
        TextoCocinero1 = new javax.swing.JTextField();
        BotonPausaTodo = new javax.swing.JButton();
        BotonPausaEmpleado1 = new javax.swing.JButton();
        BotonPausaEmpleado2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Contenido del mostrador de pedidos:");

        TextoPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoPedidosActionPerformed(evt);
            }
        });

        jLabel2.setText("Empleado 1:");

        jLabel3.setText("Empleado 2:");

        TextoEmpleado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoEmpleado1ActionPerformed(evt);
            }
        });

        TextoEmpleado2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoEmpleado2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Contenido de la mesa de platos:");

        TextoPlatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoPlatosActionPerformed(evt);
            }
        });

        jLabel5.setText("Cocinero 1:");

        jLabel6.setText("Cocinero 2:");

        jLabel7.setText("Cocinero 3:");

        BotonPausaTodo.setText("Pausar todo");
        BotonPausaTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPausaTodoActionPerformed(evt);
            }
        });

        BotonPausaEmpleado1.setText("Pausar Empleado 1");
        BotonPausaEmpleado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPausaEmpleado1ActionPerformed(evt);
            }
        });

        BotonPausaEmpleado2.setText("Pausar Empleado 2");
        BotonPausaEmpleado2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPausaEmpleado2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(TextoCocinero1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(70, 70, 70)
                                        .addComponent(jLabel6))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(TextoCocinero2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(BotonPausaTodo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(140, 140, 140)
                                .addComponent(BotonPausaEmpleado1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(160, 160, 160))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(BotonPausaEmpleado2)
                                .addGap(79, 79, 79))
                            .addComponent(TextoCocinero3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(TextoPlatos, javax.swing.GroupLayout.PREFERRED_SIZE, 786, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(TextoEmpleado1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(116, 116, 116)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(TextoEmpleado2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3)))
                                .addComponent(jLabel1)
                                .addComponent(TextoPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 786, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextoPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TextoEmpleado2, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(TextoEmpleado1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextoPlatos, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoCocinero2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextoCocinero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextoCocinero3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonPausaEmpleado1)
                    .addComponent(BotonPausaTodo)
                    .addComponent(BotonPausaEmpleado2))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextoPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoPedidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoPedidosActionPerformed

    private void TextoEmpleado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoEmpleado1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoEmpleado1ActionPerformed

    private void TextoEmpleado2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoEmpleado2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoEmpleado2ActionPerformed

    private void TextoPlatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoPlatosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoPlatosActionPerformed

    private void BotonPausaTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPausaTodoActionPerformed
        // TODO add your handling code here:

        if (cocinero1.getContinuar() == true) { //Si el cocinero 1 está activo,para a cocineros y empleados
            empleado1.setContinuar(false);
            empleado2.setContinuar(false);
            cocinero1.setContinuar(false);
            cocinero2.setContinuar(false);
            cocinero3.setContinuar(false);
            BotonPausaTodo.setText("Reanudar Todo"); //cambia el texto
        } else if (empleado1.getContinuar() == false) { //Si el cocinero 1 está parado,reanuda a cocineros y empleados
            empleado1.setContinuar(true);
            empleado2.setContinuar(true);
            cocinero1.setContinuar(true);
            cocinero2.setContinuar(true);
            cocinero3.setContinuar(true);
            BotonPausaTodo.setText("Pausar Todo"); //cambia el texto
        }
    }//GEN-LAST:event_BotonPausaTodoActionPerformed

    private void BotonPausaEmpleado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPausaEmpleado1ActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        if (empleado1.getContinuar() == true) {  //Si el empleado está activo
            BotonPausaEmpleado1.setText("Reanudar Empleado 1"); //Cambia el texto
            empleado1.setContinuar(false); //Lo para
        } else if (empleado1.getContinuar() == false) { //Si el empleado está parado
            BotonPausaEmpleado1.setText("Pausar Empleado 1");
            empleado1.setContinuar(true);//Reanuda
    }//GEN-LAST:event_BotonPausaEmpleado1ActionPerformed
    }
    private void BotonPausaEmpleado2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPausaEmpleado2ActionPerformed
        // TODO add your handling code here:

        // TODO add your handling code here:
        if (empleado2.getContinuar() == true) { //Si el empleado está activo
            BotonPausaEmpleado2.setText("Reanudar Empleado 2");
            empleado2.setContinuar(false); //Lo para
        } else if (empleado2.getContinuar() == false) { //Si el empleado está parado
            BotonPausaEmpleado2.setText("Pausar Empleado 2");
            empleado2.setContinuar(true); //Reanuda
        }
    }//GEN-LAST:event_BotonPausaEmpleado2ActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz_Restaurante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Restaurante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Restaurante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Restaurante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Interfaz_Restaurante().setVisible(true);
                } catch (SecurityException ex) {
                    Logger.getLogger(Interfaz_Restaurante.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Interfaz_Restaurante.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonPausaEmpleado1;
    private javax.swing.JButton BotonPausaEmpleado2;
    private javax.swing.JButton BotonPausaTodo;
    private javax.swing.JTextField TextoCocinero1;
    private javax.swing.JTextField TextoCocinero2;
    private javax.swing.JTextField TextoCocinero3;
    private javax.swing.JTextField TextoEmpleado1;
    private javax.swing.JTextField TextoEmpleado2;
    private javax.swing.JTextField TextoPedidos;
    private javax.swing.JTextField TextoPlatos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
