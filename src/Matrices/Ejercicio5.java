package Matrices;

/*
5. Crea un metodo que reciba una matriz e imprima, en una sola línea, los elementos de la
misma, pero leídos por columnas:
1 3 5 --> La salida es: 1 0 3 2 5 7
0 2 7
 */
public class Ejercicio5 {

    public static void main(String[] args) {

        int[][] matriz = {
                {1, 3, 5},
                {0, 2, 7}
        };

        System.out.print("La salida por columnas es: ");

        imprimirPorColumnas(matriz);


    }


    public static void imprimirPorColumnas(int[][] matriz) {

        // Bucle exterior: Controla la COLUMNA (j). Va desde 0 hasta el total de columnas.
        // El total de columnas se obtiene con matriz[0].length.
        for (int j = 0; j < matriz[0].length; j++){

            // Bucle interior: Controla la FILA (i). Va desde 0 hasta el total de filas (matriz.length).
            for(int i = 0; i < matriz.length; i++){


                System.out.print(matriz[i][j] + " ");
            }
        }
    }
}