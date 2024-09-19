package org.example;

import java.util.Arrays;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        @SuppressWarnings("InstantiationOfUtilityClass") ArraysWork m = new ArraysWork();
        int[] myArray = new int[10];
        ArraysWork.fillRandomNum(myArray);
        out.println(Arrays.toString(myArray));
        out.println("Min = " + ArraysWork.minValue(myArray));

    }
}