package Com.zul.h_abstracta;

public abstract class FigurasGeometricas {
    private String nombre;
    public abstract float area();

    public FigurasGeometricas(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre + "Area -> " + area();
    }
}

