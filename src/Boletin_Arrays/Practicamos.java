package Boletin_Arrays;

import java.util.Arrays;

public class Practicamos
{

    public static void main(String[] args) {

        int[] arrayDesordenado = {9, 1, 4, 12, 2, 8, 5, 6};

        System.out.println("Array Original: " + Arrays.toString(arrayDesordenado));

        // Llamada al método de ordenación de burbuja
        int[] arrayOrdenado = ordenarBurbuja(arrayDesordenado);

        System.out.println("Array Ordenado: " + Arrays.toString(arrayOrdenado));
    }

    /**
     * Ordena un array de enteros de menor a mayor utilizando el algoritmo de la burbuja (Bubble Sort).
     * El método modifica el array original.
     * @param array El array de enteros a ordenar.
     * @return El mismo array, ahora ordenado de forma ascendente.
     */
    private static int[] ordenarBurbuja(int[] array) {

        int n = array.length;

        // Bucle exterior: Controla cuántas pasadas completas se necesitan.
        // Se necesitan n-1 pasadas.
        for (int i = 0; i < n - 1; i++) {

            // Bucle interior: Compara elementos adyacentes e intercambia.
            // En cada pasada (i), el elemento más grande "burbujea" hasta el final.
            // Por eso, la condición es n - 1 - i (para ignorar los elementos ya ordenados al final).
            for (int j = 0; j < n - 1 - i; j++) {

                // Comparación: Si el elemento actual es MAYOR que el siguiente (orden incorrecto para ASCENDENTE)
                if (array[j] > array[j + 1]) {

                    // Intercambio (Swap): Se utiliza una variable temporal (temp) para intercambiar los valores.
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        // Se devuelve el array modificado.
        return array;
    }
}