package com.generics;

import java.util.ArrayList;
import java.util.List;

public class TestMaximum <T extends  Comparable<T>> {

    T x,y,z;

    public TestMaximum(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static <T extends Comparable <T>> T maximumOfThreeVariables (T... x) {

        T maximum = x[0];
        List<T> variableArray = new ArrayList<>();
        for (T element : x) {
            variableArray.add(element);
            if (element.compareTo(maximum) > 0) {
                maximum = element;
            }
        }
        return maximum;
    }

    public static void main(String[] args) {

        System.out.println("*** Maximum Of Three Variables ***");
        System.out.println("Maximum of three Integers : "+maximumOfThreeVariables(25,20,18,55,12));
        System.out.println("Maximum of three Floats : "+maximumOfThreeVariables(15.5f,30.25f,12.69f,32.89f,21.78f));
        System.out.println("Maximum of three Strings : "+maximumOfThreeVariables("Orange","Peach","Apple","Grape","Plum"));
    }
}
