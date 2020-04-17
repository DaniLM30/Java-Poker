/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesNormales;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Danil
 */
public class JugadorRegistrado extends Jugador implements Serializable {
    
    private String numCuentaBanc;
    private String contraseña;
    private LocalDate fechaRegistro;
    private ArrayList<Premio> premios;
    
    /**
     *
     * @param numCuentaBanc
     * @param contraseña
     * @param fechaRegistro
     * @param NIF
     * @param nombre
     * @param apellidos
     * @param fechaNacimiento
     * @param saldoAcumulado
     * @param premios
     */
    public JugadorRegistrado(String numCuentaBanc, String contraseña, LocalDate fechaRegistro, String NIF, String nombre, String apellidos, 
    LocalDate fechaNacimiento, double saldoAcumulado, ArrayList<Premio> premios) {       
        super(NIF, nombre, apellidos, fechaNacimiento, saldoAcumulado);
        this.numCuentaBanc = numCuentaBanc;
        this.contraseña = contraseña;
        this.fechaRegistro = fechaRegistro;
        this.premios= premios;
    }

    /**
     *
     * @return
     */
    public ArrayList<Premio> getPremios() {
        return premios;
    }

    /**
     *
     * @param premio
     */
    public void añadirPremios(Premio premio) {
        this.premios.add(premio);
    }

    /**
     *
     * @return
     */
    public String getNumCuentaBanc() {
        return numCuentaBanc;
    }

    /**
     *
     * @param numCuentaBanc
     */
    public void setNumCuentaBanc(String numCuentaBanc) {
        this.numCuentaBanc = numCuentaBanc;
    }

    /**
     *
     * @return
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     *
     * @param contraseña
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    /**
     *
     * @return
     */
    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    /**
     *
     * @param fechaRegistro
     */
    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    
    /**
     *
     * @return
     */
    @Override
    public double retirarBeneficios(){            //Metodo Abstracto que devuelve el saldo del jugador con un aumento del 2% por año registrado
        double beneficio= super.getSaldoAcumulado()*(1+(0.02*(LocalDate.now().getYear()-this.getFechaRegistro().getYear())));
        super.setSaldoAcumulado(0);
        return beneficio;
    }
    
    /**
     *
     * @param mano
     * @param apuesta
     */
    public void actualizaSaldo(ArrayList<Carta> mano,int apuesta){      //Actualizamos el saldo del jugador dependiendo del multiplicador de premio
        super.setSaldoAcumulado(super.getSaldoAcumulado()-apuesta+(apuesta*Apuesta.verPremio(mano)));
    }
    
    @Override
    public String toString() {
        return super.toString() + ",numCuentaBanc=" + numCuentaBanc + ", contrase\u00f1a=" + contraseña + ", fechaRegistro=" + fechaRegistro + '}';
    }
    
}
