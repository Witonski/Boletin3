package Matrices;

/*
3. Crea un metodo que reciba una matriz e imprima, en una sola línea, los elementos de la
misma, leídos por filas:
1 3 5 --> La salida es: 1 3 5 0 2 7
0 2 7
 */
public class Ejercicio3 {


    public static void imprimirMatriz(int[][] matriz) {


        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {


                System.out.print(matriz[i][j] + " ");
            }
        }


        System.out.println();
    }


    public static void main(String[] args) {
        int[][] matriz_ejemplo = {
                {1, 3, 5},
                {0, 2, 7}
        };
        imprimirMatriz(matriz_ejemplo);
        // Salida: 1 3 5 0 2 7
    }
}