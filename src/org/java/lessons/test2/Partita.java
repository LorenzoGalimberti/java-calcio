package org.java.lessons.test2;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

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

    // simula partita
    public void  simulaPartita(Partita game){
        Scanner scanGame= new Scanner(System.in);
        //PARTITA test
        boolean iniziata=false;
        int goals=0;

        System.out.print("Vuoi iniziare la partita ? (Y/n)  ");
        String answerGame= scanGame.nextLine();
        if(answerGame.equalsIgnoreCase("y")){
            iniziata=true;
        } else if (answerGame.equalsIgnoreCase("n")) {
            System.out.println("alla prossima ");
        }else{
            System.out.println("comando non valido");
        }
        try {

            goals=game.segnaGoal(goals,iniziata);
            goals=game.segnaGoal(goals,iniziata);
            System.out.println("gol totali :" + goals);

        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }
}
