package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuBoard {

    List<SudokuRow> sudokuRow;

    public SudokuBoard() {
        this.sudokuRow = new ArrayList<>(); //powtórzyć
    }

    @Override
    public String toString() {
        return  "|-|-|-|-|-|-|-|-|-|\n" + //zmienić lista tostring ow z rowa
                "|-|-|-|-|-|-|-|-|-|\n" +
                "|-|-|-|-|-|-|-|-|-|\n" +
                "|-|-|-|-|-|-|-|-|-|\n" +
                "|-|-|-|-|-|-|-|-|-|\n" +
                "|-|-|-|-|-|-|-|-|-|\n" +
                "|-|-|-|-|-|-|-|-|-|\n" +
                "|-|-|-|-|-|-|-|-|-|\n" +
                "|-|-|-|-|-|-|-|-|-|\n" +
                "|-|-|-|-|-|-|-|-|-|";
    }


//    @Override
//    public String toString() {
//        return "SudokuBoard\n"+ sudokuBoard;
//    }
}