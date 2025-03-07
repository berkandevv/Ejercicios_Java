import java.util.Scanner;

/**
 * Programa que recibe un nombre completo y lo convierte en una abreviatura
 * utilizando la primera letra de cada nombre seguido de un punto.
 * Ambos caracteres son convertidos a mayúsculas.
 */

public class AbreviarNombre {

    static String abreviarNombre(String nombre) {
        return (nombre.charAt(0) + "." + nombre.charAt(nombre.indexOf(" ") + 1)).toUpperCase();
    }

    public static void main(String[] args) {

        // La variable de entrada será un String
        String nombre;

        // Creamos el objeto "teclado" por donde se va a introducir el nombre
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un nombre: ");
        nombre = teclado.nextLine();

        // Llamamos el método
        System.out.println(abreviarNombre(nombre));

        teclado.close();
    }
}
