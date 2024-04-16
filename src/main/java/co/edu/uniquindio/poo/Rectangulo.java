package co.edu.uniquindio.poo;

public class Rectangulo extends Figura {
    public double lado;
    public double alto;

    public Rectangulo(String nombre, double lado, double alto) {
        
        this.lado = lado;
        this.alto = alto;
    }

    public double calcularAreaRectangulo() {
        assert lado >= 0;
        assert alto >= 0;
        return lado * alto;
    }

    @Override
    public double CalcularArea() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'CalcularArea'");
    }
}