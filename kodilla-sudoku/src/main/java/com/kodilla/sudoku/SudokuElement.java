package com.kodilla.sudoku;

import java.util.List;

public class SudokuElement {

    private int value;
    private static int EMPTY = -1;
    private List<Integer> posValues;

    public SudokuElement() {
        this.value = EMPTY;
        this.posValues = List.of(1,2,3,4,5,6,7,8,9);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public List<Integer> getPosValues() {
        return posValues;
    }

    public void setPosValues(List<Integer> posValues) {
        this.posValues = posValues;
    }
}