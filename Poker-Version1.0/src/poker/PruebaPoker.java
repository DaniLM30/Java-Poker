package poker;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Danil
 */
public class PruebaPoker {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        
        Scanner entrada= new Scanner(System.in);
        System.out.println(Baraja.creaBaraja());        //Mostramos la baraja de 20 Cartas
        Jugador_Registrado j1= new Jugador_Registrado("123456789","03217279Q","Daniel","Lopez","Moreno",0,0);  //Instanciamos un Jugador j1
        System.out.println("¿Con cuanto dinero vas a empezar a jugar?");
        int inicial= entrada.nextInt();                                 //Preguntamos con cuanto dinero va a empezar el jugaodr
        j1.setSaldoAcumulado(inicial);
        System.out.println("¿Cuantas partidas vas a querer jugar?");
        int partidas= entrada.nextInt();                                //Pedimos el número de jugadas mediante teclado con Scanner
        System.out.println(j1);                         //Mostramos los datos del jugador
        ArrayList<Carta> mano1= new ArrayList<>();
        for (int i = 0; i < partidas; i++) {
            mano1.clear();                                  //Vaciamos la mano anterior del jugador
            System.out.println("¿Cuanto quieres apostar?");
            int cantidad= entrada.nextInt();                //Pedimos por teclado la cantidad de dinero a apostar
            if (cantidad>=5){
                mano1= Baraja.creaMano(Baraja.creaBaraja());    //Creamos la mano aleatoriamente con el método creaMano
                System.out.println("Tu mano: "+ mano1);         //Mostramos la mano
                j1.setApuesta(cantidad);
                j1.actualizaSaldo(j1.getApuesta(), Apuesta.verPremio(mano1));       //Actualizamos el saldo en funcion de la mano y la apuesta establecida
                System.out.println("Su saldo acumulado es de: ");
                System.out.println(j1.getSaldoAcumulado());                         //Mostramos el nuevo saldo del jugador
            }
            else{                               
                System.out.println("Apuesta insuficiente, debe ser mayor o igual a 5€");    //Si la cantidad apostada es menor de 5, la jugada no es válida
                partidas++;                                                                 //La ugada no contaría en tal caso
            }
        }
        if (j1.getSaldoAcumulado()<0) {
            System.out.println("Estas en deuda con la banca, debes: "+ (-1)*j1.getSaldoAcumulado()+"€"); //Si al finalizar, el saldo es negativo, el jugador estará en deuda con la banca
        }
    }   
}
