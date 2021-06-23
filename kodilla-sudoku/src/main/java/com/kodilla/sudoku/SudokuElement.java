package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuElement {

    int value;
    public static int EMPTY = -1;
    List<Integer> posValues;

    public SudokuElement(int value, List<Integer> posValues) {
        this.value = value;
        this.posValues = new ArrayList<>();
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