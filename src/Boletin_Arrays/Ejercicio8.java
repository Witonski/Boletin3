package Boletin_Arrays;

import utils.MiEntradaSalida;
import java.util.Arrays;

public class Ejercicio8 {

    public static void main(String[] args) {

        int[] array = new int[5];


        for (int i = 0; i < array.length; i++) {
            // Genera un número aleatorio entre [0, 9]
            int numRandom = (int) (Math.random() * 10);
            array[i] = numRandom;
        }

        System.out.println("El array generado es: " + Arrays.toString(array));


        int numeroBuscado = MiEntradaSalida.leerEntero("¿Qué número quieres buscar en el array?");


        int posicion = devuelvePosicion(array, numeroBuscado);


        if (posicion != -1) {
            System.out.println("El valor " + numeroBuscado + " se encontró en la posición (índice): " + posicion);
        } else {
            System.out.println("El valor " + numeroBuscado + " NO se encuentra en el array. Código: -1");
        }
    }


    private static int devuelvePosicion(int[] array, int numeroBuscado) {

        // Bucle for tradicional porque necesitamos el índice (i)
        for (int i = 0; i < array.length; i++) {

            if (array[i] == numeroBuscado) {

                return i;
            }
        }


        return -1;
    }
}