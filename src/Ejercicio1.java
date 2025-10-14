/*
Crea un programa que sume todas las posiciones pares
de un array de enteros.
 */

public class Ejercicio1 {

    public static void main(String[] args) {
        int[] numeros = {7, 3, 56, 6, 7, 2, 4, 62};

        int sumarpares = 0;

        for (int i = 0; i < numeros.length; i += 2) {
            sumarpares += numeros[i];
        }

        System.out.println("La suma de posiciones pares es " + sumarpares);
    }
}