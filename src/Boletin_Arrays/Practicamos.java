package Boletin_Arrays;

public class Practicamos {

    public static void main(String[] args) {

            int [] array = {0, 7, 10, 8, 9, 3, 2};
            int resultado = 0;

            for (int i = 0; i < array.length; i += 2){
                resultado += array[i];
            }
        System.out.println("La suma de las posiciones pares es = " + resultado);


    }
}





