package pl.sdacademy.java.basic.exercises.day2;

public class Task11A {
    public static void main(String[] args) {
        String input = "kayak";
        String result = new StringBuilder(input).reverse().toString();
        System.out.println(input.equals(result));
    }
}
