import java.util.Scanner;

/**
 * Programa que simula el juego de Piedra, Papel o Tijeras entre dos jugadores.
 * 
 * El programa permite que dos jugadores ingresen su elección (Piedra, Papel o Tijera)
 * y luego compara ambas elecciones para determinar el ganador o si hay un empate.
 */

public class PiedraPapelTijeras {

    static String piedraPapelTijeras(String jugador1, String jugador2) {

        // Creamos las condiciones y devolvemos el resultado
        if (jugador1.equals(jugador2))
            return ("Empate!");

        else if (jugador1.equals("Piedra") && jugador2.equals("Tijera"))
            return ("Jugador 1 gana");

        else if (jugador1.equals("Papel") && jugador2.equals("Piedra"))
            return ("Jugador 1 gana!");

        else
            return ("Jugador 2 gana!");
    }

    public static void main(String[] args) {

        // Declaración de variables
        String jugador1, jugador2;

        // Creamos el objeto "recopilador" y pedimos datos por teclado
        Scanner recopilador = new Scanner(System.in);

        System.out.println("Jugador 1 introduce => Piedra, Papel o Tijera: ");
        jugador1 = recopilador.nextLine();

        System.out.println("Jugador 2 introduce => Piedra, Papel o Tijera: ");
        jugador2 = recopilador.nextLine();

        // Llamamos el método que nos compara la desición de cada jugador y nos muestra
        // el ganador
        System.out.println(piedraPapelTijeras(jugador1, jugador2));

        recopilador.close();
    }
}
