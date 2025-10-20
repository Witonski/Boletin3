import java.util.Scanner;

public class Ejercicio6Primero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Introduce el tamaño de array: ");
        int tamano = sc.nextInt();


        if (tamano <= 0) {
            System.out.println("Introduce un número positivo > 0.");
            return;
        }

        int[] numeros = new int[tamano];

        // Rellenar el array
        for (int i = 0; i < tamano; i++) {
            System.out.print("Introduzca el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        // Pedir el valor a buscar
        System.out.print("Introduzca el número que desea buscar en el array: ");
        int valorBuscado = sc.nextInt();

        // Iniciar la Búsqueda
        boolean encontrado = false;

        for (int numero : numeros) {
            if (numero == valorBuscado) {
                encontrado = true;
                break;
            }
        }

        // 5. Mostrar el Resultado
        System.out.println("\n--- Resultado ---");
        if (encontrado) {
            System.out.println("El valor " + valorBuscado + " SÍ fue encontrado en el array.");
        } else {
            System.out.println("El valor " + valorBuscado + " NO fue encontrado en el array.");
        }

        sc.close();
    }
}
