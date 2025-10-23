package Matrices;

public class Ejercicio1 {
    public static boolean comprobarNegativos(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 0) {
                    return true;
                }


            }

        }
        return false;
    }

            // Metodo principal para probar
            public static void main(String[] args) {

                // Matriz de prueba SIN negativos (debería devolver FALSE)
                int[][] matrizA = {
                        {1, 5, 10},
                        {2, 0, 8}
                };

                // Matriz de prueba CON negativos (debería devolver TRUE)
                int[][] matrizB = {
                        {10, -1, 5},
                        {4, 2, -7}
                };

                // Llamar al metodo e imprimir los resultados
                boolean resultadoA = comprobarNegativos(matrizA);
                boolean resultadoB = comprobarNegativos(matrizB);

                System.out.println("Matriz A (sin negativos): " + resultadoA);
                System.out.println("Matriz B (con negativos): " + resultadoB);
            }
        }





