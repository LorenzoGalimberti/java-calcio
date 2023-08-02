package org.java.lessons.test2;

import java.util.Random;

/*Implementa un metodo
per iniziare la partita (che imposti lo stato della partita come "iniziata")
e un metodo per segnare un goal:
scegliere in modo casuale quale delle due squadre ha segnato e
stampare la stringa “Ha segnato la squadra <nomeSquadra>”.

 A prescindere da quale squadra ha segnato, incrementare un contatore con il totale dei goal segnati.


NB: non è possibile segnare un goal se la partita non è ancora iniziata!
 In questo caso il sistema deve restituire un messaggio d’errore.*/
public class Partita {
    // ATTRIBUTI
    private  String homeTeam;
    private  String awayTeam;
    private  Arbitro referee;
    // COSTRUTTORE

    public Partita(String homeTeam, String awayTeam, Arbitro referee) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.referee = referee;
    }

    // G E S
    // METODI
    // inizia partita
    public boolean startGame(){
        System.out.println("partita iniziata");
        return true;
    }

    // segna gol
    /*scegliere in modo casuale quale delle due squadre ha segnato e
stampare la stringa “Ha segnato la squadra <nomeSquadra>”.

 A prescindere da quale squadra ha segnato, incrementare un contatore con il totale dei goal segnati.


NB: non è possibile segnare un goal se la partita non è ancora iniziata!
 In questo caso il sistema deve restituire un messaggio d’errore.*/
    public int segnaGoal(int goals,boolean iniziata) throws RuntimeException{
        int retiTotali=goals;
        retiTotali++;
        if(!iniziata){
            throw new RuntimeException("Parita non ancora iniziata , impossibile segnare!!");
        }
        Random ran= new Random();
        int choiche = ran.nextInt(2);
        if(choiche == 0){
            System.out.println(" gol della squadra " + this.homeTeam);
        }else{
            System.out.println(" ha segnato la squadra  "+this.awayTeam);
        }
        return retiTotali;
    }
}
