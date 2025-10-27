package Matrices;
/*
8. Crea un metodo que reciba dos matrices, que deben ser de igual tamaño, y sume el
contenido de las posiciones en una tercera matriz, que será la que devuelva:
| 1 2| + | 4 1| = | 5 3|
| 4 6| | 1 0| | 5 6|
 */
public class Ejercicio8 {
    public static void main(String[] args) {

        int[][] matrizA = {
                {1, 2},
                {4, 6}
        };
        int[][] matrizB = {
                {4, 1},
                {1, 0}
        };
        System.out.println(" ");
        System.out.println("--- Suma de Matrices ---");
        int[][] matrizResultado = sumarMatrices(matrizA, matrizB);

        if (matrizResultado != null) {
            System.out.println("\nMatriz Resultado (A + B):");
            imprimirMatriz(matrizResultado);
        }
    }

    public static int[][] sumarMatrices(int[][] matrizA, int[][] matrizB) {

        if (matrizA.length != matrizB.length || matrizA[0].length != matrizB[0].length) {
            System.out.println("Error: Las matrices deben ser del mismo tamaño para sumarse.");
            return null;
        }
        int filas = matrizA.length;
        int columnas = matrizA[0].length;

        int[][] matrizResultado = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizResultado[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        return matrizResultado;
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("|");
        }
    }
}
