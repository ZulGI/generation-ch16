public class Saludo {

    //Void regresa pero no regresa elementos como un return
    //Se llama directo desde el objeto
    void saludar(){
        System.out.println("Hola Java OOP");
    }
    //Si es un metodo distinto a void se regresa con return
    String saludar0(){
        String textoS = "Hola Mundo Java OOP";
        return textoS;

    }
}
