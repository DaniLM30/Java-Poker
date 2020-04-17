/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker2;

import java.util.HashMap;

/**
 *
 * @author Danil
 */
public class CasaApuestas {
    static HashMap<String,JugadorRegistrado> jugadores = new HashMap<>();           //HashMap de Jugadores Registrados cuya clave sera el NIF
    
    /**
     *
     * @param jr
     */
    public static void altaJugador(JugadorRegistrado jr){       //Añadimos un jugador al HashMap
        jugadores.put(jr.getNIF(),jr);                   
    }                

    /**
     *
     * @param NIF
     */
    public static void bajaJugador(String NIF){             //Eliminamos un jugador del HashMap
        jugadores.remove(NIF);
    }       
}
