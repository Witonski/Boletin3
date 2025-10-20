import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("Introduzca las posiciones que tendrá el array: ");
        int numElementos = sc.nextInt();

        // Si pedimos un numero negativo lo trasforma en positivo
        if (numElementos < 0) {
            numElementos = -numElementos;
            System.out.println("El numero no debe ser negativo. El error se ha autocorregido a " + numElementos);
        }

        // Manejar el caso de array con 0 elementos para evitar errores (¡MOVIDO AQUÍ!)
        if (numElementos == 0) {
            System.out.println("No se puede analizar un array con 0 elementos.");
            sc.close();
            return; // Termina el programa de forma segura
        }

        // El array que vamos a rellenar
        int[] numeros = new int[numElementos]; // Array creado SÓLO si numElementos > 0

        // 2. Rellenar el array
        for (int i = 0; i < numElementos; i++) {
            System.out.print("Introduzca el numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        // 3. Búsqueda de Mayor, Menor y Suma (Optimizado en un solo bucle)
        // Ahora es seguro inicializar con numeros[0] porque sabemos que numElementos > 0
        int valorMayor = numeros[0];
        int valorMenor = numeros[0];
        double suma = 0;

        for (int numero : numeros) {
            if (numero > valorMayor) {
                valorMayor = numero;
            }
            if (numero < valorMenor) {
                valorMenor = numero;
            }
            suma += numero;
        }

        // 4. Conteo de Repeticiones
        int contMayor = 0;
        int contMenor = 0;

        for (int numero : numeros) {
            if (numero == valorMayor) {
                contMayor++;
            }
            if (numero == valorMenor) {
                contMenor++;
            }
        }

        // 5. Cálculo de la media
        double media = suma / numElementos; // Es seguro dividir porque numElementos > 0

        // 6. Muestra los resultados
        System.out.println("\n--- Resultados ---");

        System.out.print("El mayor número introducido es " + valorMayor);
        if (contMayor > 1) {
            System.out.println(" (se repite " + contMayor + " veces)");
        } else {
            System.out.println();
        }

        System.out.print("El menor número introducido es " + valorMenor);
        if (contMenor > 1) {
            System.out.println(" (se repite " + contMenor + " veces)");
        } else {
            System.out.println();
        }

        System.out.printf("La media de los números introducidos es: %.2f\n", media);

        sc.close();
    }
}