package pl.sdacademy.java.basic.exercises.day2;

public class Main {
    public static void main(String[] args) {
        String str = "ala";
        str.toUpperCase();
        System.out.println(str);
        str = str.toUpperCase();
        System.out.println(str);
        str += "kot";
        System.out.println(str);

        StringBuilder str2 = new StringBuilder("kot");
        System.out.println(str2);
        str2.append("kot2").append("kot3");
        System.out.println(str2);
    }
}
