import java.util.Arrays;

public class RecursiveBubbleSort {

    public static int[] bubbleSortRecursive(int[] array, int longitud) {

        // Caso base: si solo hay un elemento, ya está ordenado
        if (longitud == 1) {
            return array;
        }

        // Una pasada del ordenamiento de burbuja
        for (int i = 0; i < longitud - 1; i++) {

            if (array[i] > array[i + 1]) {

                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        }

        // Llamar recursivamente y devolver el array ordenado
        return bubbleSortRecursive(array, longitud - 1);
    }

    public static void main(String[] args) {

        int[] array = { 64, 34, 25, 12, 22, 11, 90 };

        // Llamar a la función y guardar el resultado
        int[] resultado = bubbleSortRecursive(array, array.length);

        // Imprimir el array ordenado
        System.out.println(Arrays.toString(resultado));
    }
}
