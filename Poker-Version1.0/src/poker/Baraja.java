package poker;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Danil
 */
public class Baraja {
   private static ArrayList<Carta> baraja= new ArrayList<>();       //Tanto baraja como mano son ArrayList de tipo Carta
   private static ArrayList<Carta> mano= new ArrayList<>();
   private static String[] palos={"Oros","Copas","Espadas","Bastos"};   //palos y figuras son dos Arrays de String que contienen los palos y las figuras posibles
   private static String[] figuras={"As","Dos","Sota","Caballo","Rey"};
    
    /**
     *
     * @return
     */
    public static ArrayList<Carta> creaBaraja(){ 
        for (int palo=0; palo<4; palo++) {
            for (int fig = 0; fig < 5; fig++) {
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
        Random aleatorio = new Random();
        for (int i = 0; i < 5; i++) {
            int rand= aleatorio.nextInt(baraja.size());
            mano.add(baraja.get(rand));                     //Llenamos nuestra mano con cinco Objetos Carta aleatorios de nuestra baraja
            baraja.remove(rand);                            //Luego, quitamos esa misma carta de baraja, para evitar repeticiones de carta en nuestra mano
        }
        return mano;
    }
}