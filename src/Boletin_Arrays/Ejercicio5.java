package Boletin_Arrays;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio5 {
/*
La línea public static void generarYMostrarArray(int tamano) es la declaración completa del metodo (o función)
 que realiza una tarea específica en el código. La tarea principal de este metodo es triple:
 Generar: Crear un array de enteros del tamaño (tamano) especificado.
 Rellenar: Llenar cada posición de ese array con un número entero aleatorio entre 0 y 1000.
 Mostrar: Imprimir el contenido final del array en la consola.
 */

    public static void generarYMostrarArray(int tamano){

        if (tamano <= 0){
            System.out.println("Error: El parámetro tamano debe ser un entero positivo");
            return;
        }
        int [] arrayAleatorio = new int[tamano];

        //Se crea una instancia del objeto Random para generar los valores
        Random random = new Random();

        for (int i = 0; i < tamano; i ++){
            arrayAleatorio[i] = random.nextInt(1001);

        }
        System.out.println("Array generado con " + tamano + " posiciones:");
        System.out.println(Arrays.toString(arrayAleatorio));
    }

    public static void main(String[] args) {
        // Ejemplos de uso del método:
        System.out.println("--- Ejemplo 1: Tamaño 12 ---");
        generarYMostrarArray(12);

        System.out.println("\n--- Ejemplo 2: Tamaño 4 ---");
        generarYMostrarArray(4);
}
}