package co.edu.uniquindio.poo;

public class TrianguloRectangulo extends Figura {
    private double base;
    private double altura;

    public TrianguloRectangulo(String nombre, double base, double altura) {
        
        this.base = base;
        this.altura = altura;
    }

    public double calcularAreaTrianguloRectangulo() {
        assert base >= 0;
        assert altura >= 0;
        return (base * altura) / 2;
    }

    @Override
    public double CalcularArea() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'CalcularArea'");
    }

}
