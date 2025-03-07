/**
 * Este programa declara y maneja un array bidimensional de enteros,
 * con 3 filas y 2 columnas, y muestra sus elementos en la consola
 * con un retardo de un segundo entre cada número.
 */

public class ArrayBidimensional {
  public static void main(String[] args) {

    int[][] matriz = new int[3][2]; // array de 3 filas por 2 columnas

    matriz[0][0] = 20;
    matriz[0][1] = 12;
    matriz[1][0] = 67;
    matriz[1][1] = 33;
    matriz[2][0] = 5;
    matriz[2][1] = 7;

    int fila;
    int columna;

    for (fila = 0; fila < 3; fila++) {
      System.out.print("Fila: " + fila);

      for (columna = 0; columna < 2; columna++) {
        System.out.printf("%10d ", matriz[fila][columna]);
      }
      System.out.println();
    }
  }
}
