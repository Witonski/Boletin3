package Matrices;
/*
10. Crea un metodo que compruebe si una matriz pasada por parámetro es simétrica en
función del eje Y. Es decir, la matriz
1 3 0 3 1
4 2 7 2 4
6 1 9 1 6
0 8 8 8 0
es simétrica en función de su eje Y, porque si invirtiésemos el orden en el que leemos las
columnas, la matriz se vería igual.
Pero la matriz
1 4 6
2 1 3
no es simétrica, pues no cumple dicha propiedad.
 */
public class Ejercicio10 {

    public static void main(String[] args) {
        int[][] matriz1 = {
                {1, 3, 0, 3, 1},
                {4, 2, 7, 2, 4},
                {6, 1, 9, 1, 6},
                {0, 8, 8, 8, 0}
        };
        int[][] matriz2 = {
                {1, 4, 6},
                {2, 1, 3}
        };

        System.out.println("Es simétrica matriz1 ? " + ejeSimetrica(matriz1));
        System.out.println("Es simétrica matriz2 ? " + ejeSimetrica(matriz2));
    }
    public static boolean ejeSimetrica(int[][] matriz) {
        int numFilas = matriz.length;

        if (numFilas == 0 || matriz[0].length <= 1) {
            return true;
        }
        int numColumnas = matriz[0].length;

        for (int i = 0; i < numFilas; i++) {
            for (int j = 0; j < numColumnas / 2; j++) {
                int l = numColumnas - 1 - j;
                if (matriz[i][j] != matriz[i][l]) {
                    return false;
                }
            }
        }

        return true;
    }
}
