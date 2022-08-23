import java.util.*; //Importar todas las clases del paquete util

import java.util.Scanner;

public class Bucles {

    public static void main(String[] args) {
        //let i=1
        //bucle controlado
        for(int i=5; i<=10; i++){
            System.out.println(i);
        }

        //While
        //bucle no controlado
        //La condición se debe de modificar dentro del while

        String condicion = "";
        Scanner sc = new Scanner(System.in);

        // == != estamos comparando datos primitivos
        //Mientras la condición sea true
        while (!Objects.equals(condicion, "Hola")){
            System.out.println("Saludame");
            condicion = sc.next();
        }

        //Do while es igual al While
        //El do while ejecuta la acción aunque sea una vez

        do{
            System.out.println("Saludame x2");
            condicion = sc.next();
        }while(!Objects.equals(condicion, "Hola"));
    }
}
