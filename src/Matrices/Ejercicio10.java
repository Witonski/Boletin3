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
        int[][] matrizSimetricaY = {
                {1, 3, 0, 3, 1},
                {4, 2, 7, 2, 4},
                {6, 1, 9, 1, 6},
                {0, 8, 8, 8, 0}
        };
        int[][] matrizNoSimetrica = {
                {1, 4, 6},
                {2, 1, 3}
        };

        System.out.println("Matriz Simétrica Y es Simétrica Eje Y: " + ejeSimetrica(matrizSimetricaY));
        System.out.println("Matriz No Simétrica es Simétrica Eje Y: " + ejeSimetrica(matrizNoSimetrica));
    }
    public static boolean ejeSimetrica(int[][] matriz) {

        int numFilas = matriz.length;

        if (numFilas == 0 || matriz[0].length <= 1) {
            return true;
        }
        int numColumnas = matriz[0].length;

        for (int i = 0; i < numFilas; i++) {
            for (int k = 0; k < numColumnas / 2; k++) {
                int l = numColumnas - 1 - k;
                if (matriz[i][k] != matriz[i][l]) {
                    return false;
                }
            }
        }

        return true;
    }
}
