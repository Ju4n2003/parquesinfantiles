package co.edu.uniquindio.poo;

public class Circulo extends Figura {
    private double radio;

    public Circulo(String nombre, double radio) {
        
        this.radio = radio;
        assert radio >= 0;
        if (radio <= 0) {
            throw new IllegalArgumentException("El radio debe ser un valor positivo");
        }
    }

    public double calcularAreaCiculo() {
        return Math.PI * radio*radio;
    
    }

    @Override
    public double CalcularArea() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'CalcularArea'");
    }

}
