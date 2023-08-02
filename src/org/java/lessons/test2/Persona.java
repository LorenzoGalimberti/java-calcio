package org.java.lessons.test2;
/* Creare una classe Persona con gli attributi nome ed età*/
public class Persona {
    // attributi
    private String name;
    private int age;
    // costruttore

    public Persona(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // g e s

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
