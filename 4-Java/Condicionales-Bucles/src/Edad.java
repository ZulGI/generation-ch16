import java.util.Scanner;

public class Edad {
    public static void main(String[] args) {
        System.out.println("Esta es la clase Edad");

        //Determinar si uno es mayor de edad

        //Tener la edad - pedir al usuario
        //Condicional para saber si es menor de 18


        //let nombre = prompt("Escribe tu edad")

        Scanner escaner = new Scanner(System.in); //Instanciar
        System.out.println("Escribe tu edad: ");
        int edad = escaner.nextInt();
        escaner.close(); //Cuando ya no se necesiten leer más datos

        //if else
        if(edad >= 18){
            System.out.println("Eres mayor de edad");
        }else {
            System.out.println("Eres menor de edad");
        }

        //Operador terneario
        String resultado = (edad >= 18) ? "Eres mayor de edad": "Eres menor de edad";
        System.out.println(resultado);
    }
}
