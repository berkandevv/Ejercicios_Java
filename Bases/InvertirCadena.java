/**
 * Implementa un método llamado invertirCadena que recibe por parámetro una
 * cadena de texto y devuelve la cadena invertida. Por ejemplo, si se recibe la
 * palabra "Hola", el método debe retornar "aloh".
 */

public class InvertirCadena {

    public static String invertirCadena(String palabra) {

        String invertido = "";

        // Recorremos la cadena de String al revés
        for (int i = palabra.length() - 1; i >= 0; i--) {
            invertido += palabra.charAt(i);
        }
        return invertido;
    }

    public static void main(String[] args) {

        String palabra = "hola";
        String invertido = invertirCadena(palabra); // Debería devolver "aloh"
        System.out.println(invertido);
    }
}
