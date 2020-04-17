/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesNormales;

/**
 *
 * @author Danil
 */
public class Premio {
    
    private double importe;    
    private String tipoJuego;   
    private String tipoPremio;

    /**
     *
     * @param importe
     * @param tipoJuego
     * @param tipoPremio
     */
    public Premio(double importe, String tipoJuego, String tipoPremio) {
        this.importe = importe;
        this.tipoJuego = tipoJuego;
        this.tipoPremio = tipoPremio;
    }
    
    /**
     *
     * @return
     */
    public String getTipoPremio() {
        return tipoPremio;
    }

    /**
     *
     * @param tipoPremio
     */
    public void setTipoPremio(String tipoPremio) {
        this.tipoPremio = tipoPremio;
    }

    /**
     *
     * @return
     */
    public String getTipoJuego() {
        return tipoJuego;
    }

    /**
     *
     * @param tipoJuego
     */
    public void setTipoJuego(String tipoJuego) {
        this.tipoJuego = tipoJuego;
    }

    /**
     *
     * @return
     */
    public double getImporte() {
        return importe;
    }

    /**
     *
     * @param importe
     */
    public void setImporte(double importe) {
        this.importe = importe;
    }

    @Override
    public String toString() {
        return "Premio{" + "importe=" + importe + ", tipoJuego=" + tipoJuego + ", tipoPremio=" + tipoPremio + '}';
    }

}
