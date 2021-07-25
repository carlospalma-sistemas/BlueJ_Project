import junit.framework.*;
import org.junit.Test;

public class Tests
{
    @Test
    public void testCrearCurso() {
        Curso c = new Curso();
        c.setNota(3.5, 0);
        c.setNota(4.4, 1);
        c.setNota(5.0, 2);
        double expected = 4.36666;
        double actual = c.getNotaFinal();
        Assert.assertEquals("Promedio está errado.", expected, actual, 0.01);
    }
}
