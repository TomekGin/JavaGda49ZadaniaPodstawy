package pl.sdacademy.java.basic.exercises.day2;

public class Task5B {
    public static void main(String[] args) {
        System.out.println(countCharInStringV2("Ala ma kota", 'a'));
        System.out.println(countCharInStringV2("", 'a'));
        System.out.println(countCharInStringV2(" ", 'a'));
//        System.out.println(countCharInStringV2(null, 'a'));
    }

    private static int countCharInStringV2(String input, char sign) {
        int counter = 0;
        char[] letters = input.toCharArray();
        for (char c : letters) {
            if (c == sign) {
                counter++;
            }
        }
        return counter;
    }
}
