package org.example;

import java.util.Arrays;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        @SuppressWarnings("InstantiationOfUtilityClass") ArraysWork m = new ArraysWork();

        //Create an integer array len n
        int[] myArray = ArraysWork.createArray(50);

        //Filling th array by random numbers
        ArraysWork.fillRandomNum(myArray);
        out.println(Arrays.toString(myArray));

        //Finding of the minimal value into array
        out.println("Min = " + ArraysWork.minValue(myArray));

    }
}