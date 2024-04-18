package co.edu.uniquindio.poo;

public class TrianguloRectangulo extends Figura {
    private double base;
    private double altura;
    public double areaTrianguloRectangulo;
    public TrianguloRectangulo(String nombre, double base, double altura) {
        
        this.base = base;
        this.altura = altura;
    }

    public double calcularAreaTrianguloRectangulo() {
        assert base >= 0;
        assert altura >= 0;
        double areaTrianguloRectangulo = (base * altura) / 2;
        return areaTrianguloRectangulo;
    }

    @Override
    public double CalcularArea() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'CalcularArea'");
    }

}
