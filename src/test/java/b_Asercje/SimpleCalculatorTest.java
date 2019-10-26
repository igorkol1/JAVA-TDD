package b_Asercje;

import a_Zadania.a_Dzien_1.b_Asercje.SimpleCalculator;
import org.junit.Assert;
import org.junit.Test;

public class SimpleCalculatorTest {

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhileNotPositive(){
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        simpleCalculator.addPositve(-1,1);
    }

}
