package Boletin_Arrays;

import utils.MiEntradaSalida;
import java.util.Arrays;

public class Ejercicio9 {

    public static void main(String[] args) {

        int[] array = {9, 1, 4, 2, 12, 6, 8};

        // El usuario decide si quiere orden inverso (reverse = true) o ascendente (reverse = false)
        // Usamos leerEnteroEnRango para obtener 1 (NO reverse) o 2 (SÍ reverse)
        int opcion = MiEntradaSalida.leerEnteroEnRango("Opcion 1: Orden ascendente. Opcion 2: Orden descendente.", 1, 2);

        // Convertimos la opción entera del usuario en el booleano 'reverse'
        // true si eligen 2 (descendente), false si eligen 1 (ascendente)
        boolean ordenInverso = (opcion == 2);

        System.out.println("Array original: " + Arrays.toString(array));
        System.out.println("Resultado: " + Arrays.toString(arrayOrdenado(array, ordenInverso)));
    }


    private static int[] arrayOrdenado(int[] array, boolean reverse) {

        // 1. ORDEN ASCENDENTE BASE
        // Utilizamos el método eficiente de Java para el orden ascendente (menor a mayor)
        Arrays.sort(array);

        // 2. ORDEN DESCENDENTE (SI 'reverse' es true)
        if (reverse) {

            // Si se pide orden inverso, revertimos el array ya ordenado.
            // Solo necesitamos recorrer la mitad del array, intercambiando pares.

            int n = array.length;

            for (int i = 0; i < n / 2; i++) {

                // Elemento que está al principio
                int elementoDelPrincipio = array[i];

                // Elemento que está al final, en la posición simétrica
                int elementoDelFinal = array[n - 1 - i];

                // Intercambio (Swap)
                int temp = elementoDelPrincipio;
                array[i] = elementoDelFinal;
                array[n - 1 - i] = temp;
            }
        }
        // Devuelve el array, ya sea en orden ascendente o descendente.
        return array;
    }
}