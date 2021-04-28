package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class TheGame {
    String playerName="";
    int pointsToWin;
    int playerPunctation;
    int compPunctation;
    int roundNumber;
    String playerKey;
    String compKey;
    boolean end;

    Scanner scan = new Scanner(System.in);

    public void Introduction() throws NumberFormatException {
        System.out.println("Witam w grze!");


        //sprawdzanie, czy podano imię
        boolean temp = false;
        do {
            System.out.println("\nPodaj swoje imię i zatwiedź klawiszem [ENTER]");
            playerName = scan.nextLine();
            if(!playerName.equals("")) {
                temp = true;
            } else {
                System.out.print("Nie przedstawiłeś się");
            }
        }
        while (!temp);
        System.out.println("Witaj " + playerName + ". Twój przeciwnik nazywa się DeepBlue.");

        //sprawdzenie czy poprawnie wprowadzono liczbę rund
        temp = false;
        do try {
            System.out.println("Do ilu wygranych gramy?");
            pointsToWin = Integer.parseInt(scan.nextLine());
            temp = true;
        } catch (NumberFormatException e) {
            System.out.println("Nie podałeś właściwej wartości. Wpisz cyfrę.");
        }
        while(!temp);
    }

    public void startGame(int actualRoundNumber) {
        roundNumber=actualRoundNumber;
        end = false;
        Random rand = new Random();

        System.out.println(
                   "=========================================="
                +"\n||            INSTRUKCJA GRY            ||"
                +"\n=========================================="
                +"\n|| klawisz 1 – zagranie KAMIEN,         ||"
                +"\n|| klawisz 2 – zagranie PAPIER,         ||"
                +"\n|| klawisz 3 – zagranie NOŻYCE,         ||"
                +"\n|| klawisz x – zakończenie gry,         ||"
                +"\n|| klawisz n – uruchomienie gry od nowa ||"
                +"\n=========================================="
                + "\n\nROZPOCZYNAMY GRE!");

        while(!end) {
            roundNumber+=1;
            System.out.println("\n** RUNDA " + roundNumber + " **");

                System.out.println("\nZagraj klawiszami [1], [2] lub [3] i naciśnij [ENTER]");
                playerKey = scan.nextLine();

                //obsługa wciśnięcia klawisza "x"
                if (playerKey.contains("x")) {
                    endGame();
                }

                //obsługa wciśnięcia klawisza "n"
                if (playerKey.contains("n")) {
                    newGame();
                }

            compKey = String.valueOf(rand.nextInt(2)+1);
            System.out.println("\nZagrałeś: "+convKey(playerKey)+", przeciwnik zagrał: "+convKey(compKey)
                    + "\nWynik: "+roundResult()
                    + "\n========================================="
                    + "\n||          WYNIK MECZU: " + playerPunctation + ":" + compPunctation
                    + "           ||"
                    + "\n=========================================");
            if(playerPunctation==pointsToWin || compPunctation==pointsToWin) {
                end = true;
                if(playerPunctation>compPunctation) {
                    System.out.println("Koniec meczu. Zostajesz zwycięzcą!");
                } else {
                    System.out.println("Koniec meczu. Wygrywa DeepBlue.");
                }
            }
        }
    }

    //ustalanie znaczenie wciśniętych klawiszy
    public String convKey(String key) {
        String result="";

        if(key.contains("1")) {
            result = "KAMIEN";
        } else if(key.contains("2")) {
            result = "PAPIER";
        }else if(key.contains("3")){
            result = "NOZYCE";
        }
        return result;
    }

    //ustalanie wyniku rundy
    public String roundResult() {
        String gResult="";
        if(playerKey.equals(compKey)) {
            gResult = "Remis";
        } else if(playerKey.contains("1") && compKey.contains("3")) {
            gResult = "KAMIEN zgniata NOZYCE. Wygrywasz rundę!!";
            playerPunctation +=1;
        } else if(playerKey.contains("3") && compKey.contains("2")) {
            gResult = "NOZYCE tną PAPIER. Wygrywasz rundę!!";
            playerPunctation +=1;
        } else if(playerKey.contains("2") && compKey.contains("1")) {
            gResult = "PAPIER przykrywa KAMIEN. Wygrywasz rundę!!";
            playerPunctation +=1;
        } else if(playerKey.contains("3") && compKey.contains("1")) {
            gResult = "KAMIEN zgniata NOZYCE. Przegrywasz rundę!!";
            compPunctation +=1;
        } else if(playerKey.contains("2") && compKey.contains("3")) {
            gResult = "NOZYCE tną PAPIER. Przegrywasz rundę!!";
            compPunctation +=1;
        } else if(playerKey.contains("1") && compKey.contains("2")) {
            gResult = "PAPIER przykrywa KAMIEN. Przegrywasz rundę!!";
            compPunctation +=1;
        }
        return gResult;
    }

    //obsługa wciśniecie klawisza "x" - zakończenie gry
    public void endGame() {
        System.out.println("Koniec gry? Wciśnij: [T]-tak, [N]-nie i zatwierdź klawiszem [ENTER]");
        String selection = scan.nextLine();
        if (selection.contains("N")) {
            startGame(0);
        }
        if(selection.contains("T")) {
            System.out.println("Koniec gry");
            System.exit(0);
        }
    }

    //obsługa wciśniecie klawisza "n" - nowa gra
    public void newGame() {
        System.out.println("Zakończyć tą grę i rozpocząć od nowa?"
                + "\nWciśnij: [T]-tak, [N]-nie i zatwierdź klawiszem [ENTER]");
        String selection = scan.nextLine();
        if (selection.contains("T")) {
            startGame(0);
            playerPunctation=0;
            compPunctation=0;
        }
        if(selection.contains("N")) {
            startGame(roundNumber-1);
        }
    }
}