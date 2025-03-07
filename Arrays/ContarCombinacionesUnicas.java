/**
 * Este programa calcula el número total de combinaciones únicas que se pueden
 * formar a partir de los elementos en cada subarray de una matriz 2D, considerando
 * solo elementos únicos en cada subarray.
 */

public class ContarCombinacionesUnicas {

    public static int calcularCombinacionesUnicas(int[][] matriz) {

        int totalCombinaciones = 1;

        for (int i = 0; i < matriz.length; i++) {

            int[] subarray = matriz[i];
            int cantidadOpcionesUnicas = 0;

            for (int j = 0; j < subarray.length; j++) {

                boolean existe = false;

                // Verificar si el elemento ya apareció en las posiciones previas
                for (int k = 0; k < j; k++) {

                    if (subarray[j] == subarray[k]) {

                        existe = true;
                        break;
                    }
                }

                if (!existe) {
                    cantidadOpcionesUnicas++;
                }
            }
            totalCombinaciones *= cantidadOpcionesUnicas;
        }
        return totalCombinaciones;
    }

    public static void main(String[] args) {

        // Ejemplo de prueba
        int[][] miMatriz = { { 1, 2, 2 }, { 4, 4, 4 }, { 5, 6, 6 } };
        int resultado = calcularCombinacionesUnicas(miMatriz); // Guardamos el resultado en una variable
        System.out.println(resultado); // Debería devolver 4
    }
}
