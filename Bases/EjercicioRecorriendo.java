import java.util.Scanner;

/**
 * Programa que invierte un número entero. La inversión se 
 * realiza convirtiendo el número a una cadena, recorriéndola al revés y luego 
 * transformando el resultado nuevamente en un número entero.
 */

public class EjercicioRecorriendo {

    public static int recorriendoEnteros(int numero) {

        // Pasamos el numero entero a String para mejor manejo
        String cadena = Integer.toString(numero);

        // Creamos la varibale donde vamos a guardar el número
        String resultado = "";

        // Recorremos la cadena al revés y añadimo cada caracter a la nueva variable
        for (int contador = cadena.length() - 1; contador >= 0; contador--) {
            resultado += cadena.charAt(contador);
        }

        // Devolvemos el resultado convirtiendo la cadena en entero
        return Integer.valueOf(resultado);
    }

    public static void main(String[] args) {

        int numero, resultado;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Dame un numero: ");
        numero = teclado.nextInt();

        resultado = recorriendoEnteros(numero);

        System.out.println(resultado);

        teclado.close();
    }
}
