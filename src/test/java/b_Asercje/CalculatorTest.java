package b_Asercje;

import a_Zadania.a_Dzien_1.b_Asercje.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void addTest(){
        Assert.assertEquals(0,Calculator.add(0,0));
        Assert.assertEquals(-10,Calculator.add(-5,-5));
        Assert.assertEquals(50,Calculator.add(39,11));
    }

    @Test
    public void subtractTest(){
        Assert.assertEquals(0,Calculator.subtract(0,0));
        Assert.assertEquals(4,Calculator.subtract(-2,-6));
        Assert.assertEquals(-10,Calculator.subtract(5,15));
    }

    @Test
    public void multiplyTest(){
        Assert.assertEquals(0,Calculator.multiply(100,0));
        Assert.assertEquals(-10,Calculator.multiply(1,-10));
        Assert.assertEquals(25,Calculator.multiply(5,5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void devideByZeroTest(){
        Calculator.devide(5,0);
    }

    @Test
    public void devideTest(){
        Assert.assertTrue(Calculator.devide(1,2)==0.5);
    }

    @Test
    public void compareTest(){
        Assert.assertTrue(Calculator.compare(6,3));
        Assert.assertFalse(Calculator.compare(1,4));
        Assert.assertFalse(Calculator.compare(1,1));
    }

    @Test
    public void evaluatesExpression() {
        Calculator calculator = new Calculator();
        int sum = calculator.eval("1+2+3");
        Assert.assertEquals(6, sum);
    }
}
