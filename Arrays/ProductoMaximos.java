/**
 * Este programa calcula el producto de los n elementos más grandes de un array
 * de enteros dados, donde n es el tamaño especificado.
 */

 public class ProductoMaximos {

    public static long maxProduct(int[] numeros, int sub_size) {

        for (int i = 0; i < numeros.length - 1; i++) {

            for (int j = i + 1; j < numeros.length; j++) {

                if (numeros[i] > numeros[j]) {

                    int temporal = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = temporal;
                }
            }
        }

        long producto = 1;

        for (int i = numeros.length - 1; i >= numeros.length - sub_size; i--) {
            producto *= numeros[i];
        }

        return producto;
    }

    public static void main(String[] args) {

        int[] miArray = { 4, 3, 5 };
        int sub_size = 2;

        long resultado = maxProduct(miArray, sub_size);
        System.out.println(resultado); // Se espera 20 => 4 * 5 = 20
    }
}
