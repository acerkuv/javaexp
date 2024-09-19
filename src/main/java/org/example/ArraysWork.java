package org.example;

import org.jetbrains.annotations.Contract;

import java.util.Random;

public class ArraysWork {
    static Random random = new Random();
    @Contract("_ -> param1")
    public static int[] fillRandomNum(int[] val){
        for (int i = 0; i < val.length; i++) {
            val[i] = randInt(-10, 10);
        }
        return val;
    }
    public static int randInt(int min, int max){
        return random.nextInt(max + 1 - min) + min;
    }
    public static int minValue(int[] val){
        int min = 0;
        for (int t : val) {
            if (t < min) min = t;
        }
        return min;
    }
}
