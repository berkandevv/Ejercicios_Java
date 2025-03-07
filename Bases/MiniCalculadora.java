import java.util.Scanner;

/**
 * Programa que implementa una mini calculadora que permite realizar operaciones
 * básicas (suma, resta, multiplicación y división) con dos números proporcionados
 * por el usuario. El resultado de la operación se muestra en pantalla.
 * 
 * El programa pide al usuario ingresar dos números y elegir una operación. Luego
 * se realiza la operación y se muestra el resultado.
 */

public class MiniCalculadora {

    static String calculadora(String operacion, float primerNumero, float segundoNumero) {

        /*
         * Comparamos las cuatro operaciones posibles con los teclado pasados por
         * teclado, añadimos una excepción si no coinciden.
         */

        switch (operacion) {

            case "SUMA":
                return ("El resultado de la suma es: " + (primerNumero + segundoNumero));
            case "RESTA":
                return ("El resultado de la resta es: " + (primerNumero - segundoNumero));
            case "MULTIPLICACIÓN":
                return ("El resultado de la multiplicación es: " + (primerNumero * segundoNumero));
            case "DIVISIÓN":
                return ("El resultado de la división es: " + (primerNumero / segundoNumero));
            default:
                return ("Operación incorrecta");
        }
    }

    public static void main(String[] args) {

        // Declaramos las variables de entrada
        String operacion;
        float primer_numero, segundo_numero;

        // Creamos el objeto "teclado" que nos va recoger los teclado
        Scanner teclado = new Scanner(System.in);

        // Pedimos los teclado de entrada por teclado al usuario
        System.out.println("Escribe el primer número: ");
        primer_numero = teclado.nextFloat();

        System.out.println("Escribe el segundo número: ");
        segundo_numero = teclado.nextFloat();

        System.out.println("Elige alguna de estas tres opreraciones: SUMA, RESTA, MULTIPLICACIÓN o DIVISIÓN: ");
        operacion = teclado.next();

        // Llamamos el método
        System.out.println(calculadora(operacion, primer_numero, segundo_numero));

        teclado.close();
    }
}
