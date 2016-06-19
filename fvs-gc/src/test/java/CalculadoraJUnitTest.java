
import com.start.fvs.gc.Calculadora;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculadoraJUnitTest {
    
    @Test
    public void CalculadoraJUnitTest() {
        Calculadora c = new Calculadora();
        int a = 5;
        int b = 6;
        int soma = c.soma(a,b);
        Assert.assertEquals(11, soma);
    }
}
