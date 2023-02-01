package com.pluralsight.organized.calengine;

public class Engine {

    public static void main(String[] args) {

        double value1 = 100.00;
        double value2 = 50.00;
        double result = 0.0d;
        char opCode = 'm';

        if(opCode == 'a')
            result = value1 + value2;
        else if (opCode == 's')
            result = value1 - value2;
        else if (opCode == 'm')
            result = value1 * value2;
        else if (opCode == 'd')
            result = value1 / value2;
        else
            result = 0.0d;

        System.out.println(result);
    }
}
