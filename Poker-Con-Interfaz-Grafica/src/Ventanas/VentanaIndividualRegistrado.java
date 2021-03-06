/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import ClasesNormales.Apuesta;
import ClasesNormales.Baraja;
import ClasesNormales.Carta;
import ClasesNormales.CasaApuestas;
import ClasesNormales.JugadorException;
import ClasesNormales.JugadorRegistrado;
import ClasesNormales.Premio;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Danil
 */
public class VentanaIndividualRegistrado extends javax.swing.JFrame {
    ArrayList<Carta> manoR= new ArrayList<>();
    ArrayList<Carta> barajaR= new ArrayList<>();  
    JugadorRegistrado jugadorR= VentanaInicial.jr;
    /**
     * Creates new form VentanaIndividualRegistrado
     */
    public VentanaIndividualRegistrado() {
        initComponents();
        jTextFieldResultado.setText("0");
        jTextFieldAumentarSaldo.setText("0");
        jTextFieldApuesta.setText("0");
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
        jLabelAumentarSaldo = new javax.swing.JLabel();
        jTextFieldAumentarSaldo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButtonAumentarSaldo = new javax.swing.JButton();
        jLabelApuesta = new javax.swing.JLabel();
        jTextFieldApuesta = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabelRetirarBeneficios = new javax.swing.JLabel();
        jLabelBeneficio = new javax.swing.JLabel();
        jLabelSaldoRestante = new javax.swing.JLabel();
        jTextFieldBeneficio = new javax.swing.JTextField();
        jTextFieldSaldoRestante = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButtonRetirarBeneficios = new javax.swing.JButton();
        jButtonJugar = new javax.swing.JButton();
        jButtonImprimirFactura = new javax.swing.JButton();
        jLabelCarta1 = new javax.swing.JLabel();
        jLabelCarta2 = new javax.swing.JLabel();
        jLabelCarta3 = new javax.swing.JLabel();
        jLabelCarta4 = new javax.swing.JLabel();
        jLabelCarta5 = new javax.swing.JLabel();
        jLabelResultado = new javax.swing.JLabel();
        jTextFieldResultado = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldPremio = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("POKERFLOW");

        jLabelPOKER.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelPOKER.setForeground(new java.awt.Color(0, 204, 204));
        jLabelPOKER.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPOKER.setText("POKERFLOW");

        jLabelAumentarSaldo.setText("¿Aumentar Saldo?");

        jLabel1.setText("€");

        jButtonAumentarSaldo.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButtonAumentarSaldo.setText("Aumentar Saldo");
        jButtonAumentarSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAumentarSaldoActionPerformed(evt);
            }
        });

        jLabelApuesta.setText("Apuesta:");

        jLabel3.setText("€");

        jLabelRetirarBeneficios.setText("¿Retirar Beneficios?");

        jLabelBeneficio.setText("Beneficio:");
        jLabelBeneficio.setToolTipText("");

        jLabelSaldoRestante.setText("Saldo Restante:");

        jTextFieldBeneficio.setEditable(false);

        jTextFieldSaldoRestante.setEditable(false);

        jLabel5.setText("€");

        jLabel6.setText("€");

        jButtonRetirarBeneficios.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonRetirarBeneficios.setText("Retirar Beneficios");
        jButtonRetirarBeneficios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRetirarBeneficiosActionPerformed(evt);
            }
        });

        jButtonJugar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonJugar.setText("JUGAR");
        jButtonJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonJugarActionPerformed(evt);
            }
        });

        jButtonImprimirFactura.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonImprimirFactura.setText("Imprimir Factura");
        jButtonImprimirFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonImprimirFacturaActionPerformed(evt);
            }
        });

        jLabelResultado.setText("Resultado:");

        jTextFieldResultado.setEditable(false);

        jLabel11.setText("€");

        jTextFieldPremio.setEditable(false);
        jTextFieldPremio.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextFieldPremio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldPremio.setText("--");
        jTextFieldPremio.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelPOKER, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jLabelRetirarBeneficios, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelAumentarSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldAumentarSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1))
                            .addComponent(jButtonAumentarSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelApuesta, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                                    .addComponent(jTextFieldApuesta))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addGap(111, 111, 111)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelSaldoRestante)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldSaldoRestante))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelBeneficio, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldBeneficio, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonJugar, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(jButtonRetirarBeneficios)
                                .addGap(9, 9, 9)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonImprimirFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jLabelCarta1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelCarta2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelCarta3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelCarta4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelCarta5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jLabelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)
                        .addGap(99, 99, 99)
                        .addComponent(jTextFieldPremio, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 64, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelPOKER, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelRetirarBeneficios))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelAumentarSaldo)
                            .addComponent(jLabelApuesta)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jButtonImprimirFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldAumentarSaldo)
                            .addComponent(jTextFieldApuesta)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonAumentarSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jButtonJugar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(78, 78, 78))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelBeneficio)
                            .addComponent(jTextFieldBeneficio, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelSaldoRestante)
                            .addComponent(jTextFieldSaldoRestante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonRetirarBeneficios, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelCarta4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelCarta2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelCarta1, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(jLabelCarta3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelCarta5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelResultado)
                            .addComponent(jTextFieldResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jTextFieldPremio, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAumentarSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAumentarSaldoActionPerformed
        // TODO add your handling code here:
        jugadorR.aumentarSaldo(Double.parseDouble(jTextFieldAumentarSaldo.getText()));
        jTextFieldResultado.setText(String.valueOf(jugadorR.getSaldoAcumulado()));
    }//GEN-LAST:event_jButtonAumentarSaldoActionPerformed

    private void jButtonRetirarBeneficiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRetirarBeneficiosActionPerformed
        // TODO add your handling code here:
        jTextFieldBeneficio.setText(String.valueOf(jugadorR.retirarBeneficios()));
        jTextFieldSaldoRestante.setText(String.valueOf(jugadorR.getSaldoAcumulado()));
    }//GEN-LAST:event_jButtonRetirarBeneficiosActionPerformed

    private void jButtonJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonJugarActionPerformed
        // TODO add your handling code here:
        try{
            if(Integer.parseInt(jTextFieldApuesta.getText())>jugadorR.getSaldoAcumulado()){
                throw new JugadorException(JugadorException.SALDO_INSUFICIENTE);
            }
            double dineroInicial=Double.parseDouble(jTextFieldResultado.getText());
            manoR.clear();
            barajaR=Baraja.creaBaraja();
            manoR=Baraja.creaMano(barajaR);
            barajaR.clear();
            jugadorR.actualizaSaldo(manoR,Integer.parseInt(jTextFieldApuesta.getText()));
            jTextFieldResultado.setText(String.valueOf(jugadorR.getSaldoAcumulado()));
            ImageIcon imagen1 = new ImageIcon("CartasEspañolas/" + manoR.get(0).toString());
            ImageIcon imgRedimensionada1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabelCarta1.getWidth(), jLabelCarta1.getHeight(), 1));
            jLabelCarta1.setIcon(imgRedimensionada1);
            ImageIcon imagen2 = new ImageIcon("CartasEspañolas/" + manoR.get(1).toString());
            ImageIcon imgRedimensionada2 = new ImageIcon(imagen2.getImage().getScaledInstance(jLabelCarta2.getWidth(), jLabelCarta2.getHeight(), 1));
            jLabelCarta2.setIcon(imgRedimensionada2);
            ImageIcon imagen3 = new ImageIcon("CartasEspañolas/" + manoR.get(2).toString());
            ImageIcon imgRedimensionada3 = new ImageIcon(imagen3.getImage().getScaledInstance(jLabelCarta3.getWidth(), jLabelCarta3.getHeight(), 1));
            jLabelCarta3.setIcon(imgRedimensionada3);
            ImageIcon imagen4 = new ImageIcon("CartasEspañolas/" + manoR.get(3).toString());
            ImageIcon imgRedimensionada4 = new ImageIcon(imagen4.getImage().getScaledInstance(jLabelCarta4.getWidth(), jLabelCarta4.getHeight(), 1));
            jLabelCarta4.setIcon(imgRedimensionada4);
            ImageIcon imagen5 = new ImageIcon("CartasEspañolas/" + manoR.get(4).toString());
            ImageIcon imgRedimensionada5 = new ImageIcon(imagen5.getImage().getScaledInstance(jLabelCarta5.getWidth(), jLabelCarta5.getHeight(), 1));
            jLabelCarta5.setIcon(imgRedimensionada5);
            jTextFieldPremio.setText(Apuesta.verPremioTexto(Apuesta.verPremio(manoR)));
            double ganancia= Double.parseDouble(jTextFieldResultado.getText())-dineroInicial;
            Premio premio= new Premio(ganancia,"Individual",jTextFieldPremio.getText());
            jugadorR.añadirPremios(premio);
            CasaApuestas.nuevoPremio(premio);
        } catch(JugadorException je){
            JOptionPane.showMessageDialog(this, je.toString(), "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButtonJugarActionPerformed

    private void jButtonImprimirFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonImprimirFacturaActionPerformed
        // TODO add your handling code here:
        PrintWriter salida = null;
        try {
            // TODO add your handling code here:    public static void generaFicha(Persona per) throws IOException {
            salida = new PrintWriter(new BufferedWriter(new FileWriter(jugadorR.getNIF() + ".txt")));
            salida.println("-------------------------------- Ficha "+ jugadorR.getNombre() +" --------------------------------");
            salida.println("\n");
            salida.println("DNI: " + jugadorR.getNIF());
            salida.println("\n");
            salida.println("Nombre: " + jugadorR.getNombre());
            salida.println("\n");
            salida.println("Fecha de nacimiento: " + jugadorR.getFechaNacimiento());
            salida.println("\n");
            salida.println("Beneficio: " + jTextFieldBeneficio.getText() + "€");
            salida.println("\n");
            salida.println("\n");
            salida.println("-------------------------------------------------------------------------------");
        } catch (IOException ex) {
            Logger.getLogger(VentanaIndividualOcasional.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            salida.close();
        }
    }//GEN-LAST:event_jButtonImprimirFacturaActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaIndividualRegistrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaIndividualRegistrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaIndividualRegistrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaIndividualRegistrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaIndividualRegistrado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAumentarSaldo;
    private javax.swing.JButton jButtonImprimirFactura;
    private javax.swing.JButton jButtonJugar;
    private javax.swing.JButton jButtonRetirarBeneficios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelApuesta;
    private javax.swing.JLabel jLabelAumentarSaldo;
    private javax.swing.JLabel jLabelBeneficio;
    private javax.swing.JLabel jLabelCarta1;
    private javax.swing.JLabel jLabelCarta2;
    private javax.swing.JLabel jLabelCarta3;
    private javax.swing.JLabel jLabelCarta4;
    private javax.swing.JLabel jLabelCarta5;
    private javax.swing.JLabel jLabelPOKER;
    private javax.swing.JLabel jLabelResultado;
    private javax.swing.JLabel jLabelRetirarBeneficios;
    private javax.swing.JLabel jLabelSaldoRestante;
    private javax.swing.JTextField jTextFieldApuesta;
    private javax.swing.JTextField jTextFieldAumentarSaldo;
    private javax.swing.JTextField jTextFieldBeneficio;
    private javax.swing.JTextField jTextFieldPremio;
    private javax.swing.JTextField jTextFieldResultado;
    private javax.swing.JTextField jTextFieldSaldoRestante;
    // End of variables declaration//GEN-END:variables
}
