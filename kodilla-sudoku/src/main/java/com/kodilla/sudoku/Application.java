package com.kodilla.sudoku;

public class Application {

    public static void main(String[] args) {

        SudokuGame theGame = new SudokuGame();
        theGame.startGame();

        boolean gameFinished = false;
        while (!gameFinished) {
            gameFinished = theGame.resolveSudoku();
        }
    }
}