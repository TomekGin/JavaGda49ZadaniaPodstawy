package pl.sdacademy.java.basic.exercises.day2;

public class Task14A {
    public static void main(String[] args) {
        int[] inputs = {12, -7, 19, -5};
        int lengthOfNegativeArray = countNegativeValuesInArray(inputs);
        if (lengthOfNegativeArray > 0) {
            int[] result = createArrayWithNegativeValues(inputs, lengthOfNegativeArray);
        }
    }

    private static int countNegativeValuesInArray(int[] inputs) {
        int counter = 0;
        for (int i : inputs) {
            if (i < 0) {
                counter++;
            }
        }
        return counter;
    }

    private static int[] createArrayWithNegativeValues(int[] inputs, int lengthOfNegativeArray) {
        int[] result = new int[lengthOfNegativeArray];
        for (int i = 0, j = 0; i < inputs.length; i++) {
            if (inputs[i] < 0) {
                result[j++] = inputs[i];
            }
        }
        return result;
    }
}