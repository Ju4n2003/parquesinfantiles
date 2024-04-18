package co.edu.uniquindio.poo;

public class Cuadrado extends Rectangulo {
    private double lado;
    public double areaCuadrado;
    public Material material;
    public Cuadrado(String nombre, double lado) {
        super(nombre, lado, lado);
        this.lado = lado;
    }

    public double calcularAreaCuadrado() {
        assert lado >=0;
        double areaCuadrado = lado*lado;
        return areaCuadrado;
    }
    public double calcularValorZonaCuadrangularular() {
        double valorMetroCuadrado = material.getValorMetroCuadrado();
        double area = calcularAreaCuadrado();
        return area * valorMetroCuadrado;
    }

    public double getLado() {
        return lado;
    }

    public double getAreaCuadrado() {
        return areaCuadrado;
    }

    public Material getMaterial() {
        return material;
    }

    @Override
    public double CalcularArea() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'CalcularArea'");
    }

}
