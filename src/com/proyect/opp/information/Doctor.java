package com.proyect.opp.information;

public class Doctor {

    private String name;
    private String especialidad;

    public Doctor(String especialidad, String name) {
        this.especialidad = especialidad;
        this.name = name;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
