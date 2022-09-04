package com.calculator;

public class calculatorProcessControl {

    public static String calculateAndReturn(int number, int number2, String processType) {

        String result = null;

        if (processType.equals("+")) {
            result = String.valueOf(number + number2);
        } else if (processType.equals("*")) {
            result = String.valueOf(number * number2);
        } else if (processType.equals("/")) {
            result = String.valueOf(number / number2);
        } else if (processType.equals("-")) {
            result = String.valueOf(number - number2);
        }

        return result;
    }
}
