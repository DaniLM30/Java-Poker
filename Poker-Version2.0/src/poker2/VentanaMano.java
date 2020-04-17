/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Danil
 */
public class VentanaMano extends javax.swing.JFrame {
    ArrayList<Carta> mano1= new ArrayList<>();
    ArrayList<Carta> baraja1= new ArrayList<>();    
    JugadorRegistrado jugadorR= VentanaPrincipal.jr;
    /**
     * Creates new form VentanaMano
     */
    public VentanaMano() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Resultado = new javax.swing.JTextField();
        Jugar = new javax.swing.JButton();
        CantidadApostada = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        SaldoResultante = new javax.swing.JLabel();
        RetirarBeneficios = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Beneficio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        SaldoRestante = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        AumentarSaldo = new javax.swing.JButton();
        AumentaSaldo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Mano1 = new javax.swing.JLabel();
        Mano2 = new javax.swing.JLabel();
        Mano3 = new javax.swing.JLabel();
        Mano4 = new javax.swing.JLabel();
        Mano5 = new javax.swing.JLabel();
        Factura = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Resultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResultadoActionPerformed(evt);
            }
        });

        Jugar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Jugar.setText("Jugar");
        Jugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JugarActionPerformed(evt);
            }
        });

        CantidadApostada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CantidadApostadaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("¿Cúanto deseas apostar?");

        jLabel2.setText("€");

        SaldoResultante.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SaldoResultante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SaldoResultante.setText("Su saldo resultante tras la jugada:");

        RetirarBeneficios.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        RetirarBeneficios.setText("¿Retirar Beneficios?");
        RetirarBeneficios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetirarBeneficiosActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Beneficio:");

        Beneficio.setEditable(false);
        Beneficio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BeneficioActionPerformed(evt);
            }
        });

        jLabel4.setText("€");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Saldo restante:");

        SaldoRestante.setEditable(false);
        SaldoRestante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaldoRestanteActionPerformed(evt);
            }
        });

        jLabel6.setText("€");

        AumentarSaldo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AumentarSaldo.setText("¿Aumentar Saldo?");
        AumentarSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AumentarSaldoActionPerformed(evt);
            }
        });

        AumentaSaldo.setToolTipText("");
        AumentaSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AumentaSaldoActionPerformed(evt);
            }
        });

        jLabel7.setText("€");

        jLabel8.setText("Introduzca para aumentar saldo");

        Factura.setText("Imprimir Factura");
        Factura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FacturaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AumentarSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124)
                        .addComponent(Jugar, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 278, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RetirarBeneficios, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Beneficio, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                    .addComponent(SaldoRestante))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(jLabel1)
                                .addGap(51, 51, 51)
                                .addComponent(CantidadApostada, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(64, 64, 64)
                                .addComponent(Factura, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(265, 265, 265)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Resultado, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                                    .addComponent(SaldoResultante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(AumentaSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)))
                        .addContainerGap(34, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(Mano1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Mano2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(Mano3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Mano4, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Mano5, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CantidadApostada, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Factura, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AumentaSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Jugar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(AumentarSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(RetirarBeneficios, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Beneficio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(SaldoRestante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(8, 8, 8)
                .addComponent(SaldoResultante, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Mano5, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                    .addComponent(Mano4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Mano3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Mano2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Mano1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(233, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JugarActionPerformed
        // TODO add your handling code here:
        try{
            if(Integer.parseInt(CantidadApostada.getText())>jugadorR.getSaldoAcumulado()){
                throw new JugadorException(JugadorException.SALDO_INSUFICIENTE);
            }
            mano1.clear();
            baraja1=Baraja.creaBaraja();
            mano1= Baraja.creaMano(baraja1);
            baraja1.clear();
            jugadorR.actualizaSaldo(mano1,Integer.parseInt(CantidadApostada.getText()));
            Resultado.setText(String.valueOf(jugadorR.getSaldoAcumulado()));
            ImageIcon imagen1 = new ImageIcon("CartasEspañolas/" + mano1.get(0).toString());
            ImageIcon imgRedimensionada1 = new ImageIcon(imagen1.getImage().getScaledInstance(Mano1.getWidth(), Mano1.getHeight(), 1));
            Mano1.setIcon(imgRedimensionada1);
            ImageIcon imagen2 = new ImageIcon("CartasEspañolas/" + mano1.get(1).toString());
            ImageIcon imgRedimensionada2 = new ImageIcon(imagen2.getImage().getScaledInstance(Mano2.getWidth(), Mano2.getHeight(), 1));
            Mano2.setIcon(imgRedimensionada2);
            ImageIcon imagen3 = new ImageIcon("CartasEspañolas/" + mano1.get(2).toString());
            ImageIcon imgRedimensionada3 = new ImageIcon(imagen3.getImage().getScaledInstance(Mano3.getWidth(), Mano3.getHeight(), 1));
            Mano3.setIcon(imgRedimensionada3);
            ImageIcon imagen4 = new ImageIcon("CartasEspañolas/" + mano1.get(3).toString());
            ImageIcon imgRedimensionada4 = new ImageIcon(imagen4.getImage().getScaledInstance(Mano4.getWidth(), Mano4.getHeight(), 1));
            Mano4.setIcon(imgRedimensionada4);
            ImageIcon imagen5 = new ImageIcon("CartasEspañolas/" + mano1.get(4).toString());
            ImageIcon imgRedimensionada5 = new ImageIcon(imagen5.getImage().getScaledInstance(Mano5.getWidth(), Mano5.getHeight(), 1));
            Mano5.setIcon(imgRedimensionada5);
        }
        catch(JugadorException je){
             JOptionPane.showMessageDialog(this, je.toString(), "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_JugarActionPerformed

    private void RetirarBeneficiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetirarBeneficiosActionPerformed
        // TODO add your handling code here:
        Beneficio.setText(String.valueOf(jugadorR.retirarBeneficios()));
        SaldoRestante.setText(String.valueOf(jugadorR.getSaldoAcumulado()));
    }//GEN-LAST:event_RetirarBeneficiosActionPerformed

    private void BeneficioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BeneficioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BeneficioActionPerformed

    private void ResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ResultadoActionPerformed

    private void CantidadApostadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CantidadApostadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CantidadApostadaActionPerformed

    private void SaldoRestanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaldoRestanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SaldoRestanteActionPerformed

    private void AumentaSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AumentaSaldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AumentaSaldoActionPerformed

    private void AumentarSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AumentarSaldoActionPerformed
        // TODO add your handling code here:
        jugadorR.aumentarSaldo(Double.parseDouble(AumentaSaldo.getText()));
        Resultado.setText(String.valueOf(jugadorR.getSaldoAcumulado()));
    }//GEN-LAST:event_AumentarSaldoActionPerformed

    private void FacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FacturaActionPerformed
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
            salida.println("Fecha de Registro: " + jugadorR.getFechaRegistro());
            salida.println("\n");
            salida.println("Beneficio: " + Beneficio.getText() + "€");
            salida.println("\n");
            salida.println("\n");
            salida.println("-------------------------------------------------------------------------------");
        } catch (IOException ex) {
            Logger.getLogger(VentanaMano.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            salida.close();
        }
    }//GEN-LAST:event_FacturaActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AumentaSaldo;
    private javax.swing.JButton AumentarSaldo;
    private javax.swing.JTextField Beneficio;
    private javax.swing.JTextField CantidadApostada;
    private javax.swing.JButton Factura;
    private javax.swing.JButton Jugar;
    private javax.swing.JLabel Mano1;
    private javax.swing.JLabel Mano2;
    private javax.swing.JLabel Mano3;
    private javax.swing.JLabel Mano4;
    private javax.swing.JLabel Mano5;
    private javax.swing.JTextField Resultado;
    private javax.swing.JButton RetirarBeneficios;
    private javax.swing.JTextField SaldoRestante;
    private javax.swing.JLabel SaldoResultante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
