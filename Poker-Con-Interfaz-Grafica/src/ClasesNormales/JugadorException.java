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
public class JugadorException extends Exception {
    
    /**
     *
     */
    public static final String SALDO_INSUFICIENTE="No se dispone de saldo para realizar la apuesta.";
    
    /**
     *
     */
    public static final String SALDO_INSUFICIENTE_MESA="Uno de los jugadores no dispone de suficiente saldo para apostar";
    
    /**
     *
     */
    public static final String NIF_INCORRECTO="El NIF proporcionado no corresponde a ningun jugador registrado";
    
    /**
     *
     */
    public static final String CONTRASENIA_INCORRECTA="La contraseña no es correcta";
    
    /**
     *
     */
    public static final String EDAD_INCORRECTA="El jugador debe ser mayor de edad para poder jugar";
    
    /**
     *
     */
    public static final String NO_PREMIO="No se ha introducido ningun premio";
    
    /**
     *
     */
    public static final String NO_JUGADOR="No se ha introducido ningun jugador o no existe";
    
    /**
     *
     */
    public JugadorException(){
        super("Se ha producido una excepcion en la aplicacion");
    }
    
    /**
     *
     * @param txt
     */
    public JugadorException(String txt){
        super(txt);
    }
}
