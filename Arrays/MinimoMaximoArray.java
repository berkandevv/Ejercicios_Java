/**
 * Este programa recorre un array de enteros para encontrar el 
 * valor mínimo y máximo, y luego los muestra en consola.
 */

public class MinimoMaximoArray {

    public static String encontrarMinMax(int[] array) {

        // Inicializar el valor mínimo y máximo con el primer elemento del array
        int min = array[0];
        int max = array[0];
        String valorMinimo = "";
        String valorMaximo = "";

        // Recorrer el array desde el segundo elemento
        for (int i = 1; i < array.length; i++) {

            if (array[i] < min) {
                min = array[i];
                valorMinimo = Integer.toString(min);
            }
            if (array[i] > max) {
                max = array[i];
                valorMaximo = Integer.toString(max);
            }
        }
        return "El valor mínimo es: " + valorMinimo + "\nEl valor máximo es: " + valorMaximo;
    }

    public static void main(String[] args) {

        int[] array = { 12, 5, 9, 23, 7, 18 };
        String resultado = encontrarMinMax(array);
        System.out.println(resultado);
    }
}
