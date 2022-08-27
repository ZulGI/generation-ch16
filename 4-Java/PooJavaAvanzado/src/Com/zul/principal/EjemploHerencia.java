package Com.zul.principal;

import Com.zul.herencia.BasePadre;
import Com.zul.herencia.Hija;
import Com.zul.herencia.Hijo;

public class EjemploHerencia {
    public static void main(String[] args) {
        Hija h = new Hija();
        h.visualizarA();
        Hijo ho = new Hijo();
        ho.visualizarABC();

        BasePadre obj = new BasePadre();
        obj.setA(2357);

        System.out.println("Atributo de Clase Base Padre ->"+h.getA());

    }
}
