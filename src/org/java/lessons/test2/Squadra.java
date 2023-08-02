package org.java.lessons.test2;

import java.util.ArrayList;
import java.util.List;

public class Squadra {
    // ATTRIBUTI
    private List<Giocatore> roster;
    private Allenatore manager;
    // COSTRUTTORE
    public Squadra(){
        manager=null;
        roster= new ArrayList<>();
    }
    // GETTER AND SETTER
    // METODI
    // stampa squadra
    public void stampaSquadra(){
        for (Giocatore g : roster){
            System.out.println(g.getName()+" "+g.getRole()+ " "+g.getJerseyNumber()+ " " + g.getAge()+" anni");
        }
    }
    // aggiungi persona
    public void aggiungiPersona(Giocatore player) {
        roster.add(player);
    }

    // aggiungi manager
    public void aggiungiManager(Allenatore manager){
        this.manager=manager;
    }
}
