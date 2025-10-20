package Boletin_Arrays;

import utils.MiEntradaSalida;

public class Ejercicio4 {

    // Constante para definir la cantidad de números a generar
    final static int CANTIDAD_NUMEROS = 6000;


    public static void main(String[] args) {

        // Array para almacenar los 6000 números aleatorios
        int[] generados = new int[CANTIDAD_NUMEROS];

        double media;
        double suma = 0;

        // Variable sin uso real en esta estructura, pero mantenida por la imagen
        int digito;

        // 1. Generación de 6000 números aleatorios (0 a 100, ambos incluidos)
        for (int i = 0; i < generados.length; i++) {
            // Se asume la existencia de la clase utils.MiEntradaSalida
            generados[i] = MiEntradaSalida.generaAleatorioEntre(0, 100, true);
        }

        // 2. Cálculo de la media y la suma (primer bucle for-each en la imagen)
        for (int n1 : generados) {
            suma += n1;
        }

        media = suma / CANTIDAD_NUMEROS;
        System.out.println("LA media es = " + media);
        System.out.println(); // Salto de línea

        // Array 'digitos' para contar las veces que un número termina en 0, 1, 2... 9.
        // El índice es el dígito final, el valor es el contador.
        int[] digitos = new int[10];

        // 3. Conteo de la terminación de dígitos (segundo bucle for-each en la imagen)
        for (int n2 : generados) {
            // El operador módulo (%) 10 obtiene el último dígito del número
            digitos[n2 % 10]++;
        }

        // 4. Determinar el dígito que más se repite (mayor y mayorIndice)
        int mayor = Integer.MIN_VALUE;
        int mayorIndice = 0;

        for (int i = 0; i < digitos.length; i++) {
            if (digitos[i] > mayor) {
                mayor = digitos[i];
                mayorIndice = i;
            }
        }

        // 5. Mostrar el dígito más repetido
        System.out.println("EL dígito que mas se repite es el " + mayorIndice);
        System.out.println(); // Salto de línea

        // Variables para cálculos finales de porcentajes y medias
        double sumaPorcentajes = 0.0;
        int contadoresConValores = 0; // Contar cuántos dígitos (0-9) tienen repeticiones > 0

        // 6. Mostrar el conteo, porcentaje y buscar dígitos no terminados
        for (int i = 0; i < digitos.length; i++) {

            // Cálculo del porcentaje
            double porcentaje = (double) digitos[i] / CANTIDAD_NUMEROS * 100;

            // Mostrar conteo y porcentaje (estructura de System.out.printf de la imagen)
            System.out.printf("EL nº %d Se ha repetido %d veces. Esto equivale a un %.2f%%%n",
                    i,
                    digitos[i],
                    porcentaje);

            // Acumular porcentaje y contar dígitos terminados para la media final
            if (digitos[i] > 0) {
                sumaPorcentajes += porcentaje;
                contadoresConValores++;
            }

            // Requisito: En qué dígitos no ha terminado ningún número.
            if (digitos[i] == 0) {
                System.out.printf("--- El dígito %d no ha terminado en NINGÚN número. ---%n", i);
            }
        }

        System.out.println(); // Salto de línea

        // 7. Cálculos y muestra de sumas de porcentajes y media de porcentajes
        double mediaPorcentajesContados = 0;
        if (contadoresConValores > 0) {
            mediaPorcentajesContados = sumaPorcentajes / contadoresConValores;
        }

        System.out.printf("La suma de todos los porcentajes es equivalente al %.2f%%. El %% medio para los %d valores contados es de %.2f%%.%n",
                sumaPorcentajes,
                contadoresConValores,
                mediaPorcentajesContados);
        System.out.println();
    }
}