/**
 * Este programa busca un valor en un array ordenado de enteros y devuelve 
 * su índice. 
 * 
 * Si el valor no se encuentra, devuelve el índice en el que el 
 * valor podría ser insertado.
 */

public class BusquedaBinaria {

    // Método de búsqueda binaria
    public static int busquedaBinaria(int[] array, int objetivo) {

        int inicio = 0;
        int fin = array.length - 1;

        while (inicio <= fin) {

            int mid = (inicio + fin) / 2;
            int puntoMedio = array[mid];

            if (puntoMedio == objetivo) {
                return mid;
            }

            else if (puntoMedio > objetivo) {
                fin = mid - 1;

            } else {
                inicio = mid + 1;
            }
        }

        return inicio; // Devuelve el posible índice, si no se encuentra
    }

    public static void main(String[] args) {

        // Ejemplo de prueba
        int[] miArray = { 1, 4, 5, 6, 8 };
        int resultado = busquedaBinaria(miArray, 6); // Guardamos el resultado en una variable
        System.out.println(resultado); // Debería devolver 3
    }
}
