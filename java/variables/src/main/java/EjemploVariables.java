public class EjemploVariables {
    public static void main(String[] args) {
        String nombre= "Hugo";
        String saludo = "Hola esto es ejemplo de variables";

        System.out.println(saludo + " " + nombre);
        char espacio = '\u0040';
        char caracter = 'a';
        System.out.println("espacio = "+ espacio);
        System.out.println("char corresponde en bytes: " + Character.BYTES);
        System.out.println("char corresponde en bits: " + Character.SIZE);
        System.out.println("char valor maximo: "+ Character.MAX_VALUE);
        System.out.println("char valor minimo: "+ Character.MIN_VALUE);

        int numeroEntero = 2;
        System.out.println("numeroEntero = " + numeroEntero);
        System.out.println("int corresponde en bytes: " + Integer.BYTES);
        System.out.println("int corresponde en bits: " + Integer.SIZE);
        System.out.println("int valor maximo: "+ Integer.MAX_VALUE);
        System.out.println("int valor minimo: "+ Integer.MIN_VALUE);

        float numeroFloat = 1.5e-10f; //1.5e-10f
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("float corresponde en bytes: " + Float.BYTES);
        System.out.println("float corresponde en bits: " + Float.SIZE);
        System.out.println("float valor maximo: "+ Float.MAX_VALUE);
        System.out.println("float valor minimo: "+ Float.MIN_VALUE);

        double numeroDouble = 3.444567E39;
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("double corresponde en bytes: " + Double.BYTES);
        System.out.println("double corresponde en bits: " + Double.SIZE);
        System.out.println("double valor maximo: "+ Double.MAX_VALUE);
        System.out.println("double valor minimo: "+ Double.MIN_VALUE);

        boolean valorBoolean = (3-2 == 1);
        System.out.println("valorBoolean = " + valorBoolean);

        long valorLong = 1;
        System.out.println("valorLong = " + valorLong);
        System.out.println("Long corresponde en bytes: " + Long.BYTES);
        System.out.println("Long corresponde en bits: " + Long.SIZE);
        System.out.println("Long valor maximo: "+ Long.MAX_VALUE);
        System.out.println("Long valor minimo: "+ Long.MIN_VALUE);

        byte valorByte = 1;
        System.out.println("valorByte = " + valorByte);
        System.out.println("Byte corresponde en bytes: " + Byte.BYTES);
        System.out.println("Byte corresponde en bits: " + Byte.SIZE);
        System.out.println("Byte valor maximo: "+ Byte.MAX_VALUE);
        System.out.println("Byte valor minimo: "+ Byte.MIN_VALUE);

        short valorShort = 1;
        System.out.println("valorShort = " + valorShort);
        System.out.println("Short corresponde en bytes: " + Short.BYTES);
        System.out.println("Short corresponde en bits: " + Short.SIZE);
        System.out.println("Short valor maximo: "+ Short.MAX_VALUE);
        System.out.println("Short valor minimo: "+ Short.MIN_VALUE);

        var miVar = 2;
        System.out.println("miVar = " + miVar);




    }
}
