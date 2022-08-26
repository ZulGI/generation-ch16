package MiSaludo;

public class EjemploSaludo {
    public static void main(String[] args) {
        //Manera de declarar y construir de forma directa
        //MiSaludo.Saludo objSaludo = new MiSaludo.Saludo();


        //Declaración
        Saludo objSaludo;
        //Contrucción
        objSaludo = new Saludo();
        //Llamada
        objSaludo.saludar();

        Saludo objSaludo0 = new Saludo();

        System.out.println(objSaludo.saludar0());
        System.out.println("Este es otro objeto: ->" + objSaludo0.saludar0());
        objSaludo.textoS = "Hola";

        System.out.println("objSaludo = " + objSaludo);
        
        objSaludo0.a = 4;
        System.out.println("objSaludo0 = " + objSaludo0);
    }
}
