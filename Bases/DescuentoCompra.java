import java.util.Scanner;

/**
 * Programa que calcula el total a pagar por una compra aplicando un descuento
 * en función del número de piezas compradas.
 * 
 * Si el número de piezas es menor o igual a 3, se aplica un descuento del 25%.
 * Si es mayor que 3, se aplica un descuento del 50%.
 */

public class DescuentoCompra {

    static String descuentoCompra(float precioPiezas, float numeroPiezas) {

        // Guardamos el descuento directamente en una variable
        float decuento1 = 25 / 100F;
        float descuento2 = 50 / 100F;

        // Creamos la condición necesaria para aplicar el descuento
        if (numeroPiezas <= 3) {
            return ("Se le aplica un 25% de descuento. Total a pagar: " + (precioPiezas - (precioPiezas * decuento1)));
        }

        else
            return ("Se le aplica un 50% de descuento. Total a pagar: " + (precioPiezas - (precioPiezas * descuento2)));
    }

    public static void main(String[] args) {

        // Inicializamos todas las variables
        float precio;
        float numPiezas;

        // Creamos el objeto "teclado" para obtener datos
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el precio total de los productos: ");
        precio = teclado.nextFloat();

        System.out.println("Introduce cuántas piezas has comprado: ");
        numPiezas = teclado.nextInt();

        // Llamamos el método para aplicar el descuento
        System.out.println(descuentoCompra(precio, numPiezas));

        teclado.close();
    }
}
