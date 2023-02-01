package com.pluralsight.organized.datatypes;

public class OperatorsPrecedence {

    public static void main(String[] args) {

        int a = 21;
        int b = 6;
        int c = 3;
        int d = 1;

        int result1 = a - b / c;
        int result2 = (a-b) / c;

        System.out.println(result1);
        System.out.println(result2);

        int result3 = a / c * d + b;
        int result4 = a / (c * (d + b));

        System.out.println(result3);
        System.out.println(result4);

    }
}
