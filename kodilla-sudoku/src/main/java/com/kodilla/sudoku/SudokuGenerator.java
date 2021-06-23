package com.kodilla.sudoku;

import java.util.List;

public class SudokuGenerator {

    SudokuBoard board = new SudokuBoard();

    public SudokuRow rowGenerator() {
        SudokuRow sudokuRow = new SudokuRow();
        List posValues = List.of(1,2,3,4,5,6,7,8,9);

        for(int i=0;i<=8;i++) {
            sudokuRow.sudokuRow.add(new SudokuElement(i, posValues));
        }
        return sudokuRow;
    }

    public SudokuBoard boardGenerator() {
        for(int i=0;i<=8;i++) {
            SudokuRow r = rowGenerator();
            board.sudokuBoard.add(r);
        }
        System.out.println(board);
        return board;
    }

    public void boardRefreshing(int column, int row, int value) {
        board.sudokuBoard.get(row+1).sudokuRow.get(column+1).value = value;
        System.out.println(board);
    }
}