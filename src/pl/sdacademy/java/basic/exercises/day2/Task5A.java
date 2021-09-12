package pl.sdacademy.java.basic.exercises.day2;

public class Task5A {
    public static void main(String[] args) {
        System.out.println(countCharInString("Ala ma kota", 'a'));
        System.out.println(countCharInString("", 'a'));
        System.out.println(countCharInString(" ", 'a'));
        System.out.println(countCharInString(null, 'a'));
    }

    private static int countCharInString(String input, char sign) {
        int counter = 0;
        if (input != null && !input.isBlank()) {
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == sign) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
