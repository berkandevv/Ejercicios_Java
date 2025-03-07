package ArrayList;

import java.util.ArrayList;

/**
 * Este programa muestra cómo crear un ArrayList, agregar, modificar,
 * eliminar elementos y obtener el tamaño de un ArrayList de tipo String.
 */

public class EjemploArrayList {
    public static void main(String[] args) {
        // Crear un ArrayList de tipo String
        ArrayList<String> frutas = new ArrayList<>();

        // Agregar elementos al ArrayList
        frutas.add("Manzana");
        frutas.add("Plátano");
        frutas.add("Naranja");

        // Imprimir el ArrayList
        System.out.println("Frutas: " + frutas);

        // Acceder a un elemento específico
        System.out.println("La primera fruta es: " + frutas.get(0));

        // Modificar un elemento en una posición específica
        frutas.set(1, "Fresa");
        System.out.println("Frutas después de la modificación: " + frutas);

        // Eliminar un elemento
        frutas.remove("Naranja");
        System.out.println("Frutas después de eliminar una: " + frutas);

        // Obtener el tamaño del ArrayList
        System.out.println("Tamaño del ArrayList: " + frutas.size());
    }
}
