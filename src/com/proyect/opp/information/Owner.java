package com.proyect.opp.information;

import java.util.HashSet;
import java.util.Set;

public class Owner {
    private String name;
    private String email;
    private int phoneNumber;
    private Set<Pet> pets = new HashSet<>();

    public Owner(String email, String name, Set<Pet> pets, int phoneNumber) {
        this.email = email;
        this.name = name;
        this.pets = pets;
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


}
