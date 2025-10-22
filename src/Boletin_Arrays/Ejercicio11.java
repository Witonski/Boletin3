package Boletin_Arrays;

import java.util.Arrays;

public class Ejercicio11 {

    /*
     * Crea un metodo que acepte 2 arrays, y devuelva un nuevo array con los elementos
     * que ambos arrays tienen en común (la intersección).
     */

    public static void main(String[] args) {

        int[] array1 = {1, 2, 1, 3, 3, 5, 6, 2, 9, 5, 6};
        int[] array2 = {4, 2, 5, 9, 1, 4, 6, 2, 10, 4, 7, 9};

        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));

        //Creamos un array temporal (array3) con el tamaño justo y necesario para guardar la intersección
        // de los dos arrays originales.
        // Math.min calcula la longitud del array más corto entre array1 y array2 y garantiza que haya espacio
        // suficiente para todos los elementos comunes.
        int[] array3 = new int[Math.min(array1.length, array2.length)];

        //Tiene doble función de contador de los elementos comunes y de indíce (posición) donde se insertará
        // el próximo resultado en array3.
        int elementosArrayFinal = 0;

        for (int j : array1) {
            if (contieneElemento(array2, j) && !contieneElemento(array3, j, elementosArrayFinal)) {
                array3[elementosArrayFinal] = j;
                elementosArrayFinal++;
            }
        }

        int[] arrayADevolver = new int[elementosArrayFinal];

        //Este bucle elimina los posibles ceros vacíos que pudieran haber quedado en array3.
        for (int i = 0; i < elementosArrayFinal; i++){
            arrayADevolver[i] = array3[i];
        }

        System.out.println(Arrays.toString(arrayADevolver));
    }

    public static boolean contieneElemento(int[] array, int elementoABuscar, int max){
        for (int i = 0; i < max; i++) {
            if (array[i] == elementoABuscar){
                return true;
            }
        }
        return false;
    }

    public static boolean contieneElemento(int[] array, int elementoABuscar){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elementoABuscar){
                return true;
            }
        }
        return false;
    }
}