package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class CuadradoTest {

    @Test
    public void CuadradoLadoPositivo() {
        Cuadrado cuadrado = new Cuadrado("Cuadrado", 10);
        assertEquals(100.0, cuadrado.calcularAreaCuadrado());
    }

    @Test
    public void CuadradoLadoNegativo() {
        Cuadrado cuadrado = new Cuadrado("Cuadrado", -10);
        assertThrows(Throwable.class, () -> cuadrado.calcularAreaCuadrado());
    }
}
