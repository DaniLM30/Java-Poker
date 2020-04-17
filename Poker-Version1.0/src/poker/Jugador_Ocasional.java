package poker;

/**
 *
 * @author Danil
 */
public class Jugador_Ocasional extends Jugador {        //Jugador_Ocasional hereda atributos de la clase Jugador, pero incluye además un número de tarjeta
    
    private String numeroTarjeta;

    /**
     *
     * @param numeroTarjeta
     * @param NIF
     * @param nombre
     * @param apellido1
     * @param apellido2
     * @param saldoAcumulado
     * @param apuesta
     */
    public Jugador_Ocasional(String numeroTarjeta, String NIF, String nombre, String apellido1, String apellido2, int saldoAcumulado,int apuesta) {
        super(NIF, nombre, apellido1, apellido2, saldoAcumulado,apuesta);
        this.numeroTarjeta = numeroTarjeta;
    }

    /**
     *
     * @return
     */
    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    /**
     *
     * @param numeroTarjeta
     */
    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }
    
    /**
     *
     * @param apuesta
     * @param premio
     */
    public void actualizaSaldo(int apuesta,int premio){             //El método actualizaSaldo recibe el multiplicador de premio y la apuesta y hace set del SaldoAcumulado con el nuevo saldo
        super.setSaldoAcumulado(super.getSaldoAcumulado()-apuesta+(apuesta*(premio/2)));    //En el caso de Jugador_Ocasional el multiplicador es la mitad 
    }
    
    @Override
    public String toString() {
        return super.toString() + ", numeroTarjeta= " + numeroTarjeta+ "}";
    }

}
