/**
 * Programa para contar la cantidad de números divisibles por
 * un entero 'k' dentro de un rango dado [x..y], incluyendo ambos extremos.
 */

public class CantidadDivisibles {

    public static long divisibleCount(long x, long y, long k) {

        if (k == 0) {
            return 0; // Caso indefinido, k >= 1
        }

        // Si x == 0, el primer número divisible es 0
        if (x == 0) {
            return (y / k) + 1;
        }

        // Fórmula general x > 0
        return (y / k) - ((x - 1) / k);
    }

    public static void main(String[] args) {

        // Casos de prueba
        System.out.println(divisibleCount(6, 11, 2)); // Salida: 3
        System.out.println(divisibleCount(11, 345, 17)); // Salida: 20
        System.out.println(divisibleCount(0, 1, 7)); // Salida: 1
        System.out.println(divisibleCount(20, 20, 2)); // Salida: 1
        System.out.println(divisibleCount(20, 20, 8)); // Salida: 0
        System.out.println(divisibleCount(19, 20, 2)); // Salida: 1
        System.out.println(divisibleCount(0, 10, 1)); // Salida: 11
        System.out.println(divisibleCount(11, 14, 2)); // Salida: 2
        System.out.println(divisibleCount(64, 73, 27)); // Salida: 0

    }
}
