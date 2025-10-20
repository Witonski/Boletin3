package Boletin_Arrays;

public class Ejercicio4B {

    // Constante para la cantidad de números a generar (visible en la imagen)
    final static int CANTIDAD_NUMEROS = 6000;

    public static void main(String[] args) {

        // Array para almacenar los 6000 números generados
        int[] generados = new int[CANTIDAD_NUMEROS];

        // Array para contar las veces que un número termina en 0..9
        int[] digitos = new int[10];

        double media;
        double suma = 0;

        int digito; // Variable declarada pero no usada en la lógica de la imagen

        // 1. Bucle de generación de números, cálculo de suma, y conteo de dígitos
        for (int i = 0; i < CANTIDAD_NUMEROS; i++) {

            // Genera el número aleatorio (0 a 100, inclusivo)
            int numGenerado = MiEntradaSalidaB.generaAleatorioEntre(0, 100, true);

            // Almacena el número en el array
            generados[i] = numGenerado;

            // Acumula la suma total
            suma += numGenerado;

            // Conteo del dígito final (usa el módulo 10)
            digitos[numGenerado % 10]++;
        }



        // 2. Cálculo y muestra de la media
        media = suma / CANTIDAD_NUMEROS;
        System.out.println("La media es " + media);
        System.out.println();

        // 3. Determinar el dígito que más se repite
        int mayor = Integer.MIN_VALUE;
        int mayorIndice = 0;

        for (int i = 0; i < digitos.length; i++) {
            if (digitos[i] > mayor) {
                mayor = digitos[i];
                mayorIndice = i;
            }
        }

        // 4. Mostrar el dígito más repetido
        System.out.println("EL dígito que mas se repite es el " + mayorIndice);
        System.out.println();

        // 5. Mostrar el conteo, porcentaje, y buscar dígitos no terminados
        double sumaPorcentajes = 0.0;

        for (int i = 0; i < digitos.length; i++) {

            // Cálculo del porcentaje
            double porcentaje = (double) digitos[i] / CANTIDAD_NUMEROS * 100;
            sumaPorcentajes += porcentaje;

            // Mostrar conteo y porcentaje
            System.out.printf("EL nº %d Se ha repetido %d veces. Esto equivale a un %.2f%%%n",
                    i,
                    digitos[i],
                    porcentaje);

            // Requisito adicional: En qué dígitos no ha terminado ningún número
            if (digitos[i] == 0) {
                System.out.printf("--- El dígito %d no ha terminado en NINGÚN número. ---%n", i);
            }
        }

        System.out.println();

        // 6. Cálculos finales de sumas de porcentajes y media de porcentajes
        double mediaPorcentajesContados = sumaPorcentajes / 10; // Hay 10 posibles dígitos (0-9)

        System.out.printf("La suma de todos los porcentajes es equivalente al %.2f%%. El %% medio para cada contador es de %.2f%%.%n",
                sumaPorcentajes,
                mediaPorcentajesContados);
        System.out.println();
    }
}