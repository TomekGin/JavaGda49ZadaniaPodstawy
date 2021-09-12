package pl.sdacademy.java.basic.exercises.day2;

public class Task3 {
    public static void main(String[] args) {
        String input = "Ala ma kota";
        String word = "ma";

        if (input.contains(word)) {
            int position = input.indexOf(word);
            System.out.println(position);
        } else {
            int end = -1;
            System.out.println(end);
        }

    }
}
