/**
 * Implementa en Java el método char letraMayor(char t[]), que devuelva la letra
 * con mayor valor alfabético de un array de caracteres. El método debe ignorar
 * caracteres que no sean letras (tanto mayúsculas como minúsculas).
 * 
 * Para resolver este ejercicio, puedes hacer uso del método:
 * 
 * static boolean esLetra(char c) {
 * return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
 * }
 */

public class LetraMayor {

    static boolean esLetra(char c) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
    }

    public static char letraMayor(char[] letra) {

        char max = letra[0];

        for (int i = 1; i < letra.length; i++) {

            if (esLetra(letra[i])) {

                if (letra[i] < max) { // Las masyúculas son menores en la tabla ASCII
                    max = letra[i];
                }
            } else {
                return 'n';
            }
        }
        return max;
    }

    public static void main(String[] args) {

        char[] caracteresInvalidos = { 'A', '1', 'c' };
        char[] caracteresValidos = { 'A', 'c', 'c' };
        char resultadoInvalido = letraMayor(caracteresInvalidos); // Debería devolver 'n'
        char resultadoValido = letraMayor(caracteresValidos); // Debería devolver 'A'
        System.out.println(resultadoInvalido);
        System.out.println(resultadoValido);
    }
}
