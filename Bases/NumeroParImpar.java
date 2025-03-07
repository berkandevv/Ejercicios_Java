import java.util.Scanner;

/**
 * Programa que determina si un número es par o impar.
 * 
 * El programa pide al usuario ingresar un número y luego verifica si es par
 * o impar. Si el número es divisible por 2 o es cero, se considera par; de
 * lo contrario, es impar. El resultado se imprime por pantalla.
 */

public class NumeroParImpar {

    static boolean parImpar(double numero) {

        // Creamos la condición que se necesita para ver si un número es par o impar
        if (numero % 2 == 0 || numero == 0)
            return true;

        else
            return false;
    }

    public static void main(String[] args) {

        // Inicializamos la variable
        double numero;

        // Creamos el objeto "teclado" para introducir datos
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribe un número: ");
        numero = teclado.nextFloat();

        // Llamamos al método para ver si el número es par o impar
        System.out.println(parImpar(numero));

        teclado.close();
    }
}
