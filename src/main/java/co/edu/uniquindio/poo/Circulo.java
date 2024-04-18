package co.edu.uniquindio.poo;

public class Circulo extends Figura {
    public double radio;
    public String nombre;
    public Material material;
    public double areaCirculo;

    public Circulo(String nombre, double radio) {
        this.nombre= nombre;
        this.radio = radio;

        assert radio >= 0;
        if (radio <= 0) {
            throw new IllegalArgumentException("El radio debe ser un valor positivo");
        }
    }

    public double getRadio() {
        return radio;
    }

    public String getNombre() {
        return nombre;
    }

    public Material getMaterial() {
        return material;
    }

    public double calcularAreaCirculo() {
        areaCirculo = Math.PI * radio*radio;
        return areaCirculo;
        
    }
    public double calcularValor() {
        double valorMetroCuadrado = material.getValorMetroCuadrado();
        double area = calcularAreaCirculo();
        return area * valorMetroCuadrado;
    }
    @Override
    public double CalcularArea() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'CalcularArea'");
    }

}
