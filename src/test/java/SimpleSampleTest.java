import a_Zadania.a_Dzien_1.a_Tworzenie_uruchamianie.SampleClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SimpleSampleTest {


    @Test
    public void simpleStringTest() {
        String testString = "CodersJava";
        String firstHalf = SampleClass.firstHalf(testString);
        assertEquals("Coder", firstHalf);
        assertTrue(firstHalf.startsWith("Code")); }
    @Test
    public void simpleTestList() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        assertEquals(list.size(), 4);
        assertEquals((Integer) 2, list.get(1));
        assertEquals((Integer) 4, list.get(3)); }

}
