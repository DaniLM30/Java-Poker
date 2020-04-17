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
import java.time.LocalDate;
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
public class VentanaMesa extends javax.swing.JFrame {
    DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    ArrayList<Carta> barajaR= new ArrayList<>(); 
    ArrayList<Carta> manoR1= new ArrayList<>();
    ArrayList<Carta> manoR2= new ArrayList<>();
    ArrayList<Carta> manoR3= new ArrayList<>();
    ArrayList<Carta> manoR4= new ArrayList<>();
    ArrayList<ArrayList<Carta>> manos= new ArrayList<>();
    ArrayList<Carta> barajaActualizada1=new ArrayList<>();
    ArrayList<Carta> barajaActualizada2=new ArrayList<>();
    ArrayList<Carta> barajaActualizada3= new ArrayList<>();
    ArrayList<JugadorRegistrado> jugadoresMesa= new ArrayList<>();
    JugadorRegistrado jugadorR1= VentanaInicial.jr;
    JugadorRegistrado jugadorR2= new JugadorRegistrado("0123456789","1234",LocalDate.now(),"09001070C","Carlos","Martín García",LocalDate.parse("30/12/1996",df),0,new ArrayList<>());
    JugadorRegistrado jugadorR3= new JugadorRegistrado("0987654321","4321",LocalDate.now(),"03217278P","Marta","Lahoz Moreno",LocalDate.parse("27/11/1990",df),0,new ArrayList<>());
    JugadorRegistrado jugadorR4= new JugadorRegistrado("0246813579","2413",LocalDate.now(),"09001071D","Mario","Martinez Rodriguez",LocalDate.parse("12/09/1989",df),0,new ArrayList<>());
    /**
     * Creates new form VentanaMesa
     */
    public VentanaMesa() {
        initComponents();
        ImageIcon imagenTapete = new ImageIcon("CartasEspañolas/tapete.jpg");
        ImageIcon imgRedimensionadaTapete = new ImageIcon(imagenTapete.getImage().getScaledInstance(jLabelTapete.getWidth(), jLabelTapete.getHeight(), 1));
        jLabelTapete.setIcon(imgRedimensionadaTapete );
        jugadoresMesa.add(jugadorR1);
        jugadoresMesa.add(jugadorR2);
        jugadoresMesa.add(jugadorR3);
        jugadoresMesa.add(jugadorR4);
        jTextFieldResultado1.setText("0");
        jTextFieldResultado2.setText("0");
        jTextFieldResultado3.setText("0");
        jTextFieldResultado4.setText("0");
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

        jTextFieldApuesta = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelCarta1_1 = new javax.swing.JLabel();
        jLabelCarta1_2 = new javax.swing.JLabel();
        jLabelCarta1_3 = new javax.swing.JLabel();
        jLabelCarta1_4 = new javax.swing.JLabel();
        jLabelCarta1_5 = new javax.swing.JLabel();
        jLabelCarta3_1 = new javax.swing.JLabel();
        jLabelCarta3_2 = new javax.swing.JLabel();
        jLabelCarta3_3 = new javax.swing.JLabel();
        jLabelCarta3_4 = new javax.swing.JLabel();
        jLabelCarta3_5 = new javax.swing.JLabel();
        jLabelCarta4_1 = new javax.swing.JLabel();
        jLabelCarta4_2 = new javax.swing.JLabel();
        jLabelCarta4_3 = new javax.swing.JLabel();
        jLabelCarta4_4 = new javax.swing.JLabel();
        jLabelCarta4_5 = new javax.swing.JLabel();
        jLabelCarta2_1 = new javax.swing.JLabel();
        jLabelCarta2_2 = new javax.swing.JLabel();
        jLabelCarta2_3 = new javax.swing.JLabel();
        jLabelCarta2_4 = new javax.swing.JLabel();
        jLabelCarta2_5 = new javax.swing.JLabel();
        jButtonJugar = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jTextFieldAumentarSaldo = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jButtonAumentarJ1 = new javax.swing.JButton();
        jButtonAumentarJ2 = new javax.swing.JButton();
        jButtonAumentarJ3 = new javax.swing.JButton();
        jButtonAumentarJ4 = new javax.swing.JButton();
        jTextFieldGanador = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabelJ1 = new javax.swing.JLabel();
        jLabelJ2 = new javax.swing.JLabel();
        jLabelJ3 = new javax.swing.JLabel();
        jLabelJ4 = new javax.swing.JLabel();
        jTextFieldResultado3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldResultado2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldResultado1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldResultado4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButtonFactura = new javax.swing.JButton();
        jButtonRetirarBeneficio = new javax.swing.JButton();
        jTextFieldBeneficio = new javax.swing.JTextField();
        jLabelTapete = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("POKERFLOW");
        setMinimumSize(new java.awt.Dimension(1070, 940));
        setResizable(false);
        getContentPane().setLayout(null);
        getContentPane().add(jTextFieldApuesta);
        jTextFieldApuesta.setBounds(961, 779, 80, 67);

        jLabel1.setText("€");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(1048, 779, 7, 67);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Apuesta:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(940, 744, 101, 28);
        getContentPane().add(jLabelCarta1_1);
        jLabelCarta1_1.setBounds(272, 730, 80, 100);
        getContentPane().add(jLabelCarta1_2);
        jLabelCarta1_2.setBounds(370, 730, 80, 100);
        getContentPane().add(jLabelCarta1_3);
        jLabelCarta1_3.setBounds(468, 730, 80, 100);
        getContentPane().add(jLabelCarta1_4);
        jLabelCarta1_4.setBounds(566, 730, 80, 100);
        getContentPane().add(jLabelCarta1_5);
        jLabelCarta1_5.setBounds(664, 730, 80, 100);
        getContentPane().add(jLabelCarta3_1);
        jLabelCarta3_1.setBounds(272, 13, 80, 108);
        getContentPane().add(jLabelCarta3_2);
        jLabelCarta3_2.setBounds(370, 13, 80, 108);

        jLabelCarta3_3.setToolTipText("");
        getContentPane().add(jLabelCarta3_3);
        jLabelCarta3_3.setBounds(468, 13, 80, 108);
        getContentPane().add(jLabelCarta3_4);
        jLabelCarta3_4.setBounds(571, 13, 75, 108);
        getContentPane().add(jLabelCarta3_5);
        jLabelCarta3_5.setBounds(664, 13, 80, 108);
        getContentPane().add(jLabelCarta4_1);
        jLabelCarta4_1.setBounds(51, 87, 80, 100);
        getContentPane().add(jLabelCarta4_2);
        jLabelCarta4_2.setBounds(51, 194, 80, 100);
        getContentPane().add(jLabelCarta4_3);
        jLabelCarta4_3.setBounds(51, 301, 80, 100);
        getContentPane().add(jLabelCarta4_4);
        jLabelCarta4_4.setBounds(51, 408, 80, 100);
        getContentPane().add(jLabelCarta4_5);
        jLabelCarta4_5.setBounds(51, 532, 80, 100);
        getContentPane().add(jLabelCarta2_1);
        jLabelCarta2_1.setBounds(882, 87, 80, 100);
        getContentPane().add(jLabelCarta2_2);
        jLabelCarta2_2.setBounds(882, 194, 80, 100);
        getContentPane().add(jLabelCarta2_3);
        jLabelCarta2_3.setBounds(882, 312, 80, 100);
        getContentPane().add(jLabelCarta2_4);
        jLabelCarta2_4.setBounds(882, 425, 80, 100);
        getContentPane().add(jLabelCarta2_5);
        jLabelCarta2_5.setBounds(882, 532, 80, 100);

        jButtonJugar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonJugar.setText("JUGAR");
        jButtonJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonJugarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonJugar);
        jButtonJugar.setBounds(370, 174, 249, 99);

        jLabel23.setText("Aumentar Saldo:");
        getContentPane().add(jLabel23);
        jLabel23.setBounds(82, 757, 105, 16);
        getContentPane().add(jTextFieldAumentarSaldo);
        jTextFieldAumentarSaldo.setBounds(82, 780, 82, 66);

        jLabel24.setText("€");
        getContentPane().add(jLabel24);
        jLabel24.setBounds(169, 805, 7, 16);

        jButtonAumentarJ1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonAumentarJ1.setText("J1");
        jButtonAumentarJ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAumentarJ1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAumentarJ1);
        jButtonAumentarJ1.setBounds(12, 853, 49, 38);

        jButtonAumentarJ2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonAumentarJ2.setText("J2");
        jButtonAumentarJ2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAumentarJ2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAumentarJ2);
        jButtonAumentarJ2.setBounds(68, 853, 49, 38);

        jButtonAumentarJ3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonAumentarJ3.setText("J3");
        jButtonAumentarJ3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAumentarJ3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAumentarJ3);
        jButtonAumentarJ3.setBounds(124, 853, 49, 38);

        jButtonAumentarJ4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonAumentarJ4.setText("J4");
        jButtonAumentarJ4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAumentarJ4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAumentarJ4);
        jButtonAumentarJ4.setBounds(180, 853, 49, 38);

        jTextFieldGanador.setEditable(false);
        jTextFieldGanador.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextFieldGanador.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldGanador.setText("--");
        getContentPane().add(jTextFieldGanador);
        jTextFieldGanador.setBounds(370, 532, 249, 57);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("GANADOR");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(370, 486, 249, 39);

        jLabelJ1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelJ1.setText("J1:");
        getContentPane().add(jLabelJ1);
        jLabelJ1.setBounds(272, 674, 27, 49);

        jLabelJ2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelJ2.setText("J2:");
        getContentPane().add(jLabelJ2);
        jLabelJ2.setBounds(753, 135, 27, 52);

        jLabelJ3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelJ3.setText("J3:");
        getContentPane().add(jLabelJ3);
        jLabelJ3.setBounds(751, 13, 27, 48);

        jLabelJ4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelJ4.setText("J4:");
        getContentPane().add(jLabelJ4);
        jLabelJ4.setBounds(138, 135, 27, 52);

        jTextFieldResultado3.setEditable(false);
        getContentPane().add(jTextFieldResultado3);
        jTextFieldResultado3.setBounds(783, 13, 96, 48);

        jLabel4.setText("€");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(884, 13, 7, 48);

        jTextFieldResultado2.setEditable(false);
        getContentPane().add(jTextFieldResultado2);
        jTextFieldResultado2.setBounds(753, 194, 87, 50);

        jLabel5.setText("€");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(845, 197, 7, 45);

        jTextFieldResultado1.setEditable(false);
        getContentPane().add(jTextFieldResultado1);
        jTextFieldResultado1.setBounds(304, 674, 85, 49);

        jLabel6.setText("€");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(394, 674, 7, 49);

        jTextFieldResultado4.setEditable(false);
        getContentPane().add(jTextFieldResultado4);
        jTextFieldResultado4.setBounds(138, 194, 100, 50);

        jLabel7.setText("€");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(243, 194, 7, 50);

        jButtonFactura.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonFactura.setText("Imprimir Factura (J1)");
        jButtonFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFacturaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonFactura);
        jButtonFactura.setBounds(370, 300, 250, 50);

        jButtonRetirarBeneficio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonRetirarBeneficio.setText("Retirar Beneficio (J1)");
        jButtonRetirarBeneficio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRetirarBeneficioActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRetirarBeneficio);
        jButtonRetirarBeneficio.setBounds(370, 360, 250, 50);

        jTextFieldBeneficio.setEditable(false);
        getContentPane().add(jTextFieldBeneficio);
        jTextFieldBeneficio.setBounds(370, 420, 250, 30);
        getContentPane().add(jLabelTapete);
        jLabelTapete.setBounds(10, 10, 1080, 890);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAumentarJ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAumentarJ1ActionPerformed
        // TODO add your handling code here:
        jugadorR1.aumentarSaldo(Double.parseDouble(jTextFieldAumentarSaldo.getText()));
        jTextFieldResultado1.setText(String.valueOf(jugadorR1.getSaldoAcumulado()));
    }//GEN-LAST:event_jButtonAumentarJ1ActionPerformed

    private void jButtonAumentarJ2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAumentarJ2ActionPerformed
        // TODO add your handling code here:
        jugadorR2.aumentarSaldo(Double.parseDouble(jTextFieldAumentarSaldo.getText()));
        jTextFieldResultado2.setText(String.valueOf(jugadorR2.getSaldoAcumulado()));
    }//GEN-LAST:event_jButtonAumentarJ2ActionPerformed

    private void jButtonAumentarJ3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAumentarJ3ActionPerformed
        // TODO add your handling code here:
        jugadorR3.aumentarSaldo(Double.parseDouble(jTextFieldAumentarSaldo.getText()));
        jTextFieldResultado3.setText(String.valueOf(jugadorR3.getSaldoAcumulado()));
    }//GEN-LAST:event_jButtonAumentarJ3ActionPerformed

    private void jButtonAumentarJ4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAumentarJ4ActionPerformed
        // TODO add your handling code here:
        jugadorR4.aumentarSaldo(Double.parseDouble(jTextFieldAumentarSaldo.getText()));
        jTextFieldResultado4.setText(String.valueOf(jugadorR4.getSaldoAcumulado()));
    }//GEN-LAST:event_jButtonAumentarJ4ActionPerformed

    private void jButtonJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonJugarActionPerformed
        // TODO add your handling code here:
        try{
            if(Integer.parseInt(jTextFieldApuesta.getText())>jugadorR1.getSaldoAcumulado() || Integer.parseInt(jTextFieldApuesta.getText())>jugadorR2.getSaldoAcumulado()|| 
               Integer.parseInt(jTextFieldApuesta.getText())>jugadorR3.getSaldoAcumulado() || Integer.parseInt(jTextFieldApuesta.getText())>jugadorR4.getSaldoAcumulado() ){
                throw new JugadorException(JugadorException.SALDO_INSUFICIENTE_MESA);
            }

            double dineroInicial=Double.parseDouble(jTextFieldResultado1.getText());
            manos.clear();
            manoR1.clear();
            manoR2.clear();
            manoR3.clear();
            manoR4.clear();
            barajaR= Baraja.creaBaraja();
            manoR1= Baraja.creaMano(barajaR);
            barajaActualizada1= Baraja.actualizaBaraja(barajaR, manoR1);
            manoR2= Baraja.creaMano(barajaActualizada1);
            barajaActualizada2= Baraja.actualizaBaraja(barajaActualizada1, manoR2);
            manoR3=Baraja.creaMano(barajaActualizada2);
            barajaActualizada3= Baraja.actualizaBaraja(barajaActualizada2, manoR3);
            manoR4=Baraja.creaMano(barajaActualizada3);
            barajaR.clear();
            manos.add(manoR1);
            manos.add(manoR2);
            manos.add(manoR3);
            manos.add(manoR4);    
        
            jTextFieldResultado1.setText(String.valueOf(jugadorR1.getSaldoAcumulado()));
            ImageIcon imagen1_1 = new ImageIcon("CartasEspañolas/" + manoR1.get(0).toString());
            ImageIcon imgRedimensionada1_1 = new ImageIcon(imagen1_1.getImage().getScaledInstance(jLabelCarta1_1.getWidth(), jLabelCarta1_1.getHeight(), 1));
            jLabelCarta1_1.setIcon(imgRedimensionada1_1);
            ImageIcon imagen1_2 = new ImageIcon("CartasEspañolas/" + manoR1.get(1).toString());
            ImageIcon imgRedimensionada1_2 = new ImageIcon(imagen1_2.getImage().getScaledInstance(jLabelCarta1_2.getWidth(), jLabelCarta1_2.getHeight(), 1));
            jLabelCarta1_2.setIcon(imgRedimensionada1_2);
            ImageIcon imagen1_3 = new ImageIcon("CartasEspañolas/" + manoR1.get(2).toString());
            ImageIcon imgRedimensionada1_3 = new ImageIcon(imagen1_3.getImage().getScaledInstance(jLabelCarta1_3.getWidth(), jLabelCarta1_3.getHeight(), 1));
            jLabelCarta1_3.setIcon(imgRedimensionada1_3);
            ImageIcon imagen1_4 = new ImageIcon("CartasEspañolas/" + manoR1.get(3).toString());
            ImageIcon imgRedimensionada1_4 = new ImageIcon(imagen1_4.getImage().getScaledInstance(jLabelCarta1_4.getWidth(), jLabelCarta1_4.getHeight(), 1));
            jLabelCarta1_4.setIcon(imgRedimensionada1_4);
            ImageIcon imagen1_5 = new ImageIcon("CartasEspañolas/" + manoR1.get(4).toString());
            ImageIcon imgRedimensionada1_5 = new ImageIcon(imagen1_5.getImage().getScaledInstance(jLabelCarta1_5.getWidth(), jLabelCarta1_5.getHeight(), 1));
            jLabelCarta1_5.setIcon(imgRedimensionada1_5);
        
            jTextFieldResultado2.setText(String.valueOf(jugadorR2.getSaldoAcumulado()));
            ImageIcon imagen2_1 = new ImageIcon("CartasEspañolas/" + manoR2.get(0).toString());
            ImageIcon imgRedimensionada2_1 = new ImageIcon(imagen2_1.getImage().getScaledInstance(jLabelCarta2_1.getWidth(), jLabelCarta2_1.getHeight(), 1));
            jLabelCarta2_1.setIcon(imgRedimensionada2_1);
            ImageIcon imagen2_2 = new ImageIcon("CartasEspañolas/" + manoR2.get(1).toString());
            ImageIcon imgRedimensionada2_2 = new ImageIcon(imagen2_2.getImage().getScaledInstance(jLabelCarta2_2.getWidth(), jLabelCarta2_2.getHeight(), 1));
            jLabelCarta2_2.setIcon(imgRedimensionada2_2);
            ImageIcon imagen2_3 = new ImageIcon("CartasEspañolas/" + manoR2.get(2).toString());
            ImageIcon imgRedimensionada2_3 = new ImageIcon(imagen2_3.getImage().getScaledInstance(jLabelCarta2_3.getWidth(), jLabelCarta2_3.getHeight(), 1));
            jLabelCarta2_3.setIcon(imgRedimensionada2_3);
            ImageIcon imagen2_4 = new ImageIcon("CartasEspañolas/" + manoR2.get(3).toString());
            ImageIcon imgRedimensionada2_4 = new ImageIcon(imagen2_4.getImage().getScaledInstance(jLabelCarta2_4.getWidth(), jLabelCarta2_4.getHeight(), 1));
            jLabelCarta2_4.setIcon(imgRedimensionada2_4);
            ImageIcon imagen2_5 = new ImageIcon("CartasEspañolas/" + manoR2.get(4).toString());
            ImageIcon imgRedimensionada2_5 = new ImageIcon(imagen2_5.getImage().getScaledInstance(jLabelCarta2_5.getWidth(), jLabelCarta2_5.getHeight(), 1));
            jLabelCarta2_5.setIcon(imgRedimensionada2_5);
        
            jTextFieldResultado3.setText(String.valueOf(jugadorR3.getSaldoAcumulado()));
            ImageIcon imagen3_1 = new ImageIcon("CartasEspañolas/" + manoR3.get(0).toString());
            ImageIcon imgRedimensionada3_1 = new ImageIcon(imagen3_1.getImage().getScaledInstance(jLabelCarta3_1.getWidth(), jLabelCarta3_1.getHeight(), 1));
            jLabelCarta3_1.setIcon(imgRedimensionada3_1);
            ImageIcon imagen3_2 = new ImageIcon("CartasEspañolas/" + manoR3.get(1).toString());
            ImageIcon imgRedimensionada3_2 = new ImageIcon(imagen3_2.getImage().getScaledInstance(jLabelCarta3_2.getWidth(), jLabelCarta3_2.getHeight(), 1));
            jLabelCarta3_2.setIcon(imgRedimensionada3_2);
            ImageIcon imagen3_3 = new ImageIcon("CartasEspañolas/" + manoR3.get(2).toString());
            ImageIcon imgRedimensionada3_3 = new ImageIcon(imagen3_3.getImage().getScaledInstance(jLabelCarta3_3.getWidth(), jLabelCarta3_3.getHeight(), 1));
            jLabelCarta3_3.setIcon(imgRedimensionada3_3);
            ImageIcon imagen3_4 = new ImageIcon("CartasEspañolas/" + manoR3.get(3).toString());
            ImageIcon imgRedimensionada3_4 = new ImageIcon(imagen3_4.getImage().getScaledInstance(jLabelCarta3_4.getWidth(), jLabelCarta3_4.getHeight(), 1));
            jLabelCarta3_4.setIcon(imgRedimensionada3_4);
            ImageIcon imagen3_5 = new ImageIcon("CartasEspañolas/" + manoR3.get(4).toString());
            ImageIcon imgRedimensionada3_5 = new ImageIcon(imagen3_5.getImage().getScaledInstance(jLabelCarta3_5.getWidth(), jLabelCarta3_5.getHeight(), 1));
            jLabelCarta3_5.setIcon(imgRedimensionada3_5);
        
            jTextFieldResultado4.setText(String.valueOf(jugadorR4.getSaldoAcumulado()));
            ImageIcon imagen4_1 = new ImageIcon("CartasEspañolas/" + manoR4.get(0).toString());
            ImageIcon imgRedimensionada4_1 = new ImageIcon(imagen4_1.getImage().getScaledInstance(jLabelCarta4_1.getWidth(), jLabelCarta4_1.getHeight(), 1));
            jLabelCarta4_1.setIcon(imgRedimensionada4_1);
            ImageIcon imagen4_2 = new ImageIcon("CartasEspañolas/" + manoR4.get(1).toString());
            ImageIcon imgRedimensionada4_2 = new ImageIcon(imagen4_2.getImage().getScaledInstance(jLabelCarta4_2.getWidth(), jLabelCarta4_2.getHeight(), 1));
            jLabelCarta4_2.setIcon(imgRedimensionada4_2);
            ImageIcon imagen4_3 = new ImageIcon("CartasEspañolas/" + manoR4.get(2).toString());
            ImageIcon imgRedimensionada4_3 = new ImageIcon(imagen4_3.getImage().getScaledInstance(jLabelCarta4_3.getWidth(), jLabelCarta4_3.getHeight(), 1));
            jLabelCarta4_3.setIcon(imgRedimensionada4_3);
            ImageIcon imagen4_4 = new ImageIcon("CartasEspañolas/" + manoR4.get(3).toString());
            ImageIcon imgRedimensionada4_4 = new ImageIcon(imagen4_4.getImage().getScaledInstance(jLabelCarta4_4.getWidth(), jLabelCarta4_4.getHeight(), 1));
            jLabelCarta4_4.setIcon(imgRedimensionada4_4);
            ImageIcon imagen4_5 = new ImageIcon("CartasEspañolas/" + manoR4.get(4).toString());
            ImageIcon imgRedimensionada4_5 = new ImageIcon(imagen4_5.getImage().getScaledInstance(jLabelCarta4_5.getWidth(), jLabelCarta4_5.getHeight(), 1));
            jLabelCarta4_5.setIcon(imgRedimensionada4_5);
        
            int ganador= Apuesta.comparadorMesa(manoR1, manoR2, manoR3, manoR4);
            jTextFieldGanador.setText(String.valueOf(ganador));
            CasaApuestas.actualizarSaldos(jugadoresMesa,manos, ganador-1,Integer.parseInt(jTextFieldApuesta.getText()));
            jTextFieldResultado1.setText(String.valueOf(jugadorR1.getSaldoAcumulado()));
            jTextFieldResultado2.setText(String.valueOf(jugadorR2.getSaldoAcumulado()));
            jTextFieldResultado3.setText(String.valueOf(jugadorR3.getSaldoAcumulado()));
            jTextFieldResultado4.setText(String.valueOf(jugadorR4.getSaldoAcumulado()));
        
            double ganancia= Double.parseDouble(jTextFieldResultado1.getText())-dineroInicial;
            Premio premio= new Premio(ganancia,"Mesa",Apuesta.verPremioTexto(Apuesta.verPremio(manoR1)));
            jugadorR1.añadirPremios(premio);
            CasaApuestas.nuevoPremio(premio);
            
        } catch(JugadorException je){
            JOptionPane.showMessageDialog(this, je.toString(), "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButtonJugarActionPerformed

    private void jButtonRetirarBeneficioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRetirarBeneficioActionPerformed
        // TODO add your handling code here:
        jTextFieldBeneficio.setText(String.valueOf(jugadorR1.retirarBeneficios()));
        jTextFieldResultado1.setText(String.valueOf(jugadorR1.getSaldoAcumulado()));
    }//GEN-LAST:event_jButtonRetirarBeneficioActionPerformed

    private void jButtonFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFacturaActionPerformed
        // TODO add your handling code here:
        PrintWriter salida = null;
        try {
            // TODO add your handling code here:    public static void generaFicha(Persona per) throws IOException {
            salida = new PrintWriter(new BufferedWriter(new FileWriter(jugadorR1.getNIF() + ".txt")));
            salida.println("-------------------------------- Ficha "+ jugadorR1.getNombre() +" --------------------------------");
            salida.println("\n");
            salida.println("DNI: " + jugadorR1.getNIF());
            salida.println("\n");
            salida.println("Nombre: " + jugadorR1.getNombre());
            salida.println("\n");
            salida.println("Fecha de nacimiento: " + jugadorR1.getFechaNacimiento());
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
    }//GEN-LAST:event_jButtonFacturaActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaMesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaMesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaMesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaMesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaMesa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAumentarJ1;
    private javax.swing.JButton jButtonAumentarJ2;
    private javax.swing.JButton jButtonAumentarJ3;
    private javax.swing.JButton jButtonAumentarJ4;
    private javax.swing.JButton jButtonFactura;
    private javax.swing.JButton jButtonJugar;
    private javax.swing.JButton jButtonRetirarBeneficio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelCarta1_1;
    private javax.swing.JLabel jLabelCarta1_2;
    private javax.swing.JLabel jLabelCarta1_3;
    private javax.swing.JLabel jLabelCarta1_4;
    private javax.swing.JLabel jLabelCarta1_5;
    private javax.swing.JLabel jLabelCarta2_1;
    private javax.swing.JLabel jLabelCarta2_2;
    private javax.swing.JLabel jLabelCarta2_3;
    private javax.swing.JLabel jLabelCarta2_4;
    private javax.swing.JLabel jLabelCarta2_5;
    private javax.swing.JLabel jLabelCarta3_1;
    private javax.swing.JLabel jLabelCarta3_2;
    private javax.swing.JLabel jLabelCarta3_3;
    private javax.swing.JLabel jLabelCarta3_4;
    private javax.swing.JLabel jLabelCarta3_5;
    private javax.swing.JLabel jLabelCarta4_1;
    private javax.swing.JLabel jLabelCarta4_2;
    private javax.swing.JLabel jLabelCarta4_3;
    private javax.swing.JLabel jLabelCarta4_4;
    private javax.swing.JLabel jLabelCarta4_5;
    private javax.swing.JLabel jLabelJ1;
    private javax.swing.JLabel jLabelJ2;
    private javax.swing.JLabel jLabelJ3;
    private javax.swing.JLabel jLabelJ4;
    private javax.swing.JLabel jLabelTapete;
    private javax.swing.JTextField jTextFieldApuesta;
    private javax.swing.JTextField jTextFieldAumentarSaldo;
    private javax.swing.JTextField jTextFieldBeneficio;
    private javax.swing.JTextField jTextFieldGanador;
    private javax.swing.JTextField jTextFieldResultado1;
    private javax.swing.JTextField jTextFieldResultado2;
    private javax.swing.JTextField jTextFieldResultado3;
    private javax.swing.JTextField jTextFieldResultado4;
    // End of variables declaration//GEN-END:variables
}
