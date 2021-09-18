package pl.sdacademy.java.basic.exercises.day3.task1;

import pl.sdacademy.java.basic.exercises.day3.task1.Cat;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Mruczek");
        cat1.print();
        cat1.makeSound();
        cat1.eatMice(6);

        System.out.println();

        Cat cat2 = new Cat("Filemon");
        cat2.print();
        cat2.makeSound();
        cat2.eatMice(12);

        System.out.println();

        Cat cat3 = new Cat("Bonifacy");
        cat3.print();
        cat3.makeSound();
        cat3.eatMice(20);

        System.out.println();

        cat1.setName("Rudy");
        System.out.println("Nowe imię dla cat1: " + cat1.getName());

        Cat[] cats = {cat1, cat2, cat3};


    }
}
