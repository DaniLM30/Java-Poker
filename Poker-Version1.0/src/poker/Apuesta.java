package poker;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Danil
 */
public class Apuesta {                      
    private final ArrayList<Carta> mano= Baraja.creaMano(Baraja.creaBaraja());  //Creamos nuestra mano a partir de la baraja
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
        ArrayList<String> palos= new ArrayList<>();         //palos y figuras son dos ArrayList que reciben los palos y las figuras de los Objetos Carta de nuestra mano
        ArrayList<String> figuras= new ArrayList<>();
        int contPalos=1,contFig=1,contFig2=1, premio;                  //Instanciamos dos contadores de palos y figuras, y el multiplicador de premio
        for (int i = 0; i < mano.size(); i++) {
            palos.add(mano.get(i).getPalo());               //Llenamos los dos ArrayList a partir de nuestra mano
            figuras.add(mano.get(i).getFigura());
        }
        Collections.sort(palos);                //Ordenamos alfabéticamente nuestros ArrayList de palos y figuras        
        Collections.sort(figuras);
        for (int i = 1; i < palos.size(); i++) {
            if (palos.get(0).equals(palos.get(i))) {        //Comprobamos si todos los palos del ArrayList palos son iguales y por lo tanto existiese Color
                contPalos++;
            } 
        }
        int a=0;
        for (int i = 1; i < figuras.size(); i++) {          //Comprobamos si las figuras del ArrayList figuras son iguales
            if (figuras.get(a).equals(figuras.get(i))) {
                contFig++;
            }
            else{
                a=1;
            }   
        }
        /*int b=0;
        for (int i = 0; i < figuras.size(); i++) {
            if (figuras.get(b).equals(figuras.get(i))) {
                contFig2++;
            }
            
        }*/
        
        if (contPalos==5) {                                 //COLOR
            System.out.println("¡COLOR, ENHORABUENA!");
            premio=10;
        }
        
        else if(contFig==4){                                //POKER, en el caso en el que o las 4 primeras o las 4 últimas figuras del ArrayList fuesen iguales
            System.out.println("!POKER, ENHORABUENA¡");
            premio=4;
        }
            
        else if (figuras.get(0).equals(figuras.get(1))&&figuras.get(0).equals(figuras.get(2))&&figuras.get(3).equals(figuras.get(4))||figuras.get(0).equals(figuras.get(1))&&
            figuras.get(2).equals(figuras.get(3))&&figuras.get(2).equals(figuras.get(4))){      
            System.out.println("¡FULL, ENHORABUENA!");                                      //FULL
            premio=8;   
        }
        
        /*else if(contFig2>=2 && contFig2<4){
            System.out.println("PAREJA");
            premio=2;
        }*/
        
        else{
            System.out.println("NO HAY PREMIO LO SENTIMOS, VUELVA A INTENTARLO");
            premio=0;
        }
        
        return premio;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
