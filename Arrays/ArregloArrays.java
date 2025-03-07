/**
 * Este programa recibe un array de números enteros, calcula la media de los
 * números positivos, la media de los números negativos y la cantidad de ceros 
 * en el array.
 */

public class ArregloArrays {

    public static int[] procesarArray(int[] numeros) {

        int sumaTotalPositivos = 0;
        int sumaTotalNegativos = 0;
        int mediaPositivos = 0;
        int mediaNegativos = 0;
        int cantidadCeros = 0;
        int contadorPositivos = 0;
        int contadorNegativos = 0;

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] > 0) {
                sumaTotalPositivos += numeros[i];
                contadorPositivos++;

            } else if (numeros[i] < 0) {
                sumaTotalNegativos += numeros[i];
                contadorNegativos++;

            } else {
                cantidadCeros++;
            }
        }

        // Calculamos las medias de los positivos y negativos si hay
        if (contadorPositivos > 0) {
            mediaPositivos = sumaTotalPositivos / contadorPositivos;
        }

        if (contadorNegativos > 0) {
            mediaNegativos = sumaTotalNegativos / contadorNegativos;
        }

        // Devolvemos un array con los resultados: [mediaPositivos, mediaNegativos, cantidadCeros]
        return new int[] { mediaPositivos, mediaNegativos, cantidadCeros };
    }

    public static void main(String[] args) {

        // Array de ejemplo con valores positivos, negativos y ceros
        int[] numeros = { 12, -7, 0, 5, -3, 8, 0, -2, 0, 4 };
        int[] resultados = procesarArray(numeros);

        System.out.println("La media de los números positivos dentro del array es: " + resultados[0]);
        System.out.println("La media de los números negativos dentro del array es: " + resultados[1]);
        System.out.println("La cantidad de ceros que hay en el array es: " + resultados[2]);
    }
}
