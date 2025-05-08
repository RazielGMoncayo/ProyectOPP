package com.proyect.opp.information;

public class Cat extends Pet{
    public Cat(String name, int age, String breed, double weight) {
        super(name, age, breed, weight);
    }

    @Override
    public String makeNoise() {
        return "Miau miau!";
    }
}
