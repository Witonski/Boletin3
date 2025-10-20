import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio6Segundo {

    // Constantes para definir el array
    final static int TAMANO_ARRAY = 15;
    final static int MAX_VALOR_ALEATORIO = 100; // Los números estarán entre 0 y 100

    // --------------------------------------------------------------------------
    // A. Método de generación de array (Similar a Ejercicio5)
    // --------------------------------------------------------------------------

    /**
     * Genera un array de enteros del tamaño especificado, llenándolo con
     * números aleatorios en el rango [0, MAX_VALOR_ALEATORIO].
     * @param tamano La cantidad de posiciones que tendrá el array.
     * @return El array de enteros generado.
     */
    public static int[] generaArrayAleatorio(int tamano) {
        int[] array = new int[tamano];

        for (int i = 0; i < tamano; i++) {
            // Rango: [0, 100]. El 'true' indica que 100 es inclusivo.
            array[i] = MiEntradaSalida.generaAleatorioEntre(0, MAX_VALOR_ALEATORIO, true);
        }
        return array;
    }

    // --------------------------------------------------------------------------
    // B. Método de comprobación de valor (Solución al ejercicio)
    // --------------------------------------------------------------------------


    public static boolean contieneValor(int[] array, int valorBuscado) {
        // Recorre el array con un bucle for-each
        for (int elemento : array) {
            if (elemento == valorBuscado) {
                return true; // Éxito: encontrado, terminamos la búsqueda inmediatamente
            }
        }
        return false; // Fracaso: el bucle terminó y el valor no fue encontrado
    }

    // --------------------------------------------------------------------------
    // C. Método main para la ejecución y la interfaz de usuario
    // --------------------------------------------------------------------------

    public static void main(String[] args) {

        // 1. Generar el array aleatorio
        int[] miArray = generaArrayAleatorio(TAMANO_ARRAY);

        // 2. Mostrar información al usuario
        System.out.println("Se ha generado un array aleatorio de " + TAMANO_ARRAY + " elementos.");
        System.out.println("Los números generados están en el rango [0, " + MAX_VALOR_ALEATORIO + "].");
        System.out.println("Contenido del Array: " + Arrays.toString(miArray));
        System.out.println("-------------------------------------------------------");

        // 3. Pedir el elemento a buscar
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el número que deseas buscar en el array: ");
        int elementoBuscado = scanner.nextInt();

        // 4. Llamar al método de búsqueda
        boolean encontrado = contieneValor(miArray, elementoBuscado);

        // 5. Mostrar el resultado final
        System.out.println("\n--- Resultado de la Búsqueda ---");
        if (encontrado) {
            System.out.println(" ¡ÉXITO! El número " + elementoBuscado + " SÍ está presente en el array.");
        } else {
            System.out.println(" FALLO. El número " + elementoBuscado + " NO se encuentra en el array.");
        }

        scanner.close();
    }
}