public class BinarySearchRecursive {

    public static int binarySearch(int[] array, int objetivo, int low, int high) {
    
        // Caso base: si el índice bajo excede el índice alto, el objetivo devuelve la posición posible
        if (low > high) {
            return low;
        }

        int mid = (low + high) / 2; // Calcular el índice medio
        int puntoMedio = array[mid];

        // Si el objetivo está en el medio
        if (puntoMedio == objetivo) {
            return mid;
        }
        // Si el objetivo es menor que el elemento medio, buscar en la mitad izquierda
        else if (puntoMedio > objetivo) {
            return binarySearch(array, objetivo, low, mid - 1);
        }
        // Si el objetivo es mayor que el elemento medio, buscar en la mitad derecha
        else {
            return binarySearch(array, objetivo, mid + 1, high);
        }
    }
    public static void main(String[] args) {

        // Ejemplo de prueba
        int[] miArray = { 1, 4, 5, 6, 8 };
        int resultado = binarySearch(miArray,6, 0, miArray.length - 1); // Guardamos el resultado en una variable
        System.out.println(resultado); // Debería devolver 3
    }
}
