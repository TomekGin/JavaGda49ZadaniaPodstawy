package pl.sdacademy.java.basic.exercises.day2;

import java.util.Arrays;

public class Task13A {
    public static void main(String[] args) {
        int[] inputs = {12, 7, 19};
        System.out.println(getMinValue(inputs));
        System.out.println(getMaxValue(inputs));
        System.out.println(sum(inputs));
    }

    private static int getMinValue(int[] inputs) {
        int minValue = inputs[0];
        for (int i : inputs) {
            if (i < minValue) {
                minValue = i;
            }
        }
        return minValue;
    }

    private static int getMaxValue(int[] inputs) {
        int maxValue = inputs[0];
        for (int i : inputs) {
            if (i > maxValue) {
                maxValue = i;
            }
        }
        return maxValue;
    }

    private static int sum(int[] inputs) {
        int sum = 0;
        for (int i : inputs) {
            sum += i;
        }
        return sum;
    }

}
