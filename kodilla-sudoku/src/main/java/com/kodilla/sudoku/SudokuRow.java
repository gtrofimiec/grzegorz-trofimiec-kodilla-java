package com.kodilla.sudoku;

import java.util.List;

public class SudokuRow {

    List<SudokuElement> sudokuElement;

    public SudokuRow() {
        this.sudokuElement = List.of(new SudokuElement(),new SudokuElement()); // uzupełmnić
    }

    @Override
    public String toString() {
        return "SudokuRow{" +
                "sudokuElement=" + sudokuElement +
                '}';
    }
}