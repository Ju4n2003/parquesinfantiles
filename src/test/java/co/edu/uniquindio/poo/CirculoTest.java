package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class CirculoTest {

    @Test
    public void radioPositivo() {
        Circulo circulo = new Circulo("circulo", 10);
        assertEquals(314.1592653589793, circulo.calcularAreaCiculo());
    }

    @Test
    public void radioNegativo() {
        assertThrows(Throwable.class, () -> new Circulo("Circulo", -10));
    }
}
