import java.util.Random;

/**
 * Clase auxiliar para generar números aleatorios según la estructura requerida.
 */
public class MiEntradaSalida {

    /**
     * Genera un número entero aleatorio en el rango especificado [min, max].
     * * @param min               El valor mínimo inclusivo.
     * @param max               El valor máximo.
     * @param seAceptaElMaximo  Si es true, el máximo es inclusivo. Si es false, es exclusivo.
     * @return El número aleatorio generado.
     */
    public static int generaAleatorioEntre(int min, int max, boolean seAceptaElMaximo) {
        Random rand = new Random();
        int rango;

        // Determinar el rango de la generación
        if (seAceptaElMaximo) {
            // El rango incluye el máximo (ej: [0, 100] -> 101 números posibles)
            rango = max - min + 1;
        } else {
            // El rango excluye el máximo (ej: [0, 100) -> 100 números posibles)
            rango = max - min;
        }

        // Generar el número: rand.nextInt(rango) produce [0, rango-1]
        // Luego se le suma 'min' para mover el rango a [min, min + rango - 1]
        return rand.nextInt(rango) + min;
    }
}
