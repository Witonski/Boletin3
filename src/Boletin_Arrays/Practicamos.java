import java.util.ArrayList;
import java.util.List;

public class Practicamos {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 1, 3, 3, 5, 6, 2, 9, 5, 6};
        int[] array2 = {4, 2, 5, 9, 1, 4, 6, 2, 10, 4, 7};

        // Lista para almacenar los elementos comunes encontrados
        List<Integer> elementosComunes = new ArrayList<>();

        System.out.println("Elementos comunes:");

        // Bucle for para recorrer el primer array (array1)
        for (int i = 0; i < array1.length; i++) {
            int elementoAComparar = array1[i];

            // Verificamos si el elemento ya se ha agregado a la lista de comunes
            // Esto evita que se muestren duplicados en el resultado final
            if (!elementosComunes.contains(elementoAComparar)) {

                // Bucle for anidado para recorrer el segundo array (array2)
                for (int j = 0; j < array2.length; j++) {

                    // Condición para encontrar la coincidencia
                    if (elementoAComparar == array2[j]) {
                        // Si hay coincidencia, lo agregamos a la lista
                        elementosComunes.add(elementoAComparar);

                        // Imprimimos el elemento encontrado
                        System.out.print(elementoAComparar + " ");

                        // Usamos 'break' para salir del bucle interno tan pronto como
                        // se encuentre la primera coincidencia y evitar buscar más duplicados
                        // de este mismo número en array2
                        break;
                    }
                }
            }
        }

        // Los elementos comunes son: 1 2 5 6 9
        // El orden de aparición puede variar.
    }
}