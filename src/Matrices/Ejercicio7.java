package Matrices;

/*
7. Crea un metodo que reciba dos matrices, y compruebe si son exactamente iguales.
 */
public class Ejercicio7 {

    public static void main(String[] args) {

        int[][] matrizA = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[][] matrizB = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        boolean resultado = comparaMatrices(matrizA, matrizB);
        System.out.println("Son iguales la matrizA y la matrizB?: " + resultado);
    }
    public static boolean comparaMatrices(int[][] matrizA, int[][] matrizB) {

        //Comprueba si las dos matrices tienen el mismo número de filas.
        if (matrizA.length != matrizB.length) {
            return false;
        }
        //Comprueba si la fila actual de ambas matrices tiene el mismo número de columnas
        for (int i = 0; i < matrizA.length; i++) {
            if (matrizA[i].length != matrizB[i].length) {
                return false;
            }
            for (int j = 0; j < matrizA[i].length; j++) {
                if (matrizA[i][j] != matrizB[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }
}
