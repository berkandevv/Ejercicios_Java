import java.util.Arrays;

/**
 * Este programa invierte el orden de los elementos de un array de enteros.
 */

public class InvertirArray {

    public static int[] invertirArray(int[] array) {

        int[] arrayInvertido = new int[array.length];

        for (int i = 0; i < array.length; i++) {

            arrayInvertido[i] = array[array.length - i - 1];
        }

        return arrayInvertido;
    }

    public static void main(String[] args) {

        int[] miArray = { 1, 2, 3, 4, 5 };
        int[] arrayInvertido = invertirArray(miArray);
        System.out.println(Arrays.toString(arrayInvertido));
    }
}
