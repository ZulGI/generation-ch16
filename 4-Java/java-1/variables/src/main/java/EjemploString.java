public class EjemploString {
    public static void main(String[] args) {
        String curso = "Curso en Java";
        //Esta es literal
        System.out.println("Curso = " + curso);
        String nombre = "Victor Hugo";
        String resultado = new String("Curso en Java");
        //esta es por referencia
        System.out.println("resultado = " + resultado);

        //Se compara un valor con un objeto referenciado
        //Se comparan las referencias

        boolean esigual = curso == resultado;
        System.out.println("esigual = " + esigual);

        Number numero1 = 23;
        System.out.println(nombre + " tiene " + numero1 );


        esigual= curso.equals(resultado);
        System.out.println("esigual = " + esigual);

        String concat = curso + " " + nombre;
        System.out.println("concat = " + concat);
        String dia = "Jueves";

        String concat1= concat.concat(" ").concat(dia);

        System.out.println("concat1 = " + concat1);
    }
}
