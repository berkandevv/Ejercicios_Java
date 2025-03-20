/**
 * Programa que implementa la función de Ackermann de forma recursiva.
 * La función de Ackermann se define como:
 * - A(0, n) = n + 1
 * - A(m, 0) = A(m - 1, 1) para m > 0
 * - A(m, n) = A(m - 1, A(m, n - 1)) para m > 0 y n > 0
 */

public class Ackerman {

    public static int ackermann(int m, int n) {

        if (m == 0) {
            return n + 1;

        } else if (m > 0 && n == 0) {
            return ackermann(m - 1, 1);

        } else if (m > 0 && n > 0) {
            return ackermann(m - 1, ackermann(m, n - 1));

        } else {
            // Manejar entrada inválida (no debería ocurrir para m y n no negativos)
            return -1;
        }
    }

    public static void main(String[] args) {

        System.out.println("A(0, 0) = " + ackermann(0, 0)); // Salida esperada: 1
        System.out.println("A(1, 2) = " + ackermann(1, 2)); // Salida esperada: 4
        System.out.println("A(2, 1) = " + ackermann(2, 1)); // Salida esperada: 5
        System.out.println("A(3, 3) = " + ackermann(3, 3)); // Salida esperada: 61 (computacionalmente intensivo)
    }
}
