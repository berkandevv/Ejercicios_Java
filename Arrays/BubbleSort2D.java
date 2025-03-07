/**
 * Este programa ordena los elementos de una matriz 2D de enteros de forma
 * ascendente o descendente.
 */

public class BubbleSort2D {

    public static void bubbleSort2D(int[][] matriz, boolean ascendente) {
        if (matriz == null || matriz.length == 0 || matriz[0].length == 0) {
            return;
        }

        int filas = matriz.length;
        int columnas = matriz[0].length;
        int totalElementos = filas * columnas;

        for (int i = 0; i < totalElementos - 1; i++) {
            for (int j = 0; j < totalElementos - i - 1; j++) {
                int filaActual = j / columnas;
                int columnaActual = j % columnas;
                int filaSiguiente = (j + 1) / columnas;
                int columnaSiguiente = (j + 1) % columnas;

                if (ascendente) {
                    // Orden ascendente
                    if (matriz[filaActual][columnaActual] > matriz[filaSiguiente][columnaSiguiente]) {
                        // Swap elementos
                        int temp = matriz[filaActual][columnaActual];
                        matriz[filaActual][columnaActual] = matriz[filaSiguiente][columnaSiguiente];
                        matriz[filaSiguiente][columnaSiguiente] = temp;
                    }
                } else {
                    // Orden descendente
                    if (matriz[filaActual][columnaActual] < matriz[filaSiguiente][columnaSiguiente]) {
                        // Swap elementos
                        int temp = matriz[filaActual][columnaActual];
                        matriz[filaActual][columnaActual] = matriz[filaSiguiente][columnaSiguiente];
                        matriz[filaSiguiente][columnaSiguiente] = temp;
                    }
                }
            }
        }
    }

    public static void printmatriz(int[][] matriz) {
        for (int[] row : matriz) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matriz = {
                { 5, 3, 8 },
                { 1, 9, 4 },
                { 7, 2, 6 }
        };

        System.out.println("Matriz original:");
        printmatriz(matriz);

        // Ordenación ascendente
        bubbleSort2D(matriz, true);
        System.out.println("\nMatriz ordenada ascendente:");
        printmatriz(matriz);

        // Ordenación descendente
        bubbleSort2D(matriz, false);
        System.out.println("\nMatriz ordenada descendente:");
        printmatriz(matriz);
    }
}
