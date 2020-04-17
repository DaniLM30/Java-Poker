/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker2;

import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author Danil
 */
public class Apuesta {
    private final static String[] palos={"Oros","Copas","Espadas","Bastos"};   //palos y figuras son dos Arrays de String que contienen los palos y las figuras posibles
    private final static String[] figuras={"As","Dos","Tres","Cuatro","Cinco","Seis","Siete","Ocho","Nueve","Sota","Caballo","Rey"};
    private Jugador jugador;

    /**
     *
     * @param jugador
     */
    public Apuesta(Jugador jugador) {
        this.jugador = jugador;
    }

    /**
     *
     * @return
     */
    public Jugador getJugador() {
        return jugador;
    }

    /**
     *
     * @param jugador
     */
    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }
    
    /**
     *
     * @param mano
     * @return
     */
    public static int verPremio(ArrayList<Carta> mano){
        ArrayList<String> palMano= new ArrayList<>();         //palMano y palFig son arrays con los palos y figuras de la mano
        ArrayList<String> figMano= new ArrayList<>();
        ArrayList<Integer> frP=new ArrayList<>();             //frP y frF son arrays con la frecuencia de aparicion de cada palo y figura, dentro de la mano
        ArrayList<Integer> frF=new ArrayList<>();
        int premio;                                           //Instanciamos un contador que sera el multiplicador del premio
        for (int i = 0; i < mano.size(); i++) {
            palMano.add(mano.get(i).getPalo());               //Llenamos los dos ArrayList a partir de nuestra mano
            figMano.add(mano.get(i).getFigura());
        }
        for (int i = 0; i < palos.length; i++) {
            frP.add(Collections.frequency(palMano, palos[i]));
        }                                                           //Llenamos frP y frF a partir de las frecuencias de los palos y figuras
        for (int i = 0; i < figuras.length; i++) {
            frF.add(Collections.frequency(figMano, figuras[i]));
        }
        if (Collections.frequency(frF,2)==1){                       //Si solamente hay un 2, Pareja
            premio=1;
        }
        else if(Collections.frequency(frF, 2)==2){                  //Si hay dos 2, Doble Pareja
            premio=2;
        }
        else if(Collections.frequency(frF,3)==1){                   //Si hay un 3, Trio
            premio=4;
        }
        else if(Collections.frequency(frP,5)==1){                   //Si hay un 5, Color
            premio=6;
        }
        else if(Collections.frequency(frF,2)==1 && Collections.frequency(frF,3)==1){        //Si hay un 2 y un 3, Full
            premio=8;
        }
        else if(Collections.frequency(frF,4)==1){                   //Si hay un 4, Poker
            premio=10;
        }
        else{
            premio=0;                   //Si no hay nada, el multiplicador es 0
        }
        
        return premio;
    }
}
