/**
 * Programa que calcula el Índice de Masa Corporal (IMC) y clasifica el estado
 * de peso de una persona según los valores del IMC.
 * El cálculo del IMC se realiza con la fórmula: bmi = peso / altura².
 */

public class CalcularIMC {

    static String imc(double peso, double altura) {

        double calculoIMC = peso / (altura * altura);

        if (calculoIMC <= 18.5) {
            return "Underweight";

        } else if (calculoIMC <= 25) {
            return "Normal";

        } else if (calculoIMC <= 30) {
            return "Overweight";

        } else
            return "Obese";
    }

    public static void main(String[] args) {

        System.out.println(imc(50, 1.8));
        System.out.println(imc(80, 1.8));
        System.out.println(imc(90, 1.8));
        System.out.println(imc(100, 1.8));
    }
}
