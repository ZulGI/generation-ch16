package MiEjemploJava;

public class EjemploPersona {
    public static void main(String[] args) {

        //Instancia, la relación de un objeto con una clase
        Persona p = new Persona();
        p.setNombre("Diego");
        p.setEdad(32);
        p.setNss(146890);
        System.out.println("El nombre de la varibale de instancia p.nombre -> " + p.getNombre());
        System.out.println("El nombre de la varibale de instancia p.edad -> " + p.getEdad());
        System.out.println("El nombre de la varibale de instancia p.nss -> " + p.getNss());

    }
}
