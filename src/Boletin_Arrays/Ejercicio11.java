package Boletin_Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ejercicio11 {

    /*
     * Crea un método que acepte 2 arrays, y devuelva un nuevo array con los elementos
     * que ambos arrays tienen en común (la intersección).
     */

    public static void main(String[] args) {

        int[] array1 = {1, 2, 1, 3, 3, 5, 6, 2, 9, 5, 6};
        int[] array2 = {4, 2, 5, 9, 1, 4, 6, 2, 10, 4, 7};

        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));

        int[] interseccion = arrayComun(array1, array2);
        System.out.println("\nElementos en común: " + Arrays.toString(interseccion));
    }


    private static int[] arrayComun(int[] array1, int[] array2) {

        // Usar un HashSet para almacenar los elementos ÚNICOS del array 1.
        // Esto elimina los duplicados de la primera lista.
        Set<Integer> set1 = new HashSet<>();
        for (int elemento : array1) {
            set1.add(elemento);
        }

        // Usar un segundo Set para almacenar la INTERSECCIÓN (los comunes).
        Set<Integer> setComun = new HashSet<>();

        // Recorrer el array 2 y comprobar si cada elemento está en el Set 1.
        for (int elemento : array2) {
            // Si el elemento del array 2 ya existe en set1, significa que es común.
            if (set1.contains(elemento)) {
                // Lo agregamos a setComun. HashSet asegura que el resultado final no tenga duplicados.
                setComun.add(elemento);
            }
        }

        // Convertir el Set de la Intersección a un array primitivo (int[]).
        int[] nuevoArray = new int[setComun.size()];
        int i = 0;

        for (int elemento : setComun) {
            nuevoArray[i] = elemento;
            i++;
        }

        return nuevoArray;
    }
}