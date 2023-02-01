package com.pluralsight.organized.conversions;

public class MixedConversions {

    public static void main(String[] args) {

        float floatVal = 1.0f;
        double doubleVal = 4.0d;
        byte byteVal = 7;
        short shortVal = 7;
        long longVal = 5;


        short result1 = byteVal;
        // short result1 = longVal => gives an error at compile time because the program cannot perform a narrowing conversion between short and long
        short result2 = (short) longVal; // The compiler accepts the conversion

        // short result3 = byteVal - longVal; => gives an error because of different data types
        // short result3 = (short) byteVal - longVal => gives an error because the casting is not applied to the whole arithmetic operation
        short result3 = (short) (byteVal - longVal); // => accepted conversion;

        //long result4 = longVal - floatVal => cannot perform operation on long and float at the same time,
        float result4 = longVal - floatVal;

        System.out.println("Success!");

    }
}
