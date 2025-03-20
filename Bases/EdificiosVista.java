public class EdificiosVista {

    public static int contarEdificiosConVista(int[] alturas) {

        // Variable para llevar cuenta de los edificios con vista
        int contador = 0;

        // Variable para llevar la altura del último edificio visto al sol
        int maxAlturaVisto = 0; // Asumimos que la altura mínima de un edificio es 1, por lo que 0 nunca será válido

        // Recorremos el array de derecha a izquierda
        for (int i = alturas.length - 1; i >= 0; i--) {

            if (alturas[i] > maxAlturaVisto) {
                // Si el edificio es más alto que el último visto, tiene vista al sol
                contador++;
                maxAlturaVisto = alturas[i]; // Actualizamos la altura del último edificio visto
            }
        }

        return contador; // Devolvemos el total de edificios con vista
    }

    public static void main(String[] args) {

        // Ejemplo de uso
        int[] edificios = { 3, 7, 8, 3, 6, 1 };
        int resultado = contarEdificiosConVista(edificios);
        System.out.println("Número de edificios con vista al sol poniente: " + resultado); // Salida esperada: 3
    }
}
