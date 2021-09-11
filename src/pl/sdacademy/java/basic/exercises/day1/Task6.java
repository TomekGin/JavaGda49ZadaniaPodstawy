package pl.sdacademy.java.basic.exercises.day1;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
//        printMultiplicationTable();
//        printModifiedMultiplicationTable();
        printMultiplicationTableNew(6,2,5);
    }

    private static void printMultiplicationTable() {
        int firstDigit = 1;
        int secondDigit = 5;
        while (firstDigit < secondDigit) {
            System.out.println(secondDigit + " x " + firstDigit + " = " + firstDigit * secondDigit);
            firstDigit++;
        }
    }

    private static void printModifiedMultiplicationTable() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please insert MIN multiplicand: ");
        int minMultiplicand = scanner.nextInt();
        System.out.print("Please insert MAX multiplicand: ");
        int maxMultiplicand = scanner.nextInt();

        while (minMultiplicand < maxMultiplicand) {
            System.out.println(maxMultiplicand + " x " + minMultiplicand + " = " + minMultiplicand * maxMultiplicand);
            minMultiplicand++;
        }
    }

    private static void printMultiplicationTableNew(int multiplier, int minMultiplicand, int maxMultiplicand) {
        while (minMultiplicand <= maxMultiplicand) {
            int result = multiplier * minMultiplicand;
            System.out.println(multiplier + " * " + minMultiplicand + " = " + result);
            minMultiplicand++;
        }
    }

    }
