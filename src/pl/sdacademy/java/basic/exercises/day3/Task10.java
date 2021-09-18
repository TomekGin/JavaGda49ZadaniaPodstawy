package pl.sdacademy.java.basic.exercises.day3;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("To start timing press ENTER");
        scanner.nextLine();
        LocalDateTime startTime = LocalDateTime.now();

        System.out.print("To stop timing press ENTER");
        scanner.nextLine();
        LocalDateTime endTime = LocalDateTime.now();

        Duration totalTime = Duration.between(startTime,endTime);
        System.out.print("Total time: " + totalTime.getSeconds() + " s");
    }
}
