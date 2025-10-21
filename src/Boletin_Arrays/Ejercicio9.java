package Boletin_Arrays;

import utils.MiEntradaSalida;
import java.util.Arrays;

public class Ejercicio9 {

    public static void main(String[] args) {

        int[] array = {9, 1, 4, 2, 12, 6, 8};

        // El usuario elige 1 (Ascendente) o 2 (Descendente)
        int opcion = MiEntradaSalida.leerEnteroEnRango("Opcion 1: Orden ascendente. Opcion 2: Orden descendente.", 1, 2);

        System.out.println("Array Original: " + Arrays.toString(array));
        System.out.println("Array Ordenado: " + Arrays.toString(arrayOrdenado(array, opcion)));
    }


    private static int[] arrayOrdenado(int[] array, int opcion) {

        // Siempre ordenar de forma ascendente primero
        Arrays.sort(array);

        // Si la opción es 2 (Descendente), revertir el array ya ordenado.
        if (opcion == 2) {

            int n = array.length;

            // Revertir: Solo se necesita iterar hasta la mitad (n/2) para intercambiar pares.
            for (int i = 0; i < n / 2; i++) {

                // Intercambio (Swap) del elemento del inicio con su simétrico del final
                int temp = array[i];
                array[i] = array[n - 1 - i]; // El elemento final se mueve al principio
                array[n - 1 - i] = temp;     // El elemento del principio se mueve al final
            }
        }

        // Devuelve el array, que ahora está ordenado.
        return array;
    }
}