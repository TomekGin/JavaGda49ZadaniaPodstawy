package pl.sdacademy.java.basic.exercises.day2;

public class Task15 {
    public static void main(String[] args) {
        String[] firstArray = {"Ala", "ma", "kota"};
        String[] secondArray = {"Ala", "ma", "kotaa"};
        System.out.println(compareArrays(firstArray, secondArray));
    }

    private static boolean compareArrays(String[] firstArray, String[] secondArray) {
        if (firstArray.length == secondArray.length) {
            for (int i = 0, j = 0; i < firstArray.length; i++, j++) {
                if (firstArray[i] != secondArray[j]) {
                    return false;
                }
            }
        return true;
        }
        return false;
    }
}
