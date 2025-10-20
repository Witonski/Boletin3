package Boletin_Arrays;/*
Crea un programa que sume todas las posiciones pares
de un array de enteros.
 */

public class Ejercicio1 {
    public static void main(String[] args) {


      /* // RESULETO CON BUCLE FOR
      int [] enteros = {2, 7, 9, 4, 3, 6};
      int sumaPares = 0;

      for (int f = 0; f < enteros.length; f += 2){
          sumaPares += enteros[f];
      }
        System.out.println("La suma de las posiciones pares es = " + sumaPares);*/

        // RESUELTO CON BUCLE WHILE
        int[] enteros = {2, 7, 9, 4, 3, 6};
        int sumaPares = 0;
        int f = 0;


        while (f < enteros.length) {
            sumaPares += enteros[f];
            f += 2;
        }
        System.out.println("La suma de las posiciones pares es = " + sumaPares);
    }
}





