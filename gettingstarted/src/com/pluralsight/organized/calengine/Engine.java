package com.pluralsight.organized.calengine;

import java.util.Arrays;

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
        } else if(args.length == 3) {
            handleCommandLine(args);
        }
        else {
            System.out.println("Please provide an operation and 2 numeric values");
        }
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
}
