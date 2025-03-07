import java.util.Scanner;

public class LongitudEntero {

    static int contarLongitudEntero(int numeros) {

        int numero_cifras = 0;

        // Recorremos la longitud del entero.
        while (numeros != 0) {
            numeros = numeros / 10;
            numero_cifras++;
        }
        return numero_cifras;
    }

    public static void main(String[] args) {

        // Declaramos el número que nos dará el usuario
        int numero;

        // Creamos el objeto "teclado" para poder pedir los datos al usuario
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el número: ");
        numero = teclado.nextInt();

        // LLamamos el método para contar la longitud del entero
        System.out.println(contarLongitudEntero(numero));

        teclado.close();
    }
}