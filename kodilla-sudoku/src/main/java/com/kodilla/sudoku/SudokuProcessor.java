package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SudokuProcessor {

    Scanner scan = new Scanner(System.in);
    List<Integer> val = new ArrayList<>();
    SudokuGenerator sudokuGenerator = new SudokuGenerator();
    int column;
    int row;
    int value;

    void sudokuProcess() {
        System.out.println("Wprowadz cyfre do pola okreslonego z parametrami\n"+
                "<kolumna, wiersz, wartosc (1-9)>\n" +
                "i zatwierdz [Enter]");
        String line = scan.nextLine();

        column = Character.getNumericValue(line.charAt(0));
        row = Character.getNumericValue(line.charAt(2));
        value = Character.getNumericValue(line.charAt(4));

        sudokuGenerator.boardRefreshing(column, row, value);
        System.out.println(column+row+value);

    }
}