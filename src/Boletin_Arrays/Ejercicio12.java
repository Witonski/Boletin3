package Boletin_Arrays;

import java.util.Arrays;

public class Ejercicio12 {

    public static void main(String[] args) {

        int[] array = {4, 8, 2, 3, 19, 11, 7, 1, 5};
        System.out.println("\n Array Original: " + Arrays.toString(array));


        System.out.println("\n Array ordenado: " + Arrays.toString(ordenaBurbuja(array)));
    }


    private static int[] ordenaBurbuja(int[] array) {
        int aux;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) { //si numero actual > numero siguiente
                    aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }
            }
        }

        return array;
    }

}
