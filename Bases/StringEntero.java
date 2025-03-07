/**
 * Programa que convierte un string en un número entero.
 * 
 * Este programa recibe una cadena de texto que representa un número entero
 * y la convierte en su equivalente numérico utilizando la función
 * Integer.parseInt().
 * 
 * Los valores de entrada son siempre cadenas válidas que representan números
 * enteros, incluyendo números negativos.
 */

public class StringEntero {

    static int stringNumero(String texto) {
        return Integer.parseInt(texto);
    }

    public static void main(String[] args) {
        System.out.println(stringNumero("1234"));
        System.out.println(stringNumero("605"));
        System.out.println(stringNumero("1405"));
        System.out.println(stringNumero("-7"));
    }
}
