/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesNormales;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author Danil
 */
public abstract class Jugador implements Serializable {
    private String NIF;
    private String nombre;
    private String apellidos;
    private LocalDate fechaNacimiento;
    private double saldoAcumulado;
    
    /**
     *
     * @param NIF
     * @param nombre
     * @param apellidos
     * @param fechaNacimiento
     * @param saldoAcumulado
     */
    public Jugador(String NIF, String nombre, String apellidos, LocalDate fechaNacimiento, double saldoAcumulado) {
        this.NIF = NIF;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.saldoAcumulado = saldoAcumulado;
    }

    /**
     *
     * @return
     */
    public String getNIF() {
        return NIF;
    }

    /**
     *
     * @param NIF
     */
    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     *
     * @param apellidos
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     *
     * @return
     */
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     *
     * @param fechaNacimiento
     */
    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     *
     * @return
     */
    public double getSaldoAcumulado() {
        return saldoAcumulado;
    }

    /**
     *
     * @param saldoAcumulado
     */
    public void setSaldoAcumulado(double saldoAcumulado) {
        this.saldoAcumulado = saldoAcumulado;
    }
    
    /**
     *
     * @param saldo
     */
    public  void aumentarSaldo(double saldo){
        this.saldoAcumulado+=saldo;              //Aumentamos el saldo del jugador
    }
    
    /**
     *
     * @return
     */
    abstract public double retirarBeneficios();
    
    @Override
    public String toString() {
        return "NIF=" + NIF + ", nombre=" + nombre + ", apellidos=" + apellidos + ", fechaNacimiento=" + fechaNacimiento + ", saldoAcumulado=" + saldoAcumulado ;
    }
}
