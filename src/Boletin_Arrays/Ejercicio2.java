package Boletin_Arrays;
/*
2. Crea un programa que detecte cuántos números negativos hay en un array de enteros.
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        // Array de ejemplo para la prueba
        int[] miArray = {5, -10, 2, -3, 0, -8, 15, -1};

        // Variable para llevar la cuenta, inicializada en 0
        int contador = 0;

        // Recorrer el array de principio a fin
        for (int f = 0; f < miArray.length; f++) {
            // Condición: Si el elemento actual es menor que cero (negativo)
            if (miArray[f] < 0) {
                // Acción: Incrementar el contador en 1
                contador++;
            }
        }

        // Mostrar el resultado final
        System.out.println("El total de números negativos es: " + contador);
    }
}
/*
Aquí tienes el Ejercicio 2 resuelto con el ciclo while completo:

public class Ejercicio2_While {
    public static void main(String[] args) {
        int[] miArray = {5, -10, 2, -3, 0, -8, 15, -1};
        int contador = 0;

        // 1. Inicialización del índice (fuera del while)
        int f = 0;

        // 2. Condición de parada
        while (f < miArray.length) {

            // Lógica: Si el elemento actual es negativo, contar
            if (miArray[f] < 0) {
                contador++;
            }

            // 3. Actualización: ¡Necesaria para evitar el ciclo infinito!
            f++;
        }

        System.out.println("El total de números negativos es: " + contador); // Resultado: 4
    }
}
 */