import java.util.Scanner;

/**
 * Programa que cuenta la cantidad de caracteres en una cadena de texto
 * proporcionada por el usuario, ignorando los espacios en blanco.
 */

public class ContadorCaracteres {

    // Eliminamos los espacios blancos y comprobamos la longitud del String
    static String contadorCaracteres(String texto) {
        return ("La cantidad de caracteres que tienes: " + texto.replace(" ", "").length());
    }

    public static void main(String[] args) {

        // Declaración de variable
        String texto;

        // Creamos el objeto "captador" para poder introducir texto por teclado
        Scanner captador = new Scanner(System.in);

        System.out.println("Hola soy tu contador de caracteres, introduce un texto: ");
        texto = captador.nextLine();

        // Llamamos el método para contar caracteres
        System.out.println(contadorCaracteres(texto));

        captador.close();
    }
}
