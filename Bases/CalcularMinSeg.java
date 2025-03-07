import java.util.Scanner;

/**
 * Programa que convierte una cantidad de segundos proporcionada por el usuario
 * en su equivalente en minutos y segundos, siguiendo el formato "X min y X seg".
 */

public class CalcularMinSeg {

    static String calcularMinSeg(int segundos) {
        return (segundos + " seg son: " + segundos / 60 + " min y " + segundos % 60 + " seg");
    }

    public static void main(String[] args) {

        // El input será los segundos que nos porporcione el usuario
        int segundos;

        // Creamos el objeto "teclado" para poder introducir datos
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce los segundos: ");
        segundos = teclado.nextInt();

        // Llamamos al método que nos hace el calculo para minutos y segundos
        System.out.println(calcularMinSeg(segundos));

        teclado.close();
    }
}
