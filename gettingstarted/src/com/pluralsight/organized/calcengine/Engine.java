package com.pluralsight.organized.calcengine;

import java.util.Scanner;

public class Engine {

    public static void main(String[] args) {

        double [] leftVals = {100.0,25.0,225.0,11.d};
        double [] rightVals = {50.0,92.0,17.0,3.0};
        char [] opCodes = {'d','a','s','m'};
        double [] results = new double[opCodes.length];


        if(args.length == 0) {

            for (int i = 0; i < opCodes.length; i++) {
                results[i] = execute(opCodes[i], leftVals[i], rightVals[i]);
            }

            for (double value : results) {
                System.out.println(value);
            }

        } else if (args.length == 1 && args[0].equals("interactive")){
            executeInteractively();
        }
        else if(args.length == 3) {
            handleCommandLine(args);
        }
        else {
            System.out.println("Please provide an operation and 2 numeric values");
        }
    }

    public static void executeInteractively() {
        System.out.println("Enter an operation and two numbers");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String [] parts = userInput.split(" ");
        performOperation(parts);
        
    }

    private static void performOperation(String[] parts) {
        char opCode = opCodeFromString(parts[0]);
        double leftVal = valueFromWord(parts[1]);
        double rightVal = valueFromWord(parts[2]);
        double result = execute(opCode,leftVal,rightVal);
        displayResult(opCode,leftVal,rightVal,result);
    }

    private static void displayResult(char opCode, double leftVal, double rightVal,  double result) {
        char symbol = symbolFromOpCode(opCode);
        StringBuilder builder = new StringBuilder(20);
        builder.append(leftVal);
        builder.append(" ");
        builder.append(symbol);
        builder.append(" ");
        builder.append(rightVal);
        builder.append(" = ");
        builder.append(result);
        System.out.println(builder.toString());
    }

    private static void handleCommandLine(String[] args) {
        char opCode = args[0].charAt(0);
        double leftVal = Double.parseDouble(args[1]);
        double rightVal = Double.parseDouble(args[2]);
        double result = execute(opCode,leftVal,rightVal);
        System.out.println(result);
    }


    public static double execute(char opCode, double leftVal, double rightVal) {
        double result;
        switch (opCode) {
            case 'a':
                result = leftVal + rightVal;
                break;
            case 's':
                result = leftVal - rightVal;
                break;
            case 'm':
                result = leftVal * rightVal;
                break;
            case 'd':
                result = leftVal / rightVal;
                break;
            default:
                System.out.println("Invalid opCode: " + opCode);
                result = 0.0;
        }
        return result;
    }

    public static char symbolFromOpCode (char opCode) {
        char [] opCodes = {'a','s','m','d'};
        char [] symbols = {'+','-','*','/'};
        char symbol = ' ';
        for (int index = 0; index < opCodes.length; index++) {
            if (opCode == opCodes[index]) {
                symbol = symbols[index];
                break;
            }
        }
        return symbol;
    }

    public static char opCodeFromString(String operationName) {
        char opCode = operationName.charAt(0);
        return opCode;
    }

    public static double valueFromWord(String word) {
        String [] numberWords = { "zero","one","two","three","four","five","six","seven","eight","nine"};
        double value = 0d;
        for(int index = 0; index < numberWords.length; index++) {
            if(word.equals(numberWords[index])) {
                value = index;
                break;
            }
        }
        return value;
    }

}
