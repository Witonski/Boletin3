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

/*
public class SumarPosicionesPares {
    public static void main(String[] args) {

        // Array de ejemplo. Los índices pares (0, 2, 4...) contienen: 10, 8, 6
        int[] mi_array = {10, 2, 8, 4, 6, 12};

        // Variable para acumular la suma. Empieza en cero.
        int suma = 0;

        // Bucle For:
        // 1. Comienza en el índice 0.
        // 2. Condición de parada para no salir del array.
        // 3. Incremento de 2 en 2 (i += 2) para visitar solo las posiciones pares.
        for (int i = 0; i < mi_array.length; i += 2) {

            // Acumular el valor del elemento en la posición actual 'i'
            suma += mi_array[i];
            // Esto es lo mismo que: suma = suma + mi_array[i];
        }

        // Imprimir el resultado final (10 + 8 + 6 = 24)
        System.out.println("La suma de los elementos en posiciones pares es: " + suma);
    }
}
 */



