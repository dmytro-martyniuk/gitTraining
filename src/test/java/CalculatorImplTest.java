import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class CalculatorImplTest {

    private Calculator calc;

    @Test
    public void addTest() {
        calc = new CalculatorImpl();

        int suma = calc.suma(5, 3);

        assertThat(suma, equalTo(8));
    }
}