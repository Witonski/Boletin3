package Matrices;

public class Practicamos {
   public static int [][] sumarMatrices (int[][] matriz1, int[][] matriz2){
      if(matriz1.length != matriz2.length || matriz1[0].length != matriz2[0].length){
         System.out.println("Las matrices deben ser del mismo tamaño para sumarse ");
         return null;
      }
      int [][] matrizResultado = new int[matriz1.length][matriz1[0].length];

      for (int i = 0; i < matriz1.length; i++){
         for (int j = 0; j < matriz1[0].length; j++){
            matrizResultado[i][j] = matriz1[i][j] + matriz2[i][j];
         }
      }
      return matrizResultado;
   }

   public static void main(String[] args) {
      int[][] matriz1 = {{1,2},{4,6}};
      int[][] matriz2 = {{4,1},{1,0}};
      System.out.println(sumarMatrices(matriz1, matriz2));


   }
}
