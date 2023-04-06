
package examen2josesandoval;

import java.util.ArrayList;

import javax.swing.JOptionPane;


public class FormularioEncuesta extends javax.swing.JFrame {
    
  private ArrayList<Encuesta> listaEncuestas = new ArrayList<>();


    public FormularioEncuesta() {
        
        

        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Lencuesta = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Tedad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Tcorreo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        RSCarro = new javax.swing.JRadioButton();
        RNCarro = new javax.swing.JRadioButton();
        BRegistrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);
        getContentPane().add(TNombre);
        TNombre.setBounds(230, 59, 160, 40);

        jLabel1.setText("Nombre Completo");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(120, 55, 100, 40);

        Lencuesta.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Lencuesta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(Lencuesta);
        Lencuesta.setBounds(20, 20, 70, 40);

        jLabel2.setText("Edad");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(120, 110, 90, 20);
        getContentPane().add(Tedad);
        Tedad.setBounds(230, 110, 160, 30);

        jLabel3.setText("Correo Electronico");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(120, 160, 100, 15);
        getContentPane().add(Tcorreo);
        Tcorreo.setBounds(230, 149, 160, 30);

        jLabel4.setText("Carro Propio?");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(120, 200, 110, 15);

        RSCarro.setText("Si");
        RSCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RSCarroActionPerformed(evt);
            }
        });
        getContentPane().add(RSCarro);
        RSCarro.setBounds(230, 200, 60, 23);

        RNCarro.setText("No");
        RNCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RNCarroActionPerformed(evt);
            }
        });
        getContentPane().add(RNCarro);
        RNCarro.setBounds(300, 200, 100, 23);

        BRegistrar.setText("Registrar");
        BRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(BRegistrar);
        BRegistrar.setBounds(160, 250, 210, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RNCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RNCarroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RNCarroActionPerformed

    private void RSCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RSCarroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RSCarroActionPerformed

    private void BRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BRegistrarActionPerformed
        String Nombre = TNombre.getText();
        String Edad =Tedad.getText();
        String Correo = Tcorreo.getText();
       
        int EdadConv = Integer.parseInt(Tedad.getText());

        if (Nombre.isEmpty() || (Edad.isEmpty() || (Correo.isEmpty()))) {
            JOptionPane.showMessageDialog(rootPane, "Ingrese todos los campos solicitados");

        } else if (EdadConv < 18 || EdadConv > 50) {

            JOptionPane.showMessageDialog(null, "La edad debe estar entre 18 y 50 años", "Error de validación", JOptionPane.ERROR_MESSAGE);

        }
        
        TNombre.setText("");
        Tedad.setText("");
        Tcorreo.setText("");
     

    }//GEN-LAST:event_BRegistrarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
        
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(FormularioEncuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioEncuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioEncuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioEncuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioEncuesta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BRegistrar;
    private javax.swing.JLabel Lencuesta;
    private javax.swing.JRadioButton RNCarro;
    private javax.swing.JRadioButton RSCarro;
    private javax.swing.JTextField TNombre;
    private javax.swing.JTextField Tcorreo;
    private javax.swing.JTextField Tedad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
