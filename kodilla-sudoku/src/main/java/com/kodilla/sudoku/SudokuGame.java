package com.kodilla.sudoku;

public class SudokuGame {

    void startGame() {

        SudokuGenerator sudokuGenerator = new SudokuGenerator();
        SudokuProcessor sudokuProcessor = new SudokuProcessor();

        sudokuGenerator.boardGenerator();
        sudokuProcessor.sudokuProcess();
    }

    boolean resolveSudoku() {

        return true;
    }
}
