/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import ClasesNormales.CasaApuestas;
import ClasesNormales.JugadorException;
import ClasesNormales.JugadorRegistrado;
import javax.swing.JOptionPane;

/**
 *
 * @author Danil
 */
public class VentanaInicial extends javax.swing.JFrame {
    static JugadorRegistrado jr;
    /**
     * Creates new form VentanaInicial
     */
    public VentanaInicial() {
        initComponents();
        CasaApuestas.cargarDatos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelPOKER = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jLabelContraseña = new javax.swing.JLabel();
        jButtonIndividual = new javax.swing.JButton();
        jButtonJuegoMesa = new javax.swing.JButton();
        jButtonJuegoSinRegistro = new javax.swing.JButton();
        jButtonAdmin = new javax.swing.JButton();
        jTextFieldContraseña = new javax.swing.JTextField();
        jButtonEstadisticas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("POKERFLOW");

        jLabelPOKER.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelPOKER.setForeground(new java.awt.Color(0, 204, 255));
        jLabelPOKER.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPOKER.setText("POKERFLOW");

        jLabelUsuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelUsuario.setText("Usuario(NIF):");

        jTextFieldUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsuarioActionPerformed(evt);
            }
        });

        jLabelContraseña.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelContraseña.setText("Contraseña:");

        jButtonIndividual.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonIndividual.setText("Juego Individual");
        jButtonIndividual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIndividualActionPerformed(evt);
            }
        });

        jButtonJuegoMesa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonJuegoMesa.setText("Juego en Mesa");
        jButtonJuegoMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonJuegoMesaActionPerformed(evt);
            }
        });

        jButtonJuegoSinRegistro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonJuegoSinRegistro.setText("Jugar sin Registrarse");
        jButtonJuegoSinRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonJuegoSinRegistroActionPerformed(evt);
            }
        });

        jButtonAdmin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonAdmin.setText("Ajustes (Administrador)");
        jButtonAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdminActionPerformed(evt);
            }
        });

        jTextFieldContraseña.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldContraseñaActionPerformed(evt);
            }
        });

        jButtonEstadisticas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonEstadisticas.setText("Consultar Estadisticas");
        jButtonEstadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEstadisticasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelPOKER, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(229, 229, 229))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 208, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonIndividual, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                    .addComponent(jButtonJuegoMesa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(75, 75, 75))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonJuegoSinRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jButtonEstadisticas, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelPOKER, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jButtonIndividual, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonJuegoMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonJuegoSinRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 27, Short.MAX_VALUE))
                    .addComponent(jButtonEstadisticas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdminActionPerformed
        // TODO add your handling code here:
        if(jTextFieldUsuario.getText().equals("admin")&& jTextFieldContraseña.getText().equals("admin")){
            new VentanaAdministrador().setVisible(true);
        }
    }//GEN-LAST:event_jButtonAdminActionPerformed

    private void jTextFieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsuarioActionPerformed

    private void jTextFieldContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldContraseñaActionPerformed

    private void jButtonJuegoSinRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonJuegoSinRegistroActionPerformed
        // TODO add your handling code here:
        new VentanaDatosOcasional().setVisible(true);
    }//GEN-LAST:event_jButtonJuegoSinRegistroActionPerformed

    private void jButtonIndividualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIndividualActionPerformed
        // TODO add your handling code here:
        try{
            jr= CasaApuestas.jugadores.get(jTextFieldUsuario.getText());
            if (jr==null) {
                throw new JugadorException(JugadorException.NIF_INCORRECTO);
            }
            else if(!jr.getContraseña().equals(jTextFieldContraseña.getText())){
                throw new JugadorException(JugadorException.CONTRASENIA_INCORRECTA);
            }
            else{
                new VentanaIndividualRegistrado().setVisible(true);
            }
        } catch(JugadorException je){
                JOptionPane.showMessageDialog(this, je.toString(), "Error", JOptionPane.WARNING_MESSAGE);
        }       
    }//GEN-LAST:event_jButtonIndividualActionPerformed

    private void jButtonJuegoMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonJuegoMesaActionPerformed
        // TODO add your handling code here:
        try{
            jr= CasaApuestas.jugadores.get(jTextFieldUsuario.getText());
            if (jr==null) {
                throw new JugadorException(JugadorException.NIF_INCORRECTO);
            }
            else if(!jr.getContraseña().equals(jTextFieldContraseña.getText())){
                throw new JugadorException(JugadorException.CONTRASENIA_INCORRECTA);
            }
            else{
                new VentanaMesa().setVisible(true);
            }
        } catch(JugadorException je){
                JOptionPane.showMessageDialog(this, je.toString(), "Error", JOptionPane.WARNING_MESSAGE);
        }   
    }//GEN-LAST:event_jButtonJuegoMesaActionPerformed

    private void jButtonEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEstadisticasActionPerformed
        // TODO add your handling code here:
        new VentanaEstadisticas().setVisible(true);
    }//GEN-LAST:event_jButtonEstadisticasActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdmin;
    private javax.swing.JButton jButtonEstadisticas;
    private javax.swing.JButton jButtonIndividual;
    private javax.swing.JButton jButtonJuegoMesa;
    private javax.swing.JButton jButtonJuegoSinRegistro;
    private javax.swing.JLabel jLabelContraseña;
    private javax.swing.JLabel jLabelPOKER;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JTextField jTextFieldContraseña;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
