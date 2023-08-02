package org.java.lessons.test2;

public class Allenatore extends Persona{
    // attributo
    private String strategia;

    // costruttore

    public Allenatore(String name, int age, String strategia) {
        super(name, age);
        this.strategia = strategia;
    }

    // g e s
    // METODI
    // tostring

    @Override
    public String toString() {
        return super.toString()+"Allenatore{" +
                "strategia='" + strategia + '\'' +
                '}';
    }
}
