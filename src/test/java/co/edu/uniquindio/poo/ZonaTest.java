package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ZonaTest {
    
    @Test
    public void ValorZonaCircularArena(){
        Circulo circulo = new Circulo("Circulo", 10);
        Zona zona1 = new Zona("Zona 1", Material.ARENA);

        assertEquals(zona1.calcularValorZonaCirular(),circulo.calcularAreaCirculo(), 3141592.65);
    }
    @Test
    public void ValorZonaRectangularGramaSintetica(){
        Rectangulo rectangulo = new Rectangulo("Rectangulo", 10, 20);
        Zona zona1 = new Zona("Zona 1", Material.GRAMA_SINTETICA);

        assertEquals(zona1.calcularValorZonaRectangular(),rectangulo.calcularAreaRectangulo(), 7000000.0);
    }
    @Test
    public void ValorZonaCuadradaGramaNatural(){
        Cuadrado cuadrado = new Cuadrado("Cuadrado", 10);
        Zona zona1 = new Zona("Zona 1", Material.GRAMA_NATURAL);

        assertEquals(zona1.calcularValorZonaCuadrangularular(),cuadrado.calcularAreaCuadrado(), 2000000.0);
    }
}
