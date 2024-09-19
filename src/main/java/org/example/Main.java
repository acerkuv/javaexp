package org.example;

import java.util.Arrays;

import static java.lang.System.*;
import static org.example.ArraysWork.fillRandomNum;

public class Main {
    public static void main(String[] args) {

        //Create an integer array len n
        int[] myArray = ArraysWork.createArray(50);

        //Filling th array by random numbers
        fillRandomNum(myArray);
        out.println(Arrays.toString(myArray));

        //Finding of the minimal value into array
        out.println("Min = " + ArraysWork.minValue(myArray));

    }
}