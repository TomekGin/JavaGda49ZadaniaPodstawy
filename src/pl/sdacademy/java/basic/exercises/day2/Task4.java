package pl.sdacademy.java.basic.exercises.day2;

public class Task4 {
    public static void main(String[] args) {
        System.out.println(replaceFunction("Ala ma, kota. a kot, ma Ale"));
    }

    private static String replaceFunction(String text) {
        return text = text.replace(",", "-STOP-").replace(".","-STOP-");
    }

}
