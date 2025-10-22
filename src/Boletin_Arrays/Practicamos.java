package Boletin_Arrays;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Practicamos {

    /**
     * Crea un método que acepta 2 arrays y devuelve un nuevo array
     * con los elementos que ambos arrays tienen en común (intersección).
     */
    public static int[] encontrarInterseccion(int[] array1, int[] array2) {

        // 1. Crear el conjunto de referencia (a partir de array1)
        // Esto permite verificar la existencia de un elemento en O(1).
        Set<Integer> set1 = new HashSet<>();
        for (int num : array1) {
            set1.add(num);
        }

        // 2. Crear el conjunto para almacenar los resultados únicos.
        Set<Integer> intersectionSet = new HashSet<>();

        // 3. Recorrer el array2 y encontrar los comunes
        for (int num : array2) {
            // Si el elemento de array2 está en set1, es un elemento común.
            if (set1.contains(num)) {
                // Lo agregamos al conjunto de intersección.
                // HashSet ignora automáticamente los duplicados, ¡eficiencia!
                intersectionSet.add(num);
            }
        }

        // 4. Convertir el conjunto de resultados a un array de enteros (int[])

        // Creamos un array del tamaño exacto de los resultados
        int[] resultadoArray = new int[intersectionSet.size()];
        int indice = 0;

        // Recorremos el conjunto de resultados y llenamos el array
        for (int num : intersectionSet) {
            resultadoArray[indice++] = num;
        }

        return resultadoArray;
    }

    public static void main(String[] args) {
        int[] a1 = {1, 2, 1, 3, 3, 5, 6, 2, 9, 5, 6};
        int[] a2 = {4, 2, 5, 9, 1, 4, 6, 2, 10, 4, 7, 9};

        int[] comunes = encontrarInterseccion(a1, a2);

        // El resultado esperado es: 1, 2, 5, 6, 9 (el orden puede variar)
        System.out.println("Elementos comunes: " + Arrays.toString(comunes));
    }
}

