import java.util.Scanner;

public class Semana {
    public static void main(String[] args) {
        System.out.println("Semana");

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un nuemro: ");
        byte diaSemana = sc.nextByte();

        switch (diaSemana){

            case 1:
                System.out.println("Se escribe un uno");
                break;
            case 2:
                System.out.println("Se escribe un dos");
                break;
            default:
                System.out.println("No entendi");
        }
    }
}

