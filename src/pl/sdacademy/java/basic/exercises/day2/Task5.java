package pl.sdacademy.java.basic.exercises.day2;

public class Task5 {
    public static void main(String[] args) {
        availabilityCounter("Ala ma kota.", 'a');
    }

    private static int availabilityCounter(String input, char sign) {
        for (int i=0; i<=input.length(); i++) {
            input.toCharArray().equals(sign);
        }
        return 1;
    }
}
