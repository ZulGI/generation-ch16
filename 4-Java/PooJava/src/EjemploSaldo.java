public class EjemploSaldo {
    public static void main(String[] args) {
        //Manera de declarar y construir de forma directa
        //Saludo objSaludo = new Saludo();


        //Declaración
        Saludo objSaludo;
        //Contrucción
        objSaludo = new Saludo();
        //Llamada
        objSaludo.saludar();

        Saludo objSaludo0 = new Saludo();

        System.out.println(objSaludo.saludar0());
        System.out.println("Este es otro objeto: ->" + objSaludo0.saludar0());
    }
}
