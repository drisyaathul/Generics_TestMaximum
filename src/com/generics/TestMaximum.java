package com.generics;

public class TestMaximum {

    public static <T extends Comparable <T>> T maximumOfThreeVariables (T x, T y, T z) {

        T maximum = x;
        if (y.compareTo(maximum) > 0)
            maximum = y;
        if (z.compareTo(maximum) > 0)
            maximum = z;
        return maximum;

    }

    public static void main(String[] args) {

        System.out.println("*** Maximum Of Three Variables ***");
        System.out.println("Maximum of three Integers : "+maximumOfThreeVariables(25,20,18));
        System.out.println("Maximum of three Floats : "+maximumOfThreeVariables(15.5f,30.25f,12.69f));
        System.out.println("Maximum of three Strings : "+maximumOfThreeVariables("Orange","Peach","Apple"));
    }
}
