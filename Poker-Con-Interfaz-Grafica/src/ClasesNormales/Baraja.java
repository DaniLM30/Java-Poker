/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesNormales;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Danil
 */
public class Baraja {
    
   private static ArrayList<Carta> baraja= new ArrayList<>();       //Tanto baraja como mano son ArrayList de tipo Carta
   private static String[] palos={"Oros","Copas","Espadas","Bastos"};   //palos y figuras son dos Arrays de String que contienen los palos y las figuras posibles
   private static String[] figuras={"As","Dos","Tres","Cuatro","Cinco","Seis","Siete","Ocho","Nueve","Sota","Caballo","Rey"};
   
    /**
     *
     * @return
     */
    public static ArrayList<Carta> creaBaraja(){ 
        for (int palo=0; palo<4; palo++) {
            for (int fig = 0; fig < 12; fig++) {
                baraja.add(new Carta(palos[palo],figuras[fig]));       //Creamos nuestra baraja añadiendo combinaciones de palos y figuras en Objetos de tipo Carta
            }
            
        }
        return baraja;
    } 
   
    /**
     *
     * @param baraja
     * @return
     */
    public static ArrayList<Carta> creaMano(ArrayList<Carta> baraja){
        ArrayList<Carta> mano= new ArrayList<>();
        Random aleatorio = new Random();
        mano.clear();
        for (int i = 0; i < 5; i++) {
            int rand= aleatorio.nextInt(baraja.size());
            mano.add(baraja.get(rand));                     //Llenamos nuestra mano con cinco Objetos Carta aleatorios de nuestra baraja
            baraja.remove(rand);                            //Luego, quitamos esa misma carta de baraja, para evitar repeticiones de carta en nuestra mano
        }
        List<Carta> m= Arrays.asList(mano.toArray(new Carta[mano.size()]));
        Collections.sort(m);
        mano= new ArrayList<>(Arrays.asList(m.toArray(new Carta[mano.size()])));
        return mano;
    }
   
    /**
     *
     * @param baraja
     * @param mano
     * @return
     */
    public static ArrayList<Carta> actualizaBaraja(ArrayList<Carta> baraja, ArrayList<Carta> mano){
       for (int i = 0; i < 5; i++) {
           baraja.remove(mano.get(i));
       }
       return baraja;
   }
}
