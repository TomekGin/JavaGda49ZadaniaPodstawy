package pl.sdacademy.java.basic.exercises.day2;

import java.nio.file.LinkPermission;

public class Task14 {
    public static void main(String[] args) {
        int[] inputs = {12, -7, 19, -5};
        System.out.println(negativesCounter(inputs));
//        getNegative(inputs);
    }

    private static int negativesCounter(int[] inputs) {
        int counter = 0;
        for (int i = 0; i < inputs.length; i++) {
            if (inputs[i] < 0) {
                counter++;
            }
        }
        return counter;
    }


//    private static int getNegative(int[] inputs) {
//        int[] negativeInputs;
//        for (int i = 0; i < inputs.length; i++) {
//            negativeInputs
//        }
//    }
}
