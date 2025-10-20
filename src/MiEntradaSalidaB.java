import java.util.Random;

public class MiEntradaSalidaB {

    public static int generaAleatorioEntre(int min, int max, boolean seAceptaElMaximo) {
        Random rand = new Random();
        int rango;

        if (seAceptaElMaximo) {
            rango = max - min + 1;
        } else {
            rango = max - min;
        }

        return rand.nextInt(rango) + min;
    }
}