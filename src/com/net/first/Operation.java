package com.net.first;

/**
 * Created by daidaijie on 2016/1/23.
 */
public class Operation {
    public static double getResult(double numberA, double numberB, String operate) {
        double result = 0d;
        switch (operate) {
            case "+":
                result = numberA + numberB;
                break;
            case "-":
                result = numberA - numberB;
                break;
            case "*":
                result = numberA * numberB;
                break;
            case "/":
                result = numberA / numberB;
                break;
        }

        return result;
    }
}
