package Com.zul.J_Interface;

public class EjemploTest {
    public static void main(String[] args) {
        //Primer forma de hacer instancia, con interfaz
        System.out.println("Test.CONV = " + Test.CONV);
        //Segunda forma con clase que implementa
        System.out.println("Prueba.CONV = " + Prueba.CONV);
        //Tercer forma,
        Prueba p = new Prueba();
        System.out.println("p.CONV = " + p.CONV);

        //Instancia de referencia
        Test ts = new Prueba();
        ts.metodo1(3);

        System.out.println("ts.metodo2(\"hola\") = " + ts.metodo2("Hola"));
        p.metodoPropio();

        Test1 s1 = new Prueba();
        s1.metodo01();
        System.out.println("s1.metodo02() = " + s1.metodo02());


    }
}
