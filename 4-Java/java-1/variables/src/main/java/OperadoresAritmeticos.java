import java.util.Scanner;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int i = 5, j = 4, suma = i + j;
        System.out.println("suma = " + suma);

        System.out.println("i + j = " + (i + j));
        System.out.println("i + j = " + i + j);

        int resta = i - j;
        System.out.println("resta = " + resta);
        System.out.println("i - j = " + (i - j));

        int multi = i * j;
        System.out.println("multi = " + multi);
        System.out.println("i * j = " + (i * j));

        int div = i / j;
        System.out.println("div = " + div);
        //Otra forma de poder hacerlo
        //float a = 5, b = 4;
        float div1 = (float) i / (float) j;
        System.out.println("div1 = " + div1);

        int resto = i % j;
        System.out.println("resto = " + resto);
        System.out.println("i % j = " + (i % j));
        resto = 8 % 5;
        System.out.println("resto = " + resto);

        //Para interactuar con el usuario ///////////////

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Cual es tu edad: ");
        String dato = scanner.next();
        int edad = Integer.parseInt(dato);
        System.out.println(" Cual es tu nombre: ");
        String nombre = scanner.next();
        System.out.println("Mi nombre y edad es : " + nombre +" "+ edad);


    }
}
