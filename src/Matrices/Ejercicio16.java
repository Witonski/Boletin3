package Matrices;

public class Ejercicio16 {

    public static int[][] contarAdyacentesPares(int[][] matriz) {
        int filas = matriz.length;
        if (filas == 0) return new int[0][0]; // Manejo de matriz vacía
        int columnas = matriz[0].length;
        int[][] resultado = new int[filas][columnas];

        int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                int contadorPares = 0;

                for (int k = 0; k < 8; k++) {
                    int ni = i + dx[k];
                    int nj = j + dy[k];

                    if (ni >= 0 && ni < filas && nj >= 0 && nj < columnas) {
                        if (matriz[ni][nj] % 2 == 0) {
                            contadorPares++;
                        }
                    }
                }
                resultado[i][j] = contadorPares;
            }
        }
        return resultado;
    }

    public static void main(String[] args) {
        int[][] matrizOriginal = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 0},
                {3, 2, 1, 4, 5},
                {9, 5, 8, 6, 7},
                {0, 9, 8, 5, 4}
        };

        int[][] matrizResultado = contarAdyacentesPares(matrizOriginal);

        System.out.println("Matriz Resultado:");
        for (int[] fila : matrizResultado) {
            for (int valor : fila) {
                System.out.printf("%2d ", valor);
            }
            System.out.println();
        }
    }
}
