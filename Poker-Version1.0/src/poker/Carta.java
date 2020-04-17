package poker;

/**
 *
 * @author Danil
 */
public class Carta {
    
    private String palo,figura;
   
    /**
     *
     * @param palo
     * @param figura
     */
    public Carta(String palo, String figura) {          //La clase carta consta de un constructor que une palo y figura en un Objeto de tipo Carta
        this.palo = palo;
        this.figura = figura;
    }

    /**
     *
     * @return
     */
    public String getPalo() {
        return palo;
    }

    /**
     *
     * @return
     */
    public String getFigura(){
        return figura;
    }
   
    @Override
    public String toString() {
        return figura + " de " + palo;
    }
    
}
