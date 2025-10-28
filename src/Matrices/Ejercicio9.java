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

        System.out.println("\nMatriz Simétrica es Simétrica Eje X: " + matricesSimetricas(matrizSimetrica));
        System.out.println("\nMatriz No Simétrica es Simétrica Eje X: " + matricesSimetricas(matrizNoSimetrica));
    }

    public static boolean matricesSimetricas(int[][] matriz) {

        int numFilas = matriz.length;
        if (numFilas <= 1) {
            return true;
        }

        for (int i = 0; i < numFilas / 2; i++) {
            int j = numFilas - 1 - i;

            int numColumnas = matriz[i].length;

            if (matriz[j] == null || matriz[j].length != numColumnas) {
                return false;
            }

            for (int k = 0; k < numColumnas; k++) {
                if (matriz[i][k] != matriz[j][k]) {
                    return false;
                }
            }
        }
        return true;
    }
}