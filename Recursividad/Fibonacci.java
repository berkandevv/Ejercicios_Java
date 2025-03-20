/**
 * Programa que implementa la secuencia de Fibonacci de manera recursiva.
 * La secuencia de Fibonacci está definida como:
 * - Fibonacci(0) = 0
 * - Fibonacci(1) = 1
 * - Fibonacci(n) = Fibonacci(n-1) + Fibonacci(n-2) para n > 1
 */

public class Fibonacci {

    public static int fibonacci(int n) {
        // Casos base: Fibonacci de 0 es 0, y Fibonacci de 1 es 1
        if (n == 0 || n == 1) {
            return n;

        } else {
            // Caso recursivo: fib(n) = fib(n-1) + fib(n-2)
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {

        int numero = 10;
        int resultado = fibonacci(numero);
        System.out.println("Fibonacci de " + numero + " es: " + resultado); // Salida esperada: 55
    }
}
