package com.calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class calculatorExample {
    public static void main(String[] args)
    {
        try {
            System.out.println("enter a number\n");

            // Enter data using BufferReader
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(System.in));

            // Reading data using readLine
            String input = reader.readLine();

            int number = Integer.parseInt(input);

            System.out.println("entered number is " + input);

            System.out.println("choose process type");

            // Enter data using BufferReader
            BufferedReader reader2 = new BufferedReader(
                    new InputStreamReader(System.in));

            // Reading data using readLine
            String processType = reader2.readLine();
            if (!processType.equals("+") && !processType.equals("-") && !processType.equals("*") && !processType.equals("/")) {

                throw new NumberFormatException("you entered wrong process type");
            }

            System.out.println("enter another number\n");

            // Enter data using BufferReader
            BufferedReader reader3 = new BufferedReader(
                    new InputStreamReader(System.in));

            // Reading data using readLine
            String input2 = reader3.readLine();

            int number2 = Integer.parseInt(input2);

            System.out.println("entered number is " + input2);

            System.out.println("enter a number\n");

            String result = calculateAndReturn(number, number2, processType);

            System.out.println("result is " + result);

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }


    }

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




