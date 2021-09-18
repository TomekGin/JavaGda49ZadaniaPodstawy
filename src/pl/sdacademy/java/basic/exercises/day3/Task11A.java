package pl.sdacademy.java.basic.exercises.day3;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Task11A {
    public static void main(String[] args) {
        //2021-09-19 09:00:00
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert date [in format [yyyy-MM-dd HH:mm:ss]:");
        String input = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime nextLesson = LocalDateTime.parse(input, formatter);
        LocalDateTime now = LocalDateTime.now();

        long days = Duration.between(now, nextLesson).toDays()+1; // +1
        System.out.println("You have " + days + " days to the next lesson.");
    }
}
