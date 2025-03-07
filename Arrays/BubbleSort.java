import java.util.Arrays;

/**
 * Este programa ordena un array de enteros de menor a mayor usando el algoritmo
 * Bubble Sort.
 */

public class BubbleSort {

    public static int[] ordenarArray(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {

            for (int j = i + 1; j < array.length; j++) {

                if (array[i] > array[j]) {

                    int temporal = array[i];
                    array[i] = array[j];
                    array[j] = temporal;
                }
            }
        }

        return array;
    }

    public static void main(String[] args) {

        int[] miArray = { 3, 4, 0, 8, 1, 5 };
        System.out.println("Array sin ordenar=> " + Arrays.toString(miArray));
        int[] resultado = ordenarArray(miArray); // Guardamos el resultado en una variable
        System.out.println("Array ordenado => " + Arrays.toString(resultado));
    }
}
