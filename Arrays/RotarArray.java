import java.util.Arrays;

/**
 * Este programa rota los elementos de un array, moviendo el último elemento al principio
 * y desplazando el resto de los elementos una posición a la derecha.
 */

public class RotarArray {

    public static int[] rotarArray(int[] array) {

        int[] arrayRotado = new int[array.length];
        arrayRotado[0] = array[array.length - 1];

        for (int i = 1; i < array.length; i++) {

            arrayRotado[i] = array[i - 1];
        }

        return arrayRotado;
    }

    public static void main(String[] args) {
        int[] miArray = { 1, 3, 6, 9, 12 };
        int[] resultado = rotarArray(miArray);
        System.out.println(Arrays.toString(resultado));
    }
}
