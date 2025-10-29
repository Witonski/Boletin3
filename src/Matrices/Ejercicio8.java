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
       imprimirMatriz(sumarMatrices(matrizA, matrizB));
        }


    public static int[][] sumarMatrices(int[][] matrizA, int[][] matrizB) {
        if (matrizA.length != matrizB.length || matrizA[0].length != matrizB[0].length) {
            System.out.println("Error: Las matrices deben ser del mismo tamaño para sumarse.");
            return null;
        }
        int[][] matrizResultado = new int[matrizA.length][matrizA[0].length];

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[0].length; j++) {
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

