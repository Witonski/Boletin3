import javax.swing.*;
import java.util.Scanner;

public class Practicamos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int diaSemana;

        System.out.println("Ingrese día de la semana ");
        diaSemana = sc.nextInt();

        switch (diaSemana){
            case 1:
                System.out.println("Hoy es lunes ");
                break;
            case 2:
                System.out.println("Hoy es martes ");
                break;
            case 3:
                System.out.println("Hoy es miércoles ");
                break;
            case 4:
                System.out.println("Hoy es jueves ");
                break;
            case 5:
                System.out.println("Hoy es viernes ");
                break;
            case 6:
                System.out.println("Hoy es sábado ");
                break;
            case 7:
                System.out.println("Hoy es domingo ");
                break;
            default:
                System.out.println("Número incorrecto, saliendo del sistema");
        }
    }
}
