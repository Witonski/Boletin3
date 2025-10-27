package Matrices;
/*
8. Crea un metodo que reciba dos matrices, que deben ser de igual tamaño, y sume el
contenido de las posiciones en una tercera matriz, que será la que devuelva:
        | 1 2| + | 4 1| = | 5 3|
        | 4 6| | 1 0| | 5 6|
        */
public class  Practicamos{

   /*
    * Método para comprobar si una matriz es simétrica en función de su eje X.
    * Es decir, si la Fila i es igual a la Fila (numFilas - 1 - i).
    */
   public static boolean matricesSimetricas(int[][] matriz) {
      int numFilas = matriz.length;

      // Caso base: 0 o 1 fila siempre es simétrico.
      if (numFilas <= 1) {
         return true;
      }

      // 1. Iteramos solo hasta la mitad de las filas para eficiencia.
      for (int i = 0; i < numFilas / 2; i++) {
         // 2. Calculamos el índice de la fila simétrica (j).
         int j = numFilas - 1 - i;

         // Obtenemos el número de columnas (asumiendo matriz rectangular).
         int numColumnas = matriz[i].length;

         // 3. Comparamos los elementos de la Fila i con la Fila j (elementos por elemento).
         for (int k = 0; k < numColumnas; k++) {
            // Si encontramos UN solo elemento que no coincide, NO es simétrica.
            if (matriz[i][k] != matriz[j][k]) {
               return false; // Salida temprana
            }
         }
      }

      // 4. Si el bucle termina sin encontrar diferencias, es simétrica.
      return true;
   }

   public static void main(String[] args) {
      // Matriz de prueba Simétrica (4x4)
      int[][] matriz = {
              {1, 3, 5, 6},
              {4, 2, 0, 8},
              {4, 2, 0, 8},
              {1, 3, 5, 6}
      };

      boolean resultado = matricesSimetricas(matriz);
      System.out.println("¿Son las dos matrices simétricas? " + resultado); // Debería imprimir: true
   }
}