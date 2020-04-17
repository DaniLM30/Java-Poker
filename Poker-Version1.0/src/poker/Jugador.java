package poker;

/**
 *
 * @author Danil
 */
public class Jugador {      //La clase Jugador es la clase padre de Jugador_Ocasional y Jugador_Registrado
    
    private String NIF;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private int saldoAcumulado;
    private int apuesta;

    /**
     *
     * @param NIF
     * @param nombre
     * @param apellido1
     * @param apellido2
     * @param saldoAcumulado
     * @param apuesta
     */
    public Jugador(String NIF, String nombre, String apellido1, String apellido2, int saldoAcumulado,int apuesta) {
        this.NIF = NIF;                                                                     
        this.nombre = nombre;
        this.apellido1 = apellido1;                                      //Incluye un constructor con todos los atributos de cada jugador
        this.apellido2 = apellido2;
        this.saldoAcumulado = saldoAcumulado;
        this.apuesta=apuesta;
    }
    
    /**
     *
     * @return
     */
    public int getApuesta(){                                //Posteriormente tenemos los métodos get y set de los atributos
        return apuesta;
    }
    
    /**
     *
     * @param apuesta
     */
    public void setApuesta(int apuesta){
        this.apuesta=apuesta;
    }

    /**
     *
     * @return
     */
    public int getSaldoAcumulado() {
        return saldoAcumulado;
    }

    /**
     *
     * @param saldoAcumulado
     */
    public void setSaldoAcumulado(int saldoAcumulado) {
        this.saldoAcumulado = saldoAcumulado;
    }

    /**
     *
     * @return
     */
    public String getApellido2() {
        return apellido2;
    }

    /**
     *
     * @param apellido2
     */
    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    /**
     *
     * @return
     */
    public String getApellido1() {
        return apellido1;
    }

    /**
     *
     * @param apellido1
     */
    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return
     */
    public String getNIF() {
        return NIF;
    }

    /**
     *
     * @param NIF
     */
    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    @Override
    public String toString() {
        return "Jugador{" + "NIF= " + NIF + ", nombre= " + nombre + ", apellido1= " + apellido1 + ", apellido2= " + apellido2 + ", saldoAcumulado= " + saldoAcumulado + ", apuesta= " + apuesta ;
    }
    

}
