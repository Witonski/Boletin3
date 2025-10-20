package Boletin_Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class Ejercicio10 {

    public static void main(String[] args) {

        // Array inicial con elementos duplicados
        int[] arrayConDuplicados = {5, 1, 9, 5, 4, 1, 12, 9, 8, 4};

        System.out.println("Array Original: " + Arrays.toString(arrayConDuplicados));

        // Llamada al método para eliminar duplicados
        int[] arraySinDuplicados = eliminarDuplicados(arrayConDuplicados);

        System.out.println("Array Sin Duplicados: " + Arrays.toString(arraySinDuplicados));
    }


    private static int[] eliminarDuplicados(int[] array) {

        // 1. Crear un HashSet a partir del array.
        // Un HashSet solo almacena valores únicos, eliminando automáticamente los duplicados.
        // Primero convertimos el array primitivo (int[]) a un stream de Integer.
        HashSet<Integer> setUnico = new HashSet<>();
        for (int elemento : array) {
            setUnico.add(elemento);
        }

        // 2. Convertir el HashSet de nuevo a un array de int[].

        // Creamos un nuevo array primitivo del tamaño exacto del Set (solo elementos únicos).
        int[] nuevoArray = new int[setUnico.size()];
        int i = 0;

        // Recorremos el Set y copiamos los valores al nuevo array.
        for (int elemento : setUnico) {
            nuevoArray[i] = elemento;
            i++;
        }

        return nuevoArray;
    }
}