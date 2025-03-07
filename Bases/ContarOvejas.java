import java.util.Scanner;

/**
 * Programa que cuenta el número de ovejas y muestra por pantalla el conteo,
 * manejando los casos especiales cuando el número de ovejas es 0 o 1.
 */

public class ContarOvejas {

    static String contadorOvejas(int ovejas) {

        String cantidadOvejas = "";

        if (ovejas == 0) {
            cantidadOvejas = "";
        }

        else if (ovejas == 1) {
            cantidadOvejas = "1 oveja...";
        }

        else

            for (int i = 1; i <= ovejas; i++) {
                cantidadOvejas = cantidadOvejas + i + "ovejas...";
            }

        return cantidadOvejas;
    }

    public static void main(String[] args) {

        // La entrada será la cantidad de ovejas que queremos contar
        int numeros;

        // Creamos el objeto "teclado" para poder introducir datos por teclado
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el número de ovejas: ");
        numeros = teclado.nextInt();

        // Invocamos el método que nos cuenta por pantalla la cantidad de ovejas
        System.out.println(contadorOvejas(numeros));

        teclado.close();
    }
}
