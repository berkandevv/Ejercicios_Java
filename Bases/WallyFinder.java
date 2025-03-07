/**
 * Programa que busca la palabra "Wally" en una cadena de texto.
 * El método busca la primera ocurrencia de "Wally" y se asegura de que no esté
 * seguida de una letra.
 * Si "Wally" es encontrado, se retorna su índice en la cadena, y si no, se
 * devuelve -1.
 */

public class WallyFinder {

    public static int findWally(String str) {

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'W') { // Verificar si el carácter es 'W'
                // Asegurarse de que no se salga del límite y que la subcadena sea "Wally"
                if (i + 5 <= str.length() && str.substring(i, i + 5).equals("Wally")) {
                    // Verificar si la posición de la letra es 0 o la letra anterior es un espacio o
                    // si la letra anterior es un apóstrofe
                    if (i == 0 || str.charAt(i - 1) == ' ') {
                        // Verificar si la posición de la letra + 5 es igual a la longitud de la cadena
                        // o la letra siguiente es un espacio o un punto
                        if (i + 5 == str.length() || str.charAt(i + 5) == ' ' || str.charAt(i + 5) == '.'
                                || str.charAt(i + 5) == '\'') {
                            return i;
                        }
                    }
                }
            }
        }

        return -1; // Si no se encuentra "Wally" con las condiciones especificadas
    }

    public static void main(String[] args) {
        System.out.println(findWally("Wally")); // 0
        System.out.println(findWally("Where's Wally")); // 8
        System.out.println(findWally("Where's Waldo")); // -1
        System.out.println(findWally("DWally Wallyd .Wally")); // -1
        System.out.println(findWally("Hi Wally.")); // 3
        System.out.println(findWally("It's Wally's.")); // 5
        System.out.println(findWally("Wally Wally")); // 0
        System.out.println(findWally("'Wally Wally")); // 7
    }
}
