package co.edu.uniquindio.poo;

public class Cuadrado extends Rectangulo {
    private double lado;

    public Cuadrado(String nombre, double lado) {
        super(nombre, lado, lado);
        this.lado = lado;
    }

    public double calcularAreaCuadrado() {
        assert lado >=0;
        return lado * lado;
    }

    @Override
    public double CalcularArea() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'CalcularArea'");
    }

}
