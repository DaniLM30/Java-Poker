/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesNormales;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Danil
 */
public class CasaApuestas {
    
    /**
     *
     */
    public static HashMap<String,JugadorRegistrado> jugadores = new HashMap<>();

    /**
     *
     */
    public static ArrayList<Premio> premiosGeneral= new ArrayList<>();
    
    /**
     *
     * @param premio
     */
    public static void nuevoPremio(Premio premio){
        premiosGeneral.add(premio);
    }
    
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

    /**
     *
     * @param jugadoresMesa
     * @param manos
     * @param ganador
     * @param apuesta
     */
    public static void actualizarSaldos(ArrayList<JugadorRegistrado> jugadoresMesa ,ArrayList<ArrayList<Carta>> manos, int ganador, int apuesta){
        jugadoresMesa.get(ganador).actualizaSaldo(manos.get(ganador), apuesta);
        for (int i = 0; i < jugadoresMesa.size(); i++) {
            if (!jugadoresMesa.get(i).equals(jugadoresMesa.get(ganador))) {
                jugadoresMesa.get(i).setSaldoAcumulado(jugadoresMesa.get(i).getSaldoAcumulado()-apuesta);
            }            
        }
    }
    
    /**
     *
     */
    public static void cargarDatos(){
        try{
            FileInputStream istream= new FileInputStream("copiasegJug.dat");
            ObjectInputStream ois= new ObjectInputStream(istream);
            jugadores= (HashMap) ois.readObject();
            istream.close();
        } catch(IOException ioe){
            System.out.println("Error de IO:" + ioe.getMessage());
        } catch(ClassNotFoundException cnfe){
            System.out.println("Error de clase no encontrada:" + cnfe.getMessage());
        } catch(Exception e){
            System.out.println("Error:" + e.getMessage());
        }
    }
    
    /**
     *
     */
    public static void guardarDatos(){
        try{
            FileOutputStream ostreamPer= new FileOutputStream("copiasegJug.dat");
            ObjectOutputStream oosPer= new ObjectOutputStream(ostreamPer);
            oosPer.writeObject(jugadores);
            ostreamPer.close();
        } catch(IOException ioe){
            System.out.println("Error de IO:" + ioe.getMessage());
        } catch(Exception e){
            System.out.println("Error:" + e.getMessage());
        }
    }
}
