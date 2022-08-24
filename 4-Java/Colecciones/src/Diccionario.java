import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Diccionario {
    public static void main(String[] args) {

        Map<String, String> diccionario = new HashMap<String, String>();

        diccionario.put("manzana", "apple");
        diccionario.put("arbol", "tree");
        diccionario.put("mascota", "pet");
        diccionario.put("vaca", "cow");
        diccionario.put("rosa", "pink");
        diccionario.put("perro", "dog");
        diccionario.put("gato", "kitten");
        diccionario.put("mariposa", "butterfly");
        diccionario.put("mosca", "fly");
        diccionario.put("verdura", "vegetable");
        diccionario.put("abeja", "bee");
        diccionario.put("sol", "sun");
        diccionario.put("nube", "cloud");
        diccionario.put("tierra", "ground");
        diccionario.put("mantequilla", "butter");
        diccionario.put("cocodrilo", "crocodile");
        diccionario.put("lampara", "lamp");
        diccionario.put("zapato", "shoe");
        diccionario.put("tenis", "sneakers");
        diccionario.put("coche", "car");
        diccionario.put("television", "television");
        diccionario.put("oso", "bear");
        diccionario.put("girasol", "sunflower");
        diccionario.put("servilleta", "napkin");
        diccionario.put("carpinteria", "carpentry");
        diccionario.put("madera", "wood");

        Scanner teclado = new Scanner(System.in);
        String scanner = teclado.nextLine();

        for (int i=0; i<5 ; i++){
            Object llaves = diccionario.keySet().toArray()[i];
            System.out.println(diccionario.get(llaves));
        }








    }
}