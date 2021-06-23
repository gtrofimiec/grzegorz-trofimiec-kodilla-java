package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuBoard {

    List<SudokuRow> sudokuBoard;

    public SudokuBoard() {
        this.sudokuBoard = new ArrayList<>();
    }

//    @Override
//    public String toString() {
//        return  "|-|-|-|-|-|-|-|-|-|\n" +
//                "|-|-|-|-|-|-|-|-|-|\n" +
//                "|-|-|-|-|-|-|-|-|-|\n" +
//                "|-|-|-|-|-|-|-|-|-|\n" +
//                "|-|-|-|-|-|-|-|-|-|\n" +
//                "|-|-|-|-|-|-|-|-|-|\n" +
//                "|-|-|-|-|-|-|-|-|-|\n" +
//                "|-|-|-|-|-|-|-|-|-|\n" +
//                "|-|-|-|-|-|-|-|-|-|\n" +
//                "|-|-|-|-|-|-|-|-|-|";
//    }


    @Override
    public String toString() {
        return "SudokuBoard\n"+ sudokuBoard;
    }
}