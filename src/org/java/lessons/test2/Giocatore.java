package org.java.lessons.test2;

import java.time.LocalDate;

public class Giocatore extends Persona{
    // attrobuto
    private String role;

    // costruttore



    public Giocatore(String name, int age, LocalDate dataDiNascita, String role) {
        super(name, age,dataDiNascita);
        this.role = role;
    }

    // g e s

    public String getRole() {
        return role;
    }



    // metodi
    // tostring


    @Override
    public String toString() {
        return super.toString()+"Giocatore{" +
                "role='" + role + '\''+
                '}';
    }
}
