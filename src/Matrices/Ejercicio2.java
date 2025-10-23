package Matrices;
/*
1. Crea un metodo que compruebe si en una matriz hay algún valor negativo, y devuelva un
valor booleano.

 */
public class Ejercicio2 {


    public static int contarNegativos(int[] arrayDeEnteros) {

        int contador = 0;


        for (int i = 0; i < arrayDeEnteros.length; i++) {

            if (arrayDeEnteros[i] < 0) {

                contador++;
            }
        }

        return contador;
    }

    public static void main(String[] args) {

        int[] numeros = {10, -5, 2, -15, 0, -3, 8};
        int cantidad = contarNegativos(numeros);

        System.out.println("El array es: [10, -5, 2, -15, 0, -3, 8]");
        System.out.println("La cantidad de números negativos es: " + cantidad);

    }
}