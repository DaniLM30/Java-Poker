/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker2;

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
     * @return
     */
    public String getFigura(){
        return figura;
    }
    
    public int compareTo(Carta c){
        String[] palos={"Oros","Copas","Espadas","Bastos"};   
        String[] figuras={"As","Dos","Tres","Cuatro","Cinco","Seis","Siete","Ocho","Nueve","Sota","Caballo","Rey"};
        ArrayList<String> p= new ArrayList<>();
        ArrayList<String> f= new ArrayList<>();
        
        p.addAll(Arrays.asList(palos));
        f.addAll(Arrays.asList(figuras));
        int paloComp=p.indexOf(this.palo)-p.indexOf(c.palo);
        if(paloComp == 0){
            paloComp=f.indexOf(this.figura)-f.indexOf(c.figura);
        }
        return paloComp;
    }
    
    @Override
    public String toString() {
        return figura + " de " + palo+ ".jpg";          //.jpg para mostrar la imagen directamente
    }
}
