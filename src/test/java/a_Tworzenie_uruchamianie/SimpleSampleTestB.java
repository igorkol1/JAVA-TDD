package a_Tworzenie_uruchamianie;

import a_Zadania.a_Dzien_1.a_Tworzenie_uruchamianie.SampleClass;
import org.junit.Assert;
import org.junit.Test;

public class SimpleSampleTestB {

    @Test
    public void sampleBooleanAtBeggignig(){
        SampleClass simpleClass = new SampleClass();
        Assert.assertFalse(simpleClass.isSampleBoolean());
    }

    @Test
    public void sampleBooleanAfterSet(){
        SampleClass simpleClass = new SampleClass();
        simpleClass.setSampleBoolean(true);
        Assert.assertTrue(simpleClass.isSampleBoolean());
    }

}
