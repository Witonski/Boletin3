public class Ejercicio4 {

    // Constante para fijar el número de elementos
    private static final int CanitdadNumeros = 6000;

    public static void main(String[] args) {


        // El array tendrá un tamaño fijo de 6000 elementos (int).
        int[] numerosAleatorios = new int[CanitdadNumeros];

        // Generación de los números aleatorios y llenado del array
        for (int i = 0; i < CanitdadNumeros; i++) {
            // Genera un número aleatorio entre 0 (incluido) y 101 (excluido)
            int numero = (int)(Math.random() * 101);

            // Asigna el número al array en la posición actual
            numerosAleatorios[i] = numero;
        }


        System.out.println("Se han generado " + CanitdadNumeros + " números aleatorios de 0 a 100.");


        }

    }
