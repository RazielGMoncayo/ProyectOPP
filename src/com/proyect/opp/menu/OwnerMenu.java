package com.proyect.opp.menu;

import com.proyect.opp.information.Owner;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class OwnerMenu {
    private Set<Owner> owners = new HashSet<>();
    private Scanner sc;

    public OwnerMenu(Scanner sc) {
        this.sc = sc;
    }

    // Owner List
    public void listOwner(){
        if (owners.isEmpty()){
            System.out.println("There was no Owners added");
        }
        else {
            System.out.println("Owner List: ");
            for (Owner owner : owners){
                System.out.println(owner.getName() + " " + owner.getEmail() + " " + owner.getPhoneNumber());
            }
        }
    }

    // Add a new Owner
    public void addNewOwner() {
        System.out.println("Enter owner's name:");
        String name = sc.nextLine();

        System.out.println("Enter email:");
        String email = sc.nextLine();

        System.out.println("Enter phone:");
        String phone = sc.nextLine();

        Owner newOwner = new Owner(name,email,phone);
        owners.add(newOwner);
        System.out.println("Owner added successfully!!");
    }

    // Look for Owner
    public Owner lookforOwner(){
        System.out.println("Enter email:");
        String email = sc.nextLine();

        for (Owner owner : owners){
            if (owner.getEmail().equalsIgnoreCase(email)){
                return owner;
            }
        }
        return null;
    }

    // Delete Owner
    public void deleteOwnerByEmail(){
        Owner ownerToDelete = lookforOwner();
        if (ownerToDelete != null){
            owners.remove(ownerToDelete);
            System.out.println("Owner deleted successfully!");
        } else {
            System.out.println("Owner not found. Cannot delete");
        }
    }

    // Update Owner

}
