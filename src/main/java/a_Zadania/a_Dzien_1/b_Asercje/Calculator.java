package a_Zadania.a_Dzien_1.b_Asercje;

import java.util.Arrays;

public class Calculator {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static float devide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("B can not be smaller than 0");
        }
        return (float) a / (float) b;
    }

    public static boolean compare(int a,int b){
        return a>b;
    }

    public int eval(String expresion) {
        int sum = 0;
        String[] tokens = expresion.split("\\+");
        for (String token : tokens) {
            sum += Integer.parseInt(token);
        }
        return sum;
    }
}
