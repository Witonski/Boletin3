public class Practicamos {
    public static void main(String[] args) {

        int[] numeros = {3, 9, 5, 65, 4};
        int sumarPares = 0;

        for(int i = 0; i < numeros.length; i += 2){
            sumarPares += numeros[i];
        }
        System.out.println("La suma de posiciones pares es " + sumarPares );
    }
}
