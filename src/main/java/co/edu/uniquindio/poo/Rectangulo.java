package co.edu.uniquindio.poo;

public class Rectangulo extends Figura {
    public double lado;
    public double alto;
    public double areaRectangulo;
    public Material material;
    public Rectangulo(String nombre, double lado, double alto) {
        
        this.lado = lado;
        this.alto = alto;
    }

    public double getLado() {
        return lado;
    }

    public double getAlto() {
        return alto;
    }

    public double getAreaRectangulo() {
        return areaRectangulo;
    }

    public double calcularAreaRectangulo() {
        assert lado >= 0;
        assert alto >= 0;
        double areaRectangulo = lado*alto;
        return areaRectangulo;
    }
    public double calcularValorZonaRectangular() {
        double valorMetroCuadrado = material.getValorMetroCuadrado();
        double area = calcularAreaRectangulo();
        double valor = (area * valorMetroCuadrado);
        return valor;
    }
    public Material getMaterial(){

        return material;
    }

    @Override
    public double CalcularArea() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'CalcularArea'");
    }
}