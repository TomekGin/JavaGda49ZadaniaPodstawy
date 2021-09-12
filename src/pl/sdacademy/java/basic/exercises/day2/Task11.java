package pl.sdacademy.java.basic.exercises.day2;

public class Task11 {
    public static void main(String[] args) {
        System.out.println(palindroms("kajak"));
        System.out.println(palindroms("SDA"));
    }

    private static boolean palindroms(String word) {
        int wordLength = word.length();
        for (int i = 0; i < wordLength; i++) {
            if (word.charAt(i) == word.charAt(wordLength-i-1))
                return true;
        }
        return true;
    }
}
