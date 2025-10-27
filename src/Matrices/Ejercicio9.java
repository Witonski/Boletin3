package Matrices;
/*
9. Crea un metodo que compruebe si una matriz pasada por parámetro es simétrica en
función del eje X. Es decir, la matriz
1 3 5 6
4 2 0 8
4 2 0 8
1 3 5 6
es simétrica en función de su eje X, porque si invirtiésemos el orden en el que leemos las
filas, la matriz se vería igual.
Pero la matriz
1 4 6
2 1 3
no es simétrica, pues no cumple dicha propiedad.
 */
public class Ejercicio9 {

    public static void main(String[] args) {

        int[][] matrizSimetrica = {
                {1, 3, 5, 6},
                {4, 2, 0, 8},
                {4, 2, 0, 8},
                {1, 3, 5, 6}
        };

        int[][] matrizNoSimetrica = {
                {1, 4, 6},
                {2, 1, 3}
        };

        int[][] matrizImpar = {
                {7, 8},
                {9, 0},
                {7, 8}
        };

        System.out.println("Matriz Simétrica es Simétrica Eje X: " + matricesSimetricas(matrizSimetrica));
        System.out.println("Matriz No Simétrica es Simétrica Eje X: " + matricesSimetricas(matrizNoSimetrica));
        System.out.println("Matriz Impar es Simétrica Eje X: " + matricesSimetricas(matrizImpar));
    }


    public static boolean matricesSimetricas(int[][] matriz) {

        int numFilas = matriz.length;
        if (numFilas <= 1) {
            return true;
        }

        for (int i = 0; i < numFilas / 2; i++) {
            // Calculamos el índice de la fila simétrica (j) en el extremo opuesto.
            int j = numFilas - 1 - i;

            // Obtenemos el número de columnas (asumiendo que las filas existen y no son nulas).
            // Se asume que la matriz es rectangular.
            int numColumnas = matriz[i].length;

            // En un caso robusto, también se debería comprobar si matriz[j] es null o tiene longitud diferente
            if (matriz[j] == null || matriz[j].length != numColumnas) {
                // Si la matriz no es consistente (no rectangular, o filas nulas), se considera no simétrica.
                return false;
            }

            // Recorremos los elementos de las filas i y j para compararlos.
            for (int k = 0; k < numColumnas; k++) {
                // Si el elemento en la fila i es diferente al elemento en la fila j
                // en la misma columna (k), la matriz NO es simétrica.
                if (matriz[i][k] != matriz[j][k]) {
                    return false;
                }
            }
        }

        // Si el bucle termina, significa que todas las parejas de filas simétricas son iguales.
        return true;
    }
}