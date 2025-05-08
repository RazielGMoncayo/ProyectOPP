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

    public void addnewOwner() {
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

}
