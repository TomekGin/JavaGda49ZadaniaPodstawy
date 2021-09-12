package pl.sdacademy.java.basic.exercises.day2;

public class Task2 {
    public static void main(String[] args) {
        ifInputStartsWithPrefix("programowanie", "pro");
    }

    private static boolean ifInputStartsWithPrefix(String input, String prefix) {
        input.startsWith(prefix);
//        int prefixLength = prefix.length()-1;
//        String inputaPrefix = input.substring(0,prefixLength);
        return true;
    }
}