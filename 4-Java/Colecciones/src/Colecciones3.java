import java.util.*;

public class Colecciones3 {
    public static void main(String[] args) {
        System.out.println("ArrayList");
        List<String> comidas = new ArrayList<String>();
        comidas.add("Pozole");
        comidas.add("Tostadas");
        comidas.add("Ceviche");
        comidas.add(2,"Esquite");

        System.out.println(comidas);

        //Otra forma de inicializar una lista
        List<Integer> numeros = new ArrayList<Integer>(Arrays.asList(1,2,3, 56, 789));
        System.out.println(numeros);

        System.out.println("---------------");
        System.out.println("HashSet");

        Set<String> ciudades =  new HashSet<String>();
        ciudades.add("CDMX");
        ciudades.add("GDL");
        ciudades.add("MTY");

        System.out.println(ciudades);

        //Otra forma de crear un HasSet
        Set<Boolean> verdad = new HashSet<Boolean>(Arrays.asList(true, false, false, true));
        System.out.println(verdad);

        System.out.println("-----------");
        System.out.println("HashMap");

        //Nos permiten guardar pared de valores
        //Llave : valor
        //HashMap<Llave, Valor>

        Map<Integer, String> alumnos = new HashMap<Integer, String>();
        alumnos.put(1, "Pedro");
        alumnos.put(2, "Sofia");
        alumnos.put(3, "Salma");
        alumnos.put(4, "Miguel");
        alumnos.put(4, "Saúl");
        alumnos.put(5, "Miguel");

        System.out.println(alumnos);
        System.out.println(alumnos.size());
        System.out.println(alumnos.values());//Lista de valores
        System.out.println(alumnos.keySet());//Lista de llaves
        System.out.println(alumnos.get(2));

        for (int i=0; i<alumnos.size(); i++){
            Object llaves = alumnos.keySet().toArray()[i];
            System.out.println(alumnos.get(llaves));

        }

        for (Integer llave : alumnos.keySet()){
            System.out.println(llave + " - " + alumnos.get(llave));

        }


    }
}
