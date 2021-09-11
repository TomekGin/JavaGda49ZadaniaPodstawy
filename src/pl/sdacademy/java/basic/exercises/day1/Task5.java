package pl.sdacademy.java.basic.exercises.day1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please insert first digit: ");
        int firstDigit = scanner.nextInt();
        System.out.println("Please insert second digit: ");
        int secondDigit = scanner.nextInt();

        whileLoop(firstDigit, secondDigit);
        doWhileLoop(firstDigit, secondDigit);

//        sum();
    }

    private static void whileLoop(int firstDigit, int secondDigit) {
        int result = 0;
        while (firstDigit <= secondDigit) {
            result += firstDigit++;
            //firstDigit++;
        }
        System.out.println(result);
    }

    private static void doWhileLoop(int firstDigit, int secondDigit) {
        int result = 0;
        do {
            result += firstDigit;
            firstDigit++;
        }
        while (firstDigit <= secondDigit);
        System.out.println(result);
    }

    private static void sum() {
        int x = 2;
        int y = 5;
            for (x=0; x<=y; x++) {
                int suma = x++;
                System.out.println(suma);
            }
        }
}
