package co.edu.uniquindio.poo;

public abstract class Zona {
    private String nombreFigura;
    private Material material;

    public Zona(String nombre) {
        this.nombreFigura = nombre;
    }

    

    public String getNombreFigura() {
        return nombreFigura;
    }

    public Material getMaterial() {
        return material;
    }
}
