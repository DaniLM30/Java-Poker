/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesNormales;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author Danil
 */
public class Apuesta {
    private final static String[] palos={"Oros","Copas","Espadas","Bastos"};   //palos y figuras son dos Arrays de String que contienen los palos y las figuras posibles
    private final static String[] figuras={"Dos","Tres","Cuatro","Cinco","Seis","Siete","Ocho","Nueve","Sota","Caballo","Rey","As"};

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
    
    /**
     *
     * @param multiplicador
     * @return
     */
    public static String  verPremioTexto(int multiplicador){
        String premioTexto="HOLA";
        switch(multiplicador){
            case 10:
              premioTexto="POKER";
              break;
            case 8:
              premioTexto="FULL";
              break;
            case 6:
                premioTexto="COLOR";
                break;
            case 4:
                premioTexto="TRIO";
                break;
            case 2:
                premioTexto="DOBLE PAREJA";
                break;
            case 1:
                premioTexto="PAREJA";
                break;
            case 0:
                premioTexto="NADA";
                break;
            default:
                break;
        }
        return premioTexto;
    }
    
    /**
     *
     * @param mano1
     * @param mano2
     * @param mano3
     * @param mano4
     * @return
     */
    public static int comparadorMesa(ArrayList<Carta> mano1, ArrayList<Carta> mano2, ArrayList<Carta> mano3, ArrayList<Carta> mano4){
        int ganador;      
        ArrayList<ArrayList<Carta>> manos= new ArrayList<>();
        ArrayList<ArrayList<Carta>> manosIguales= new ArrayList<>();
        ArrayList<Carta> cartasManosIguales= new ArrayList<>();
        ArrayList<Integer> valoresCartasManosIguales= new ArrayList<>();
        ArrayList<Integer> multiplicadores= new ArrayList<>();
        int maximo;
        int indexMaximo;
        manos.add(mano1);
        manos.add(mano2);
        manos.add(mano3);
        manos.add(mano4);
        multiplicadores.add(Apuesta.verPremio(mano1));
        multiplicadores.add(Apuesta.verPremio(mano2));
        multiplicadores.add(Apuesta.verPremio(mano3));
        multiplicadores.add(Apuesta.verPremio(mano4));
        maximo= Collections.max(multiplicadores);
        indexMaximo= multiplicadores.indexOf(maximo);
        ganador=indexMaximo+1;       

            for (int i = 0; i < multiplicadores.size(); i++) {
                if(multiplicadores.get(i).equals(multiplicadores.get(indexMaximo))){
                    if(!manosIguales.contains(manos.get(i))){
                        manosIguales.add(manos.get(i));
                    }
                    if(!manosIguales.contains(manos.get(indexMaximo))){
                        manosIguales.add(manos.get(indexMaximo));
                    }
                }              
            }
     
        if(!manosIguales.isEmpty()){
            for (int i = 0; i < manosIguales.size(); i++) {
                for (int j = 0; j < 5; j++) {
                    cartasManosIguales.add(manosIguales.get(i).get(j));                    
                }
            }
            for (int i = 0; i < cartasManosIguales.size(); i++) {
                valoresCartasManosIguales.add(Arrays.asList(figuras).indexOf(cartasManosIguales.get(i).getFigura()));   
            }
            for (int i = 0; i < manos.size(); i++) {
                if (manos.get(i).contains(cartasManosIguales.get(valoresCartasManosIguales.indexOf(Collections.max(valoresCartasManosIguales))))){
                    ganador=i+1;
                }               
            }            
        }

        return ganador;
    }
}
