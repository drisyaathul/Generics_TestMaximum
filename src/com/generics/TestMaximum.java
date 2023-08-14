package com.generics;

public class TestMaximum {

    public static void maximumOfThreeIntegers(Integer x, Integer y, Integer z) {

        Integer maximum = x;
        if (y.compareTo(maximum) > 0)
            maximum = y;
        if (z.compareTo(maximum) > 0)
            maximum = z;
        System.out.println(maximum+ " is the Maximum of Three Integers");
    }

    public static void main(String[] args) {
        //TC1.1:
        maximumOfThreeIntegers(60,30,50);
        //TC1.2
        maximumOfThreeIntegers(50,80,30);
        //TC1.3
        maximumOfThreeIntegers(50,60,90);
    }


}
