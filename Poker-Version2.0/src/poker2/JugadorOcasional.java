/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker2;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Danil
 */
public final class JugadorOcasional extends Jugador {
    
    private String numTarjeta;

    /**
     *
     * @param numTarjeta
     * @param NIF
     * @param nombre
     * @param apellidos
     * @param fechaNacimiento
     * @param saldoAcumulado
     */
    public JugadorOcasional(String numTarjeta, String NIF, String nombre, String apellidos, LocalDate fechaNacimiento, double saldoAcumulado) {
        super(NIF, nombre, apellidos, fechaNacimiento, saldoAcumulado);
        this.numTarjeta = numTarjeta;
    }

    /**
     *
     * @return
     */
    public String getNumTarjeta() {
        return numTarjeta;
    }

    /**
     *
     * @param numTarjeta
     */
    public void setNumTarjeta(String numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    /**
     *
     * @return
     */
    @Override
    public double retirarBeneficios(){        //Metodo Abstracto que devuelve el saldo que tenia el jugador, y despues lo establece en 0
        double beneficio= super.getSaldoAcumulado();
        super.setSaldoAcumulado(0);
        return beneficio;
    }

    /**
     *
     * @param mano
     * @param apuesta
     */
    public void actualizaSaldo(ArrayList<Carta> mano,int apuesta){
        switch (Apuesta.verPremio(mano)) {
            case 10:
                super.setSaldoAcumulado(super.getSaldoAcumulado()-apuesta+(apuesta*6));         //El multiplicador del JugadorOcasional no tiene una relacion directa con
                break;                                                                          //el del JugadorRegistrado, por lo que establecemos su multiplicador
            case 8:                                                                             //dependiendo del de JugadorRegistrado
                super.setSaldoAcumulado(super.getSaldoAcumulado()-apuesta+(apuesta*5));
                break;
            case 6:
                super.setSaldoAcumulado(super.getSaldoAcumulado()-apuesta+(apuesta*4));
                break;
            case 4:
                super.setSaldoAcumulado(super.getSaldoAcumulado()-apuesta+(apuesta*3));
                break;
            default:
                super.setSaldoAcumulado(super.getSaldoAcumulado()-apuesta+(apuesta*Apuesta.verPremio(mano)));
                break;
        }
    }
}
