import java.util.HashMap;

/**
 * Programa que cuenta cuántas especies (considerando mayúsculas y minúsculas) 
 * están repetidas en un array de especies.
 * La comparación de las especies es insensible a mayúsculas y minúsculas, es
 * decir, "Rosa" y "rosa" se consideran iguales.
 */

public class CountingDuplicatesHashmap {

    public static int countRepeated(String[] especies) {
        // Crear un HashMap para rastrear si una especie es repetida o no
        HashMap<String, Integer> repetidos = new HashMap<>();

        // Recorrer cada especie en el array
        for (String especie : especies) {
            // Convertir la especie a minúsculas para tratar "ROSA" y "rosa" como iguales
            especie = especie.toLowerCase();

            Integer contador = repetidos.get(especie);

            // Verificar si la especie ya se encuentra en el HashMap
            if (contador == null) {
                // Si ya está, marcarla como repetida
                repetidos.put(especie, 1);
            } else {
                // Si no está, agregarla con valor false (no repetida)
                repetidos.put(especie, contador + 1);
            }
        }

        // Contar cuántas especies están repetidas (tienen valor true)
        int totalRepetidos = 0;
        for (int esRepetido : repetidos.values()) {
            if (esRepetido > 1) {
                totalRepetidos++;
            }
        }

        return totalRepetidos;
    }

    public static void main(String[] args) {
        String[] especies = { "Rosa", "Margarita", "Lirio", "rosa", "Tulipan", "margarita" };
        System.out.println("Total de especies repetidas: " + countRepeated(especies));
    }
}
