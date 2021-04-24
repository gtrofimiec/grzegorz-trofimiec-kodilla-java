package com.kodilla.rps;

import java.util.Scanner;

public class TheGame {
    String playerName="";

    public void Introduction() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Witam w grze!");

        boolean counter = false;
        do {
            if(counter){
                System.out.println("Nie przedstawiłeś się!");
            }
            System.out.println("Jak masz na imię?");
            playerName = scan.nextLine();
            counter =true;
        }
        while(playerName!="");
    }
}