/**
 * Programa que calcula el factorial de un número de manera recursiva.
 * El factorial de un número entero no negativo n se define como:
 * - Factorial(0) = 1
 * - Factorial(n) = n * Factorial(n-1) para n > 1
 */

public class Factorial {

    // Método recursivo para calcular el factorial
    public static int factorial(int n) {
        // Caso base: si n es 0 o 1, el factorial es 1
        if (n == 0 || n == 1) {
            return 1;
        }
        // Caso recursivo: n * factorial(n - 1)
        else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int numero = 5;
        int resultado = factorial(numero);
        System.out.println("Factorial de " + numero + " es: " + resultado);
    }
}
