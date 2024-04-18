package co.edu.uniquindio.poo;

public class Zona {

    private String nombreFigura;

    public double areaCirculo;
    public double areaCuadrado;
    public double areaRectangulo;
    public double areaTrianguloRectangulo;
    private Material material;
    private double lado;

    public Zona(String nombre, Material material) {
        this.nombreFigura = nombre;
        this.material = material;

    }
    public double calcularAreaCuadrado() {
        assert lado >=0;
        double areaCuadrado = lado*lado;
        return areaCuadrado;
    }

    public double calcularValorZonaCirular() {
        double valorMetroCuadrado = material.getValorMetroCuadrado();
        double area = areaCirculo;
        return area * valorMetroCuadrado;
    }
    public double calcularValorZonaRectangular() {
        double valorMetroCuadrado = material.getValorMetroCuadrado();
        double area = areaCirculo;
        return area * valorMetroCuadrado;
    }
    public double calcularValorZonaTriangular() {
        double valorMetroCuadrado = material.getValorMetroCuadrado();
        double area = areaCirculo;
        return area * valorMetroCuadrado;
    }
    public double calcularValorZonaCuadrangularular() {
        double valorMetroCuadrado = material.getValorMetroCuadrado();
        double area = areaCuadrado;
        return area * valorMetroCuadrado;
    }
    public String getNombreFigura() {
        return nombreFigura;
    }

    public double getAreaCuadrado() {
        return areaCuadrado;
    }

    public double getAreaRectangulo() {
        return areaRectangulo;
    }

    public double getAreaTrianguloRectangulo() {
        return areaTrianguloRectangulo;
    }

    public Material getMaterial() {
        return material;
    }

    public double getAreaCirculo() {
        return areaCirculo;
    }
}
