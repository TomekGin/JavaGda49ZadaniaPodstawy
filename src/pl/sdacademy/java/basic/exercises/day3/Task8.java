package pl.sdacademy.java.basic.exercises.day3;

import java.util.regex.Pattern;

public class Task8 {
    public static void main(String[] args) {
        String correctNumber = "-1234,1234";
        String inCorrectNumber = ",34";
        System.out.println(correctNumber + " " + isCorrectNumberFormat(correctNumber));
        System.out.println(inCorrectNumber + " " + isCorrectNumberFormat(inCorrectNumber));
    }

    private static boolean isCorrectNumberFormat(String number) {
//        String regex = "[-]?[0-9]+[,]?[0-9]*";
        String regex = "-?\\d+(,\\d+)?";
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(number).matches();
    }
}