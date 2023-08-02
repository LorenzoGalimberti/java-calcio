package org.java.lessons.test2;

import java.time.LocalDate;

public class Allenatore extends Persona{
    // attributo
    private String strategia;

    // costruttore

    public Allenatore(String name, int age, LocalDate dataDiNascita,String strategia) {
        super(name, age,dataDiNascita);
        this.strategia = strategia;
    }

    // g e s

    public String getStrategia() {
        return strategia;
    }

    // METODI
    // tostring

    @Override
    public String toString() {
        return super.toString()+"Allenatore{" +
                "strategia='" + strategia + '\'' +
                '}';
    }
}
