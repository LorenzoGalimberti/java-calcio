package org.java.lessons.test2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
*Creare infine una classe Main
 definire al suo interno un array di nomi e un array con i possibili ruoli per i giocatori.
Nel metodo main, generare una Squadra formata da 11 giocatori creati in modo randomico:
prelevare un nome casuale dall’array di nomi
generare l’età in modo casuale
prelevare un ruolo casuale dall’array di possibili ruoli*/
public class Main {
    private static final String[] NOMI_COGNOMI_GIOCATORI = {
            "Marco Rossi", "Alessio Bianchi", "Lorenzo Russo", "Simone Ferrara", "Andrea Martini",
            "Luca Rossetti", "Davide Fontana", "Giovanni Ricci", "Filippo Bellini", "Nicolas De Luca",
            "Emanuele Gallo", "Matteo Rossi", "Paolo Marini", "Riccardo Leone", "Tommaso Vitale",
            "Enrico Longo", "Lorenzo Gatti", "Mattia Barbieri", "Pietro Greco", "Luigi Fiore",
            "Dario Lombardi", "Andrea Mariani", "Fabio Serra", "Stefano Ruggiero", "Davide Palumbo",
            "Nicola Lombardi", "Michele Russo", "Alessio D'Amico", "Gianluca Santoro", "Nicolas Lombardi",
            "Fabrizio Marino", "Simone Barone", "Daniele Pellegrini", "Roberto Mariani", "Andrea Rizzi",
            "Matteo Moretti", "Davide Barbieri", "Stefano Bianchi", "Pietro Marchetti", "Nicolas Santoro",
            "Marco Monti", "Giovanni Martino", "Lorenzo Galli", "Alessandro Marchetti", "Luca Coppola",
            "Davide Palmieri", "Giacomo Leone", "Matteo Santoro", "Fabrizio Marino", "Gianluca Fontana",
            "Alessandro De Angelis", "Leonardo Sorrentino", "Davide Farina", "Federico Romano",
            "Simone Rinaldi", "Francesco Esposito", "Luca Vitale", "Domenico Ferrara", "Antonio Martini",
            "Mario Rossetti", "Angelo Coppola", "Carmine Bellini", "Vincenzo Ricci", "Salvatore Greco",
            "Giovanni Marchetti", "Francesco Barbieri", "Raffaele Lombardi", "Federico Bianchi",
            "Emanuele Pellegrini", "Alessio Marino", "Stefano De Rosa", "Lorenzo Santoro",
            "Gianluca De Luca", "Alberto Monti", "Gabriele Martino", "Roberto Galli", "Matteo Ferri",
            "Alessandro Mariani", "Antonio Vitale", "Nicola Romano", "Massimo Palmieri", "Daniele Ferrari",
            "Vincenzo Greco", "Salvatore Moretti", "Davide Santoro", "Riccardo Marini", "Leonardo Fiore",
            "Angelo Ruggiero", "Carmine Sorrentino", "Emanuele Farina", "Francesco Rinaldi",
            "Luigi Esposito", "Domenico Vitale", "Antonio De Angelis", "Mario Barbieri", "Giovanni Marchetti",
            "Francesco Russo", "Raffaele Martini", "Federico Coppola", "Emanuele Bellini", "Alessio Ricci"
    };
    private static final String[] RUOLI ={"portiere","difensore","centrocampista","attaccante"};
    public static void main(String[] args) {
        // lista vuota sei giocatori
        List<Integer>  listaIndici = new ArrayList<>();
        Squadra team = new Squadra();
    // array nomi
        int counter=0;
        while(counter<11){
            int lunghezzaArray = NOMI_COGNOMI_GIOCATORI.length;
            Random ran= new Random();

            int numeroCasuale = ran.nextInt(lunghezzaArray-1);
            if (listaIndici.contains(numeroCasuale)){
                counter--;
            }else{
                int etaCasuale = ran.nextInt(17) + 18;
                System.out.println("non contiene");
                System.out.println(numeroCasuale);
                System.out.println(counter+1);
                System.out.println(estraiGiocatore(NOMI_COGNOMI_GIOCATORI,numeroCasuale));
                listaIndici.add(numeroCasuale);
                Giocatore player= new Giocatore(estraiGiocatore(NOMI_COGNOMI_GIOCATORI,numeroCasuale),etaCasuale,"terzino",3);
                team.aggiungiPersona(player);
            }


            counter++;
        }
        team.stampaSquadra();
    }

    // METODI
    //estrai giocatore
    public static String estraiGiocatore(String[] array , int index){
        return array[index];
    }

    // crea roster

}
