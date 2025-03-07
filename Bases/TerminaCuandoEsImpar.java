import java.util.Scanner;

/**
 * Programa que valida si el número introducido por el usuario es par o impar.
 * El programa continuará pidiendo números hasta que el usuario ingrese un número impar.
 */

public class TerminaCuandoEsImpar {

    static String validadorEntero(int numero) {

        // Comprueba si el número es un entero
        if (numero % 2 == 0) {
            return ("Esto es un numero par " + numero);
        }

        else {
            return ("numero impar, adiós!");
        }
    }

    public static void main(String[] args) {

        // Variable de entrada
        int numero;

        // Objeto "teclado" para introducir el número
        Scanner teclado = new Scanner(System.in);

        // Creamos un bucle para validar datos de entrada
        do {

            System.out.println("Dame un numero: ");
            numero = teclado.nextInt();

            System.out.println(validadorEntero(numero));

        } while (numero % 2 == 0);

        teclado.close();
    }
}
