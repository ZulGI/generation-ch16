import java.util.Scanner;

public class Ejercicios {
    public static void main(String[] args) {
        //PROBLEMA 1
        System.out.println("Ejercicio 1:");
        for(int i=0; i<5; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

        //PROBLEMA 2
        System.out.println("\nEjercicio 2:");
        for(int i=5; i>0; i--){
            for(int j=i; j>0; j--){
                System.out.print("*");
            }
            System.out.println(" ");
        }

        //PROBLEMA 3
        System.out.println("\nEjercicio 3:");
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero maximo de asteriscos:");
        int numAsteriscos = leer.nextInt();
        System.out.println("\nPara orden ascendente ingrese 1. Para orden desendente ingrese 2.");
        int opcion = leer.nextInt();

        switch (opcion){
            case 1:
                for(int i=0; i<numAsteriscos; i++){
                    for(int j=0; j<=i; j++){
                        System.out.print("*");
                    }
                    System.out.println(" ");
                }
                break;
            case 2:
                for(int i=numAsteriscos; i>0; i--){
                    for(int j=i; j>0; j--){
                        System.out.print("*");
                    }
                    System.out.println(" ");
                }
                break;
            default:
                System.out.println("Opción Incorrecta");
        }

    }
}
