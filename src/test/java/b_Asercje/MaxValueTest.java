package b_Asercje;

import a_Zadania.a_Dzien_1.b_Asercje.MaxValue;
import org.junit.Assert;
import org.junit.Test;

public class MaxValueTest {

    @Test(expected = RuntimeException.class)
    public void shouldThoughtExceptionOnEmptyArray(){
        MaxValue.largest(null);
    }

    @Test()
    public void shouldReturnLargestElement(){
        int[] testArrayA = {1,2,3,4,5,6};
        Assert.assertEquals(6,MaxValue.largest(testArrayA));
        int[] testArrayB = {1};
        Assert.assertEquals(1,MaxValue.largest(testArrayB));
        int[] testArrayC = {9,8,2,-1};
        Assert.assertEquals(9,MaxValue.largest(testArrayC));
    }

}
