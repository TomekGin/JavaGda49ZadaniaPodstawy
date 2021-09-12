package pl.sdacademy.java.basic.exercises.day2;

public class Task1 {
    public static void main(String[] args) {
        lastCharacterOfWord("DOMEK");
        lastCharacterOfWord("ala");
        lastCharacterOfWord(" ");
        lastCharacterOfWord("");
        lastCharacterOfWord(null);
        System.out.println("END");
    }

    private static void lastCharacterOfWord(String word) {
        String blank = "";
        if (word == null || blank.equals(word)) {
            System.out.println("Wprowadź wartość");
        } else {
            int lengthOfWord = word.length();
            char lastChar = word.charAt(lengthOfWord - 1);
            System.out.println(lastChar);
        }
    }

}
