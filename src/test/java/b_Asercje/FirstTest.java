package b_Asercje;

import a_Zadania.a_Dzien_1.b_Asercje.First;
import org.junit.Assert;
import org.junit.Test;

public class FirstTest {

    First first = new First();

    @Test
    public void testConcatString(){
        String a = "abc";
        String b = "def";
        Assert.assertEquals("abcdef",first.concatString(a,b));
    }

    @Test
    public void testMultiply(){
        int a = 5;
        int b = 9;
        Assert.assertEquals(45,first.multiply(a,b));
    }

}
