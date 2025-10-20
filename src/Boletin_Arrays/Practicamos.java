package Boletin_Arrays;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class Practicamos {

    // Método para generar un array aleatorio (Basado en la fuente [1] y código previo)
    public static int[] generarArrayAleatorio(int tamano) {
        if (tamano <= 0) {
            return new int[0];
        }

        // Crear el contenedor (array)
        int[] arrayAleatorio = new int[tamano];

        // Herramienta de aleatoriedad
        Random random = new Random();

        // Llenar el array
        for (int i = 0; i < tamano; i++) {
            arrayAleatorio[i] = random.nextInt(1001);
        }
        return arrayAleatorio;
    }

    // Método CLAVE: Comprueba si el array contiene el valor buscado
    public static boolean contieneValor(int[] array, int valorBuscado) {


        for (int elemento : array) {

            // Si el elemento actual es igual al que estamos buscando...
            if (elemento == valorBuscado) {
                // ¡Lo encontramos! Devolvemos verdadero y salimos inmediatamente del método.
                return true;
            }
        }

        // Si el bucle terminó (recorrimos todo el array) y nunca encontramos el valor:
        return false;
    }

    public static void main(String[] args) {

        // Configuramos la herramienta para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // PASO 1: Generar el array
        int tamanoArray = 15;
        int[] miArray = generarArrayAleatorio(tamanoArray);

        System.out.println("El array aleatorio generado (tamaño " + tamanoArray + ") es:");
        System.out.println(Arrays.toString(miArray));

        // PASO 2: Pedir el valor a buscar
        System.out.print("\nIntroduce el número entero que deseas buscar (entre 0 y 1000): ");

        if (scanner.hasNextInt()) {
            int valorBuscado = scanner.nextInt();

            // PASO 3: Ejecutar la búsqueda
            boolean encontrado = contieneValor(miArray, valorBuscado);

            // PASO 4: Mostrar el resultado
            if (encontrado) {
                System.out.println("\n¡Éxito! El valor " + valorBuscado + " SÍ se encuentra en el array.");
            } else {
                System.out.println("\nResultado: El valor " + valorBuscado + " NO se encuentra en el array.");
            }
        } else {
            System.out.println("Error: Entrada inválida. Por favor, ingresa un número entero.");
        }

        scanner.close();
    }
}
