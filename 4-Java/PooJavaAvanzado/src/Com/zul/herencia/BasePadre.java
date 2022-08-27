package Com.zul.herencia;

public class BasePadre {
    protected int a;
    private double b;
    private String c;

    public BasePadre(){

    }
    public void visualizarA(){
        System.out.println("Objeto h -> soy un metodo de la clase BasePadre");

    }
    public void visualizarABC(){
        System.out.println("Objeto ho -> soy el metodo visualizarABC");

    }


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public BasePadre(int a, double b, String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
