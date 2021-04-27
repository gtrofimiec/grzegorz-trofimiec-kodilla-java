package com.kodilla.rps;

public class RpsRunner {

    public static void main(String[] args){

        TheGame theGame = new TheGame();

        theGame.Introduction();
        theGame.startGame(0);
        theGame.endGame();
    }
}
