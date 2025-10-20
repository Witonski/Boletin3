package Boletin_Arrays;


import utils.MiEntradaSalida;

import java.util.Arrays;

public class Ejercicio7 {



    public static void main(String[] args) {

        // 1. Pedir el tamaño del array
        int tamanio = MiEntradaSalida.leerEnteroPositivo("Dime el tamaño del array");
        int[] array = new int[tamanio];

        // 2. Llenar el array con valores introducidos por el usuario
        for (int i = 0; i < array.length; i++) {
            int numero = MiEntradaSalida.leerEntero("Introduce el valor en la posicion " + (i + 1));
            array[i] = numero;
        }

        // 3. Mostrar el array generado (opcional, para verificación)
        System.out.println("\nArray introducido: " + Arrays.toString(array));

        // 4. Pedir el elemento a buscar
        int elementoABuscar = MiEntradaSalida.leerEntero("Que valor quieres saber si se encuentra dentro del array?");

        // 5. Llamar al método y mostrar el resultado
        boolean encontrado = contieneElemento(array, elementoABuscar);

        System.out.println("\n--- Resultado de la Búsqueda ---");
        if (encontrado) {
            System.out.println("El valor " + elementoABuscar + " SÍ se encuentra en el array.");
        } else {
            System.out.println("El valor " + elementoABuscar + " NO se encuentra en el array.");
        }
    }

    /**
     * Comprueba si un array de enteros contiene un elemento específico.
     * * @param array             el array donde se realizará la búsqueda.
     * @param elementoABuscar   el elemento que se desea encontrar.
     * @return true si el elemento buscado se encuentra en el array, false si no está.
     */
    private static boolean contieneElemento(int[] array, int elementoABuscar) {

        // Usamos un bucle for-each para una lectura más limpia y directa.
        for (int elemento : array) {

            if (elemento == elementoABuscar) {
                // Si encontramos el elemento, devolvemos TRUE y salimos del método inmediatamente.
                return true;
            }
        }

        // Si el bucle finaliza sin haber encontrado el elemento, devolvemos FALSE.
        return false;
    }
}