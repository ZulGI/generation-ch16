package MetPrincipal;

import MenuP.MenuOp;
import MiEjemploJava.Persona;
import MiFecha.Fecha;
import MiSaludo.Saludo;
import com.sun.source.tree.DoWhileLoopTree;

import java.util.Scanner;

public class EjecutaT {
    public static void main(String[] args) {

        MenuOp menuOp = new MenuOp();
        menuOp.menu();




            System.out.print("Elija una opción -> ");
            Scanner sc = new Scanner(System.in);
            int op = sc.nextInt();

            switch (op) {
                case 1:
                    Saludo s = new Saludo();
                    s.saludar();
                    System.out.println(s.saludar0());
                    break;

                case 2:
                    Persona p = new Persona();
                    p.setNombre("Diego");
                    p.setEdad(32);
                    p.setNss(146890);
                    System.out.println("El nombre de la varibale de instancia p.nombre -> " + p.getNombre());
                    System.out.println("El nombre de la varibale de instancia p.edad -> " + p.getEdad());
                    System.out.println("El nombre de la varibale de instancia p.nss -> " + p.getNss());
                    break;

                case 3:
                    Fecha objF = new Fecha();
                    objF.setDia(25);
                    objF.setMes(8);
                    objF.setAnio(2022);
                    System.out.println(objF.formaF());
                    break;

                case 4:
                    System.out.println("Aquí va la actividad del día");
                    break;

                default:
                    System.out.println("Opción invalida");
                    break;

            }



    }
}
