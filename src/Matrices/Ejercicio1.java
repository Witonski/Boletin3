package Matrices;
/*
1. Crea un metodo que compruebe si en una matriz hay algún valor negativo, y devuelva un
valor booleano.
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        int[][] matriz = {
                {10, 20, 30},
                {40, -5, 60},
                {70, 80, 90}
        };


        System.out.println("¿La Matriz  contiene negativos? " + contieneNegativos(matriz));

    }

     public static boolean contieneNegativos(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 0) {
                    return true;
                }
            }
        }
        return false;
    }
}


