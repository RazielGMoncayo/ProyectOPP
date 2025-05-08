package com.proyect.opp.information;

import java.util.HashSet;
import java.util.Set;

public class Owner {
    private String name;
    private String email;
    private String phoneNumber;
    private Set<Pet> pets = new HashSet<>();

    public Owner(String name, String email, String phoneNumber) {
        this(name, email, phoneNumber, new HashSet<>());
    }

    public Owner(String name, String email, String phoneNumber, Set<Pet> pets) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.pets = pets != null ? pets : new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Set<Pet> getPets() {
        return pets;
    }

}
