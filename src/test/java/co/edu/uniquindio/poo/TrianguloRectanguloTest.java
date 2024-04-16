package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class TrianguloRectanguloTest {

    @Test
    public void TrianguloRectanguloBasePositivaAlturaPositiva() {
        TrianguloRectangulo trianguloRectangulo = new TrianguloRectangulo("TrianguloRectangulo", 10, 20);
        assertEquals(100.0, trianguloRectangulo.calcularAreaTrianguloRectangulo());
    }

    @Test
    public void TrianguloRectanguloBaseNegaitivaAlturaPositiva() {
        TrianguloRectangulo trianguloRectangulo = new TrianguloRectangulo("TrianguloRectangulo", -10, 20);
        assertThrows(Throwable.class, () -> trianguloRectangulo.calcularAreaTrianguloRectangulo());
    }

    @Test
    public void TrianguloRectanguloBasePositivaAlturaNegativa() {
        TrianguloRectangulo trianguloRectangulo = new TrianguloRectangulo("TrianguloRectangulo", 10, -20);
        assertThrows(Throwable.class, () -> trianguloRectangulo.calcularAreaTrianguloRectangulo());
    }
}
