package pl.sdacademy.java.basic.exercises.day2;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        System.out.println(scan());
    }


    private static int[] scan() {
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Podaj liczbę: ");
            int number = scanner.nextInt();
            array[i] = number;
        }
        return array;
    }
}
