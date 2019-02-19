package klinika;

import java.util.Scanner;

public class Cat implements Pet {
    Scanner scanner = new Scanner(System.in);
    private String firstName ;
    private double age = 0;
    private String owner;

    public Cat(String firstName, double age) {
        this.firstName = firstName;
        this.age = age;
    }

    public Cat(String firstName, double age, String owner) {
        this.firstName = firstName;
        this.age = age;
        this.owner=owner;
    }


    @Override
    public String toString() {
        return "Dog{" +
                ", firstName='" + firstName + '\'' +
                ", age=" + age +
                ", owner='" + owner + '\'' +
                '}';
    }
}
