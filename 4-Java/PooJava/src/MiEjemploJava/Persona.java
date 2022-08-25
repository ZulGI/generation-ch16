package MiEjemploJava;

public class Persona {

    private String nombre;

    private int edad;

    private int nss;

    public Persona(String nombre, int edad, int nss) {
        this.nombre = nombre;
        this.edad = edad;
        this.nss = nss;
    }

    void caminar(){
        System.out.println("Estoy caminando");

    }
    void dormir(){
        System.out.println("Estoy durmiendo");

    }
}
