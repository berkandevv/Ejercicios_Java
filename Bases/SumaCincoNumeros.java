import java.util.Scanner;

/**
 * Programa que suma cinco números introducidos por el usuario.
 * 
 * Este programa permite al usuario ingresar cinco números de tipo flotante
 * (decimal), y luego calcula la suma de esos cinco números. El resultado 
 * se muestra por consola.
 */

public class SumaCincoNumeros {

  static String sumaCincoNumeros(float numero1, float numero2, float numero3, float numero4, float numero5) {

    // Sumamos los cinco números
    return ("El resultado es: " + (numero1 + numero2 + numero3 + numero4 + numero5));
  }

  public static void main(String[] args) {

    // Declaramos los cinco números de entrada
    float primer_numero, segundo_numero, tercer_numero, cuarto_numero, quinto_numero;

    // Creamos un objeto "numeros" con el constructor "Scanner"
    Scanner numeros = new Scanner(System.in);

    // Pedimos todos los números por terminal
    System.out.println("Escribe el primer número: ");
    primer_numero = numeros.nextFloat();

    System.out.println("Escribe el segundo número: ");
    segundo_numero = numeros.nextFloat();

    System.out.println("Escribe el tercer número: ");
    tercer_numero = numeros.nextFloat();

    System.out.println("Escribe el cuarto número: ");
    cuarto_numero = numeros.nextFloat();

    System.out.println("Escribe el quinto número: ");
    quinto_numero = numeros.nextFloat();

    // Llamamos el método para sumar los 5 números
    System.out.println(sumaCincoNumeros(primer_numero, segundo_numero, tercer_numero, cuarto_numero, quinto_numero));

    numeros.close();
  }
}
