import java.util.Arrays;

/**
 * Este programa elimina un elemento de un array dado un índice
 * de eliminación y devuelve el nuevo array resultante.
 */

public class EliminarElementos {

    public static int[] eliminarElemento(int[] array, int index) {

        // Verificar que el índice está dentro del rango del array
        if (index < 0 || index >= array.length) {
            System.out.println("Índice fuera de rango.");
            return array; // Devuelve el array original si el índice es inválido
        }

        // Crear un nuevo array con un tamaño reducido (original - 1)
        int[] nuevoArray = new int[array.length - 1];

        // Copiar los elementos antes del índice de eliminación
        for (int i = 0; i < index; i++) {
            nuevoArray[i] = array[i];
        }

        // Copiar los elementos después del índice de eliminación
        for (int i = index + 1; i < array.length; i++) {
            nuevoArray[i - 1] = array[i]; // Desplazamos los elementos a la izquierda
        }

        return nuevoArray;
    }

    public static void main(String[] args) {

        int[] miArray = { 1, 3, 6, 9, 12 };
        int[] resultado = eliminarElemento(miArray, 2);
        System.out.println(Arrays.toString(resultado));
    }
}
