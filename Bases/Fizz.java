/**
 * Programa que implementa el juego clásico de FizzBuzz.
 * 
 * El método `fizz` evalúa si un número es divisible por 3, 5 o ambos, y
 * devuelve un mensaje específico según las siguientes reglas:
 * 
 * - Si el número es divisible por 3 y 5, devuelve "fizz buzz".
 * - Si el número es divisible solo por 3, devuelve "fizz".
 * - Si el número es divisible solo por 5, devuelve "buzz".
 * - Si el número no es divisible ni por 3 ni por 5, devuelve el número como
 * cadena.
 *
 * El método `main` ejecuta pruebas con diferentes números y muestra los
 * resultados por consola.
 */

public class Fizz {

    public static String fizz(int numero) {

        String mensaje = "";

        if (numero % 3 == 0 && numero % 5 == 0) {
            mensaje = "fizz buzz";
        } else if ((numero % 3 == 0) && !(numero % 5 == 0)) {
            mensaje = "fizz";
        } else if (!(numero % 3 == 0) && (numero % 5 == 0)) {
            mensaje = "buzz";
        } else {
            return Integer.toString(numero);
        }

        return mensaje;
    }

    public static void main(String[] args) {

        int numero = 15; // Debería devolver "fizz buzz"
        int numero2 = 9; // Debería devolver "fizz"
        int numero3 = 10; // Debería devolver "buzz"
        int numero4 = 17; // Debería devolver "17"
        String resultado = fizz(numero);
        String resultado2 = fizz(numero2);
        String resultado3 = fizz(numero3);
        String resultado4 = fizz(numero4);
        System.out.println(resultado);
        System.out.println(resultado2);
        System.out.println(resultado3);
        System.out.println(resultado4);
    }
}
