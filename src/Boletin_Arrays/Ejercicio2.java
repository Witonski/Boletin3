package Boletin_Arrays;

public class Ejercicio2 {

    public static void main(String[] args) {

        int[] numeros = {8, -3, 2, -7, 0, 7, 8};


        int contadorNegativos = 0;

        for (int numero : numeros) {

             if (numero < 0) {
                contadorNegativos++;
            }
        }
        System.out.println("El número total de elementos negativos es: " + contadorNegativos);
    }
}

/*
public class Boletin_Arrays.Ejercicio2 {

    public static void main(String[] args) {
        int[] numeros = {8, -3, 2, -7, 0, 7, 8};

        int contadorNegativos = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < 0) {
                contadorNegativos++;
            }
        }

        System.out.println("El número total de elementos negativos es: " + contadorNegativos);
    }
}
 */