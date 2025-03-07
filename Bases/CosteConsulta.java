import java.util.Scanner;

/**
 * Programa que calcula el coste de una consulta médica según el número de
 * consultas realizadas. 
 * 
 * Si el número de consultas es 1 o 2, el coste es 200; 
 * entre 3 y 5, el coste es 150; y más de 5, el coste es 100.
 */

public class CosteConsulta {

    static int costeConsulta(int numeroConsulta) {

        // Declaramos los precios por cada consulta
        if (numeroConsulta >= 1 && numeroConsulta <= 2) {
            return 200;
        } else if (numeroConsulta > 2 && numeroConsulta <= 5) {
            return 150;
        }

        else if (numeroConsulta > 5) {
            return 100;
        }

        return 0;
    }

    public static void main(String[] args) {

        // Variable donde se va guardar el número de cita y el pago que se tiene que realizar
        int numeroCita, pagoFinal;

        Scanner teclado = new Scanner(System.in);

        // Pedimos la variable al usuario.
        System.out.print("Introduce el número de cita: ");
        numeroCita = teclado.nextInt();

        pagoFinal = costeConsulta(numeroCita);

        // Mostramos por pantalla al usuario.
        System.out.print(pagoFinal);

        teclado.close();
    }
}
