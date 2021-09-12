package pl.sdacademy.java.basic.exercises.day2;

import java.sql.Array;
import java.util.Arrays;

public class Task13 {
    public static void main(String[] args) {
        int[] array;
        array = new int[3];
        array[0] = 12;
        array[1] = 7;
        array[2] = 19;

        System.out.println("MIN: " + Arrays.stream(array).min());
        System.out.println("MAX: " + Arrays.stream(array).max());
        System.out.println(Arrays.stream(array).sum());
    }
}
