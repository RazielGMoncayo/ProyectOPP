package com.proyect.opp.information;

public class Dog extends Pet{

    public Dog(String name, int age, String breed, double weight) {
        super(name, age, breed, weight);
    }

    @Override
    public String makeNoise() {
        return "Gua gua!";
    }


}
