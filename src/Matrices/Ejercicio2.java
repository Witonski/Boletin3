package Matrices;
/*
2. Crea un metodo que sume todas las posiciones de una matriz y devuelva dicho número.
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        int [][] matriz = {
                {3,4,2},
                {3,4,2},
                {3,4,2}
        };
        int resultado = sumarMatriz(matriz);
        System.out.println(resultado);
    }

    public static int sumarMatriz(int[][] matriz) {

        int suma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }

        }
        return suma;
    }
}

