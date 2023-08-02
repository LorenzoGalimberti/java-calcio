package org.java.lessons.test2;
import java.time.Period;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

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
    private static final String[] RUOLI ={"difensore","centrocampista","attaccante"};



    //MAIN
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Arbitro arbitro= new Arbitro("Luca",22, LocalDate.now(),"capo");
        Partita game= new Partita("Inter","Milan",arbitro);
        game.simulaPartita(game);



        Squadra team= creaRoster();

        System.out.print(" Inserisci il nome dell' allenatore : ");
        String nomeManager= scan.nextLine();
        System.out.println("Inserisci la tettica dell' allenatore : ");
        System.out.println("1. offensiva");
        System.out.println("2. difensiva");
        System.out.println("3. neutra");
        String answer= scan.nextLine();
        LocalDate dataManager=randomBirthDate(1950,35);
        int etaManager=getAgeInYears(dataManager);
        Allenatore manager;
        switch (answer){
            case "1":
                manager = new Allenatore(nomeManager,etaManager,dataManager,"offensiva");
                team.aggiungiManager(manager);
                break;
            case "2":
                manager = new Allenatore(nomeManager,etaManager,dataManager,"difensiva");
                team.aggiungiManager(manager);
                break;
            case "3":
                manager = new Allenatore(nomeManager,etaManager,dataManager,"neutra");
                team.aggiungiManager(manager);
                break;
            default:
                System.out.println("hai inserito un comando non valido !");
                break;
        }


        team.stampaSquadra();



    }

    // METODI
    // random date
    public static LocalDate randomBirthDate(int minimo,int range){
        Random random = new Random();

        int year = random.nextInt(range) + minimo; // Genera un anno casuale tra il 1990 e il 2019
        int month =  1;    // Genera un mese casuale tra 1 e 12
        int day = 1;      // Genera un giorno casuale tra 1 e 28 (semplificato per semplicità)

        LocalDate dataCasuale = LocalDate.of(year, month, day);
        return dataCasuale.plusDays(random.nextInt(365));
    }

    // get age in years from random date
    public static int getAgeInYears(LocalDate dataDiNascita){
        LocalDate dataCorrente= LocalDate.now();
        Period period = Period.between(dataDiNascita, dataCorrente);
        return period.getYears();
    }
    // estrai ruolo
    public static String estraiRuolo(String[] array,int index){
        return array[index];
    }
    //estrai giocatore
    public static String estraiGiocatore(String[] array , int index){
        return array[index];
    }
    // random age
    private static int randomPlayerAge(){
        Random ran= new Random();
        return  ran.nextInt(17) + 18;
    }
    // crea roster
    public static Squadra creaRoster(){
        // lista vuota  giocatori
        List<Integer>  listaIndici = new ArrayList<>();
        Squadra team = new Squadra();

        // array nomi
        int counter=0;
        while(counter<11){
            LocalDate dataPlayer= randomBirthDate(1985,20);
            int etaPlayer=getAgeInYears(dataPlayer);
            int lunghezzaArray = NOMI_COGNOMI_GIOCATORI.length;
            int lunghezzaRuoli=RUOLI.length;
            Random ran= new Random();
            int numeroCasuale = ran.nextInt(lunghezzaArray-1);
            int numeroCasualeRuoli= ran.nextInt(lunghezzaRuoli-1);
            if(counter==0){
                listaIndici.add(numeroCasuale);

                Giocatore player= new Giocatore(estraiGiocatore(NOMI_COGNOMI_GIOCATORI,numeroCasuale),etaPlayer,dataPlayer,"portiere");
                team.aggiungiPersona(player);
            }else {
                if (listaIndici.contains(numeroCasuale)){
                    counter--;
                }else{

                    listaIndici.add(numeroCasuale);
                    Giocatore player= new Giocatore(estraiGiocatore(NOMI_COGNOMI_GIOCATORI,numeroCasuale),etaPlayer,dataPlayer,estraiRuolo(RUOLI,numeroCasualeRuoli));
                    team.aggiungiPersona(player);
                }
            }
            counter++;
        }
        return team;
    }

}
