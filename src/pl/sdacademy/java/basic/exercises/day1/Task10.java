package pl.sdacademy.java.basic.exercises.day1;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
//        numbCalculator(125);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert digit: ");
        int number = scanner.nextInt();

        System.out.println(sumOfDigits(number));
    }

    private static int sumOfDigits(int number) {
        if (number <= 9) {
            return number;
        }

        int sum = 0;
        do {
            sum += number % 10;
            number /= 10;
        } while (number != 0);
        return 0;
    }

    private static void numbCalculator(int digit) {
        int rest1 = digit % 10;
        System.out.print(rest1);
        int rest10 = ((digit - rest1) / 10) % 10;
        System.out.print(" * " + rest10);
        int rest100 = ((digit - rest10 - rest1) / 100) % 2;
        System.out.println(" * " + rest100);
    }

}