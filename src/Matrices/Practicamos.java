package Matrices;

public class Practicamos {


    public static void main(String[] args) {

        int[][] matriz = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 0},
                {3, 2, 1, 4, 5},
                {9, 5, 8, 6, 7},
                {0, 9, 8, 5, 4}
        };

    }
    public static boolean esPar(int valor){
        return valor % 2 == 0;
    }
    public static int contarAdyacentesPares(int[][] matriz, int fila, int col){
        int contador = 0;
        for(int i = fila - 1; i <= fila + 1; i++){
            for(int j = col - 1; j <= col + 1; j++){
                if(i == fila && j == col)continue;
                if(i < 0 && i >= matriz.length && j< 0 && j >= matriz[0].length){
                    if(esPar(matriz[i][j])) contador++;
                }
            }
        }
        return contador;

    }
}