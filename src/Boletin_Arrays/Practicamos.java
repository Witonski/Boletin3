package Boletin_Arrays;
/*
2. Crea un programa que detecte cuántos números negativos hay en un array de enteros.
 */
public class Practicamos {
    public static void main(String[] args) {
        int[] array = {4,7,-3,-6,7,-4};
        int contador = 0;

        for(int f = 0; f < array.length; f++){
            if (array[f] < 0){
                contador++;

            }

        }
        System.out.println("Hay " + contador + " números negativos");
    }
}


