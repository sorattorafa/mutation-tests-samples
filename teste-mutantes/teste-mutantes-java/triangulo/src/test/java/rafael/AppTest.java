package rafael;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertEquals(App.triangulos(3,4,5), "Três lados diferentes. Triângulo Escaleno\n");
        assertEquals(App.triangulos(1,1,1), "Três lados iguais. Triangulo Equilatero\n");
        assertEquals(App.triangulos(-1,4,4), "Não é um triângulo");
        assertEquals(App.triangulos(3,3,4), "Dois lados iguais. Triangulo Isosceles\n");
    }
}
