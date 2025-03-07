import java.util.Scanner;

/**
 * Programa que valida si el número introducido por el usuario es un número entero.
 * El programa seguirá pidiendo un número hasta que el usuario ingrese un número entero.
 */

public class ValidadorEntero {

    public static String esEntero(double numero) {

        if (numero % 1 == 0) {
            return "Es entero";

        } else
            return "Tiene que ser un número entero!";
    }

    public static void main(String[] args) {

        double numero;

        Scanner teclado = new Scanner(System.in);

        do {

            System.out.println("Dame un número entero: ");
            numero = teclado.nextDouble();

            System.out.println(esEntero(numero));

        } while (numero % 1 != 0);

        teclado.close();
    }
}
