package org.java.lessons.test2;

import java.time.LocalDate;

public class Arbitro extends Persona{
    // ATTRIBUTI
    private String role;
    // COSTRUTTORE

    public Arbitro(String name, int age, LocalDate dataDiNascita, String role) {
        super(name, age, dataDiNascita);
        this.role = role;
    }

    // G E S
    // METODI
    // tostring


    @Override
    public String toString() {
        return super.toString()+"Arbitro{" +
                "role='" + role + '\'' +
                '}';
    }
}
