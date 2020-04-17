/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesNormales;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Danil
 */
public class Carta implements Comparable<Carta>{
    
    private String palo,figura;
    
    /**
     *
     * @param palo
     * @param figura
     */
    public Carta(String palo, String figura) {          //La clase carta consta de un constructor que une palo y figura en un Objeto de tipo Carta
        this.palo = palo;
        this.figura = figura;
    }

    /**
     *
     * @return
     */
    public String getPalo() {
        return palo;
    }

    /**
     *
     * @param palo
     */
    public void setPalo(String palo) {
        this.palo = palo;
    }

    /**
     *
     * @return
     */
    public String getFigura() {
        return figura;
    }

    /**
     *
     * @param figura
     */
    public void setFigura(String figura) {
        this.figura = figura;
    }
    
    @Override
    public int compareTo(Carta c){  
        String[] figuras={"As","Dos","Tres","Cuatro","Cinco","Seis","Siete","Ocho","Nueve","Sota","Caballo","Rey"};
        ArrayList<String> f= new ArrayList<>();
        
        f.addAll(Arrays.asList(figuras));
        int figComp=f.indexOf(this.figura)-f.indexOf(c.figura);
        return figComp;
    }
    
    @Override
    public String toString() {
        return figura + " de " + palo+ ".jpg";          //.jpg para mostrar la imagen directamente
    }
    
}
