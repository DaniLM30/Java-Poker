package poker;

/**
 *
 * @author Danil
 */
public class Jugador_Registrado extends Jugador {   //Jugador_Ocasional hereda atributos de la clase Jugador, pero incluye además un número de cuenta bancaria
    
    private String numeroCuenta;

    /**
     *
     * @param numeroCuenta
     * @param NIF
     * @param nombre
     * @param apellido1
     * @param apellido2
     * @param saldoAcumulado
     * @param apuesta
     */
    public Jugador_Registrado(String numeroCuenta, String NIF, String nombre, String apellido1, String apellido2, int saldoAcumulado,int apuesta) {
        super(NIF, nombre, apellido1, apellido2, saldoAcumulado,apuesta);
        this.numeroCuenta = numeroCuenta;
    }

    /**
     *
     * @return
     */
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    
    /**
     *
     * @param numeroCuenta
     */
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    
    /**
     *
     * @param apuesta
     * @param premio
     */
    public void actualizaSaldo(int apuesta,int premio){     //El método actualizaSaldo recibe el multiplicador de premio y la apuesta y hace set del SaldoAcumulado con el nuevo saldo
        super.setSaldoAcumulado(super.getSaldoAcumulado()-apuesta+(apuesta*premio));
    }
    @Override
    public String toString() {
        return super.toString() +  ", numeroCuenta= " + numeroCuenta+ "}";
    }
}
