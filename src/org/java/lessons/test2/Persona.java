package org.java.lessons.test2;

import java.time.LocalDate;

/* Creare una classe Persona con gli attributi nome ed età*/
public class Persona {
    // attributi
    private String name;
    private int age;
    private LocalDate dataDiNascita;
    // costruttore

    public Persona(String name, int age,LocalDate dataDiNascita) {
        this.dataDiNascita=dataDiNascita;
        this.name = name;
        this.age = age;
    }

    // g e s

    public LocalDate getDataDiNascita() {
        return dataDiNascita;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // metodo

    @Override
    public String toString() {
        return "Persona{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                '}';
    }
}
