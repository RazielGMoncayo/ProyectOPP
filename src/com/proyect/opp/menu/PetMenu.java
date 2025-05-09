package com.proyect.opp.menu;

import com.proyect.opp.information.Cat;
import com.proyect.opp.information.Dog;
import com.proyect.opp.information.Owner;
import com.proyect.opp.information.Pet;


import java.util.Scanner;

public class PetMenu {

    private Scanner sc;

    public PetMenu(Scanner sc) {
        this.sc = sc;
    }

    public void addPet( Owner owner){
        if (owner == null){
            System.out.println("Owner does not exist :(");
            return;
        }

        System.out.println("Enter pet's name:");
        String name = sc.nextLine();

        System.out.println("Enter pet's age:");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter pet's breed:");
        String breed = sc.nextLine();

        System.out.println("Enter pet's weight:");
        double weight = sc.nextDouble();
        sc.nextLine();

        System.out.println("Enter pet's type (Dog or Cat):");
        String type = sc.nextLine();

        Pet newPet = null;

        if (type.equalsIgnoreCase("dog")) {
            newPet = new Dog(name, age, breed, weight);
        } else if (type.equalsIgnoreCase("cat")) {
            newPet = new Cat(name, age, breed, weight);
        } else {
            System.out.println("Invalid pet type entered.");
            return;
        }

        boolean added = owner.getPets().add(newPet);
        if (added) {
            System.out.println("Pet added successfully to " + owner.getName() + "!" + " " + newPet.makeNoise());
        } else {
            System.out.println("This pet is already registered for " + owner.getName());
        }
    }

}
