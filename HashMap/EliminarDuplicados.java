import java.util.Arrays;
import java.util.HashMap;

/**
 * Programa que elimina los duplicados de un array de enteros utilizando un HashMap. 
 * Los elementos únicos se extraen y devuelven en un nuevo array.
 */

public class EliminarDuplicados {

    public static int[] removeDuplicates(int[] array) {
        // Usar un HashMap para almacenar los elementos sin duplicados
        HashMap<Integer, Boolean> map = new HashMap<>();

        // Recorremos el array y agregamos los elementos al HashMap
        for (int i = 0; i < array.length; i++) {
            map.put(array[i], true); // Solo el valor se guarda, sin duplicados
        }

        // Crear un array con los elementos únicos
        int[] resultadoFinal = new int[map.size()];
        int index = 0;

        // Extraemos los valores del HashMap y los colocamos en el nuevo array
        for (Integer key : map.keySet()) {
            resultadoFinal[index++] = key;
        }

        return resultadoFinal;
    }

    public static void main(String[] args) {
        int[] resultado1 = { 1, 1, 2 };
        int[] resultado2 = { 1, 2, 1, 1, 3, 2 };

        System.out.println(Arrays.toString(removeDuplicates(resultado1))); // [1, 2]
        System.out.println(Arrays.toString(removeDuplicates(resultado2))); // [1, 2, 3]
    }
}
