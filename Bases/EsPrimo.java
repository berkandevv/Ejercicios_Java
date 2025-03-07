import java.util.Scanner;

/**
 * Programa que verifica si un número es primo o no.
 * Un número primo es un número mayor que 1 que solo tiene dos divisores: 1 y él mismo.
 * 
 * El programa solicita un número al usuario, verifica si es primo y luego muestra
 * el resultado en la consola.
 */

public class EsPrimo {

    public static boolean numeroPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int contador = 2; contador < numero; contador++) {
            if (numero % contador == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        boolean resultado;
        int numero;

        Scanner teclado = new Scanner(System.in);

        // Pedimos el número por teclado al usuario
        System.out.print("Introduce un número: ");
        numero = teclado.nextInt();

        // Llamamos al método y guardamos el resulado en una variable
        resultado = numeroPrimo(numero);

        // Mostramos por pantalla el resultado al usuario
        System.out.println(resultado);

        teclado.close();
    }
}
