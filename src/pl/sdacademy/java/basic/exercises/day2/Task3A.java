package pl.sdacademy.java.basic.exercises.day2;

public class Task3A {
    public static void main(String[] args) {
//        String input = "ala ma kota";
        String input = null;
        String word = "ma";
        System.out.println(getIndex(input, word));
    }

    private static int getIndex(String input, String word) {
        return (input != null && input.contains(word)) ? input.indexOf(word) : -1;  // trojargumentowy
    }
}
