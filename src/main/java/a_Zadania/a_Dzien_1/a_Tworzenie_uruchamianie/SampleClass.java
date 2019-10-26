package a_Zadania.a_Dzien_1.a_Tworzenie_uruchamianie;


public class SampleClass {

    private boolean sampleBoolean;

    public static String firstHalf(String testString) {
        return testString.substring(0, testString.length() / 2);
    }

    public boolean isSampleBoolean() {
        return sampleBoolean;
    }

    public void setSampleBoolean(boolean sampleBoolean) {
        this.sampleBoolean = sampleBoolean;
    }
}
