package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class RectanguloTest {

    @Test
    public void RectanguloAnchoAltoPositivos() {
        Rectangulo rectangulo = new Rectangulo("Rectangulo", 10, 20);
        assertEquals(200.0, rectangulo.calcularAreaRectangulo());
    }

    @Test
    public void RectanguloAnchoNegativoAltoPositivo() {
        Rectangulo rectangulo = new Rectangulo("Rectangulo", -10, 20);

        assertThrows(Throwable.class, () -> rectangulo.calcularAreaRectangulo());
    }

    public void RectanguloAnchoPositivoAltoNegatitivo() {
        Rectangulo rectangulo = new Rectangulo("Rectangulo", 10, -20);

        assertThrows(Throwable.class, () -> rectangulo.calcularAreaRectangulo());

    }
}
