import org.example.VelocidadMediaEspanol;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VelocidadMediaEspanolTest {
    @Test
    public void testVelocidadMediaEspañol() {
        VelocidadMediaEspanol velocidadMediaEspanol = new VelocidadMediaEspanol();
        assertEquals(velocidadMediaEspanol.calcularVelocidadMedia(10, 2), 5);
        assertEquals(velocidadMediaEspanol.calcularVelocidadMedia(10, 0), 0);
        assertEquals(velocidadMediaEspanol.calcularVelocidadMedia(0, 2), 0);

    }
}
