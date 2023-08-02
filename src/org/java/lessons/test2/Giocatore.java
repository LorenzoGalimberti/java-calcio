package org.java.lessons.test2;

public class Giocatore extends Persona{
    // attrobuto
    private String role;
    private int jerseyNumber;
    // costruttore

    public Giocatore(String name, int age, String role, int jerseyNumber) {
        super(name, age);
        this.role = role;
        this.jerseyNumber = jerseyNumber;
    }

    // g e s

    public String getRole() {
        return role;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    // metodi
    // tostring


    @Override
    public String toString() {
        return super.toString()+"Giocatore{" +
                "role='" + role + '\'' +
                ", jerseyNumber=" + jerseyNumber +
                '}';
    }
}
