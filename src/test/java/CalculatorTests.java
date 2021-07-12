import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTests {

    Calculator calculator;

    @Before
    public void before() { calculator = new Calculator(3, 5);}

    @Test
    public void hasNumber1() {
        assertEquals(3, calculator.getNum1(), 0.0);
    }

    @Test
    public void hasNumber2(){
        assertEquals(5, calculator.getNum2(), 0.0);
    }

    @Test
    public void canAdd(){
        assertEquals(8.0, calculator.add(), 0.0);
    }

    @Test
    public void canSubtract(){
        assertEquals(-2, calculator.subtract(), 0.0);
    }

    @Test
    public void canMultiply(){
        assertEquals(15, calculator.multiply(), 0.0);
    }

    @Test
    public void canDivide(){
        assertEquals(0.66, calculator.divide(), 0.1);
    }

}
