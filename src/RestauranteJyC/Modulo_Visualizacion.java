package RestauranteJyC;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;


public class Modulo_Visualizacion extends javax.swing.JFrame {
    private texto_mostrador obj;
    
    public Modulo_Visualizacion(){
        initComponents(); //inicializa los componentes
        try {
            obj = (texto_mostrador) Naming.lookup("//127.0.0.1/texto_mostrador"); //busca la conexión
            System.out.println("Habemus conexion"); //comprobación de si hay conexión
        } catch (MalformedURLException | NotBoundException | RemoteException e){
            System.out.println("Excepción : " + e.getMessage());
        }
    }   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TextoPedidos = new javax.swing.JTextField();
        TextoPlatos = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Contenido del mostrador de pedidos:");

        jLabel2.setText("Contenido de la mesa de platos: ");

        TextoPlatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoPlatosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(TextoPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 1070, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextoPlatos, javax.swing.GroupLayout.PREFERRED_SIZE, 1351, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(TextoPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(TextoPlatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextoPlatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoPlatosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoPlatosActionPerformed
    
    public void mostrar() throws RemoteException{ //imprime en los textos
//            System.out.println("mostrador "+obj.getTextoPedidos());
//            System.out.println("mesa "+obj.getTextoPlatos());
            TextoPedidos.setText(obj.getTextoPedidos()); 
            TextoPlatos.setText(obj.getTextoPlatos());
    }
    
    public static void main(String args[]) throws RemoteException{
        Modulo_Visualizacion interfaz=new Modulo_Visualizacion();
        interfaz.setVisible(true);
        while(true){
            interfaz.mostrar();
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextoPedidos;
    private javax.swing.JTextField TextoPlatos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
