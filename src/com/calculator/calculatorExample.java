package com.calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static com.calculator.calculatorProcessControl.calculateAndReturn;

public class calculatorExample {
    public static void main(String[] args)
    {

        boolean yesOrNo;

        yesOrNo = mainMethod();

        while (yesOrNo == true) {

            yesOrNo = mainMethod();

        }

    }

    public static BufferedReader returnReader() {

        return new BufferedReader(
                new InputStreamReader(System.in));
    }

    public static boolean mainMethod() {

        try {
            System.out.println("enter a number\n");

            // Enter data using BufferReader
            BufferedReader reader = returnReader();

            // Reading data using readLine
            String input = reader.readLine();

            int number = Integer.parseInt(input);

            System.out.println("entered number is " + input);

            System.out.println("choose process type");

            // Enter data using BufferReader
            BufferedReader reader2 = returnReader();

            // Reading data using readLine
            String processType = reader2.readLine();
            if (!processType.equals("+") && !processType.equals("-") && !processType.equals("*") && !processType.equals("/")) {

                throw new NumberFormatException("you entered wrong process type");
            }

            System.out.println("enter another number\n");

            // Enter data using BufferReader
            BufferedReader reader3 = returnReader();

            // Reading data using readLine
            String input2 = reader3.readLine();

            int number2 = Integer.parseInt(input2);

            System.out.println("entered number is " + input2);

            System.out.println("enter a number\n");

            String result = calculateAndReturn(number, number2, processType);

            System.out.println("result is " + result);

            System.out.println("Do you want to calculate again ? (y/n): ");

            BufferedReader reader4 = returnReader();

            String newProcess = reader4.readLine();

            if (newProcess.equals("y")) {

                return true;
            }else {

                return false;
            }



        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }

    }

}




