package klinika;

import java.util.Scanner;

public class Owner {
   private String fierstName;
   private String lastName;
   private int phoneNumber;
   private Pet pet;

    public Owner() {
    }

    public Owner(String fierstName, String lastName, int phoneNumber ) {
        this.fierstName = fierstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }


    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "fierstName='" + fierstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", pet=" + pet +
                '}';
    }
}
