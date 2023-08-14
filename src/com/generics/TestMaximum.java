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

    public static void maximumOfThreeFloats(Float a, Float b, Float c) {

        Float maximum = a;
        if (b.compareTo(maximum) > 0)
            maximum = b;
        if (c.compareTo(maximum) > 0)
            maximum = c;
        System.out.println(maximum+ " is the Maximum of Three Floats");
    }

    public static void maximumOfThreeStrings(String a, String b, String c) {

        String maximum = a;
        if (b.compareTo(maximum) > 0)
            maximum = b;
        if (c.compareTo(maximum) > 0)
            maximum = c;
        System.out.println(maximum+ " is the Maximum of Three Strings");
    }

    public static void main(String[] args) {
        //Maximum of Three Integers :
        //TC1.1:
        maximumOfThreeIntegers(60,30,50);
        //TC1.2
        maximumOfThreeIntegers(50,80,30);
        //TC1.3
        maximumOfThreeIntegers(50,60,90);
        System.out.println("-------------------------------------");
        //Maximum of Three Floats :
        //TC2.1:
        maximumOfThreeFloats(25.23f,18.23f,15.79f);
        //TC2.2
        maximumOfThreeFloats(25.23f,32.23f,15.79f);
        //TC2.3
        maximumOfThreeFloats(25.23f,18.23f,38.21f);
        System.out.println("-------------------------------------");
        //Maximum of Three Strings :
        //TC3.1:
        maximumOfThreeStrings("Orange","Apple","Grape");
        //TC3.2
        maximumOfThreeStrings("Peach","Pineapple","Grape");
        //TC3.3
        maximumOfThreeStrings("Guava","Apple","Peach");
    }


}
