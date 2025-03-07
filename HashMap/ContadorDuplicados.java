import java.util.HashMap;

/**
 * Programa que cuenta cuántos caracteres en un texto (letras y números)
 * aparecen más de una vez. El conteo es sensible a las mayúsculas y minúsculas, 
 * pero se normaliza para convertir todo a minúsculas antes de contar.
 */

public class ContadorDuplicados {

    public static int contarDuplicados(String texto) {

        // Convertir la cadena a minúsculas
        texto = texto.toLowerCase();

        // Usamos un HashMap para contar las ocurrencias de cada carácter
        HashMap<Character, Integer> mapaFrecuencias = new HashMap<Character, Integer>();

        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);

            // Verificamos si el carácter es una letra o un número
            if ((caracter >= 'a' && caracter <= 'z') || (caracter >= '0' && caracter <= '9')) {

                // Miramos dentro del HashMap
                Integer contador = mapaFrecuencias.get(caracter);

                // Si el carácter no existe en el mapa, lo agregamos con valor 1
                if (contador == null) {
                    mapaFrecuencias.put(caracter, 1);
                } else {
                    // Si el carácter ya existe, incrementamos su contador
                    mapaFrecuencias.put(caracter, contador + 1);
                }
            }
        }

        // Contar cuántos caracteres tienen más de una ocurrencia
        int cantidadDuplicados = 0;
        for (int frecuencia : mapaFrecuencias.values()) {

            // Si el contador es mayor a 1, es un duplicado
            if (frecuencia > 1) {
                cantidadDuplicados++;
            }
        }

        return cantidadDuplicados;
    }

    public static void main(String[] args) {

        System.out.println(contarDuplicados("abcde")); // 0
        System.out.println(contarDuplicados("aabbcde")); // 2
        System.out.println(contarDuplicados("aabBcde")); // 2
        System.out.println(contarDuplicados("indivisibility")); // 1
        System.out.println(contarDuplicados("Indivisibilities"));// 2
        System.out.println(contarDuplicados("aA11")); // 2
        System.out.println(contarDuplicados("ABBA")); // 2
    }
}
