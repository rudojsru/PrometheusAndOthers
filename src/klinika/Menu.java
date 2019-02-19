package klinika;

import java.util.*;

public class Menu {

    Hospital hospital = new Hospital();
    Scanner keybord = new Scanner(System.in);

    public static void main(String[] args) {
        Menu m = new Menu();
        m.runMenu();
    }

    void runMenu() {
        header();
        while (true) {
            menu();
            int choice = getInput();
            result(choice);

        }
    }

    private int getInput() {
        int choise = -1;
        do {
            System.out.println("Enter your choice: ");
            try {
                choise = Integer.parseInt(keybord.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("Invalid selection. Number only please");
            }
            if (choise < 0 || choise > 5) {
                System.out.println("Choice outside of range. Please chose again");
            }
        } while (choise < 0 || choise > 5);

        return choise;
    }

    private void result(int choise) {
        switch (choise) {
            case 1:
                createNewCustomer();
                break;
            case 2:
                findPetOrCustomer();
                break;
            //   case 3: correctionNameCustomerOrPet(); break;
            //     case 4: findAllCustomerOrPet(); break;
            case 0:
                forExit();
                break;
        }
    }

    private void findPetOrCustomer() {
        System.out.println("For search customr print 1, for search pets print 2");
        int search = 0;
        while (search < 1 || search > 2) {
            search = getInput();
        }

        if (search == 1) {
            System.out.println("Please write last name of customer");
            String searchName = keybord.nextLine();
           Map map=  hospital.getOwnerAndPets();

//            for ( Object a : map.keySet()) {
//                if (a.getLastName()==(searchName)) ;
//                System.out.println(a);
//            }
        } else if (search == 2) {
//            System.out.println("Please write name of pet");
//            String searchNameOfPet=keybord.nextLine();
//            for ( Owner a:hospital.getOwners()) {
//                a.g
//            }
        }


    }

    private void createNewCustomer() {
        String firstName, lastName;
        int phoneNumber = 0;
        Pet pet = null;
        System.out.println("Provide first name");
        firstName = keybord.nextLine();
        System.out.println("Provide last name");
        lastName = keybord.nextLine();
        boolean value = false;
        while (!value) {
            System.out.println("Provide phonen number(just number");
            try {
                phoneNumber = Integer.parseInt(keybord.nextLine());
                value = true;
            } catch (NumberFormatException e) {
                System.out.println("NumberFormatException / the phone must consist of number only ");
            }
        }
        value = false;
        System.out.println("Customer have a animals? Put 1 for Yes or 2 for Not");
        List<Pet> pets = new ArrayList<>();
        while (!value) {
            int haveAnimalsOrNot = Integer.parseInt(keybord.nextLine());
            if (haveAnimalsOrNot == 1) {
                pet = creatNewPet();
                pets.add(pet);
                System.out.println("Customer have a animals? Put 1 for Yes or 2 for Not");
            }else if(haveAnimalsOrNot ==2){
                value=true;
            }
        }
        Owner owner = new Owner(firstName, lastName, phoneNumber);
        hospital.getOwnerAndPets().put(owner, pets);
    }

    private Pet creatNewPet() {
        Pet pet = null;
        Scanner keybort = new Scanner(System.in);
        String nameOfPet;
        double age = 0;
        Owner owner = null;
        boolean value = false;
        String choice;
        do {
            System.out.println("For Dog print -D, for Cat print C");
            choice = keybort.nextLine();
            if (choice.toLowerCase().equals("d") || choice.toLowerCase().equals("c")) {
                value = true;
            }
        } while (!value);
        System.out.println("Please provide first name of pet");
        nameOfPet = keybort.nextLine();
        value = false;
        while (!value) {
            System.out.println("Please provide age of pet");
            try {
                age = Double.parseDouble(keybort.nextLine());
                value = true;
            } catch (NumberFormatException exception) {
                System.out.println("The age must consist of numbers only.");
            }
        }
        if (choice.toLowerCase().equals("d")) {
            pet = new Dog(nameOfPet, age);
        } else if (choice.toLowerCase().equals("c")) {
            pet = new Cat(nameOfPet, age, owner.getLastName());
        }
        return pet;
    }

    private void forExit() {
        System.exit(0);
    }


    private void menu() {
        System.out.println(" 1) For create new customer put 1");
        System.out.println(" 2) Find pet or customer put 2");
        System.out.println(" 3) For correction name of customer or pet, put 3");
        System.out.println(" 4) Find all customer or pet, put 4");
        System.out.println(" 0) For exit put 0");
    }

    private void header() {
        System.out.println("+--------------------------------------------------+");
        System.out.println("|---You welcome to pet Hospital--------------------|");
        System.out.println("|--------------------------------------------------|");
        System.out.println("+--------------------------------------------------+");
    }
}
