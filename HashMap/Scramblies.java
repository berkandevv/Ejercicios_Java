import java.util.HashMap;

/**
 * Programa que verifica si una porción de los caracteres de un string (str1) 
 * puede ser reorganizada para formar otro string (str2). El método determina 
 * si, mediante la reorganización de los caracteres en str1, es posible obtener str2.
 */

public class Scramblies {

    public static boolean scramble(String str1, String str2) {

        // Si la longitud de str1 es menor que la longitud de str2, no es posible
        if (str1.length() < str2.length()) {
            return false;
        }

        // Creamos HashMap para contar las ocurrencias de caracteres en str1 y str2
        HashMap<Character, Integer> diccionarioStr1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> diccionarioStr2 = new HashMap<Character, Integer>();

        // Contamos las veces que aparece una letra en Str1
        for (int i = 0; i < str1.length(); i++) {
            char caracter = str1.charAt(i);

            // Miramos dentro del primer HashMap
            Integer contador1 = diccionarioStr1.get(caracter);

            // Contamos las occurencias en el primer String (str1)
            if (contador1 == null) {
                // Si el carácter no existe en el mapa, lo agregamos con valor 1
                diccionarioStr1.put(caracter, 1);
            } else {
                // Si el carácter ya existe, incrementamos su contador
                diccionarioStr1.put(caracter, contador1 + 1);
            }
        }

        // Contamos las veces que aparece una letra en Str2
        for (int i = 0; i < str2.length(); i++) {
            char caracter = str2.charAt(i);

            // Miramos dentro del primer HashMap
            Integer contador2 = diccionarioStr2.get(caracter);

            // Contamos las occurencias en el segundo String (str2)
            if (contador2 == null) {
                // Si el carácter no existe en el mapa, lo agregamos con valor 1
                diccionarioStr2.put(caracter, 1);
            } else {
                // Si el carácter ya existe, incrementamos su contador
                diccionarioStr2.put(caracter, contador2 + 1);
            }
        }

        // Verificamos que str1 tiene suficientes caracteres para cubrir str2
        for (char caracter : diccionarioStr2.keySet()) {
            // Si en str1 no existe el carácter o no tiene suficientes ocurrencias
            if (!diccionarioStr1.containsKey(caracter)
                    || diccionarioStr1.get(caracter) < diccionarioStr2.get(caracter)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        boolean resultado1 = scramble("rkqodlw", "world");
        boolean resultado2 = scramble("cedewaraaossoqqyt", "codewars");
        boolean resultado3 = scramble("katas", "steak");

        System.out.println(resultado1); // True
        System.out.println(resultado2); // True
        System.out.println(resultado3); // False
    }
}
