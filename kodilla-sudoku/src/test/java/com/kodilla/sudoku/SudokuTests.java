package com.kodilla.sudoku;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SudokuTests {

    @Test
    void generatingBoardTest() {

        //Given
        SudokuGenerator generator = new SudokuGenerator();

        //When
        SudokuRow rowsList = generator.rowGenerator();
        SudokuBoard board = generator.boardGenerator();

        //Then
        assertEquals(9, rowsList.sudokuElement.size());
        assertEquals(9, board.sudokuRow.size());
    }
}
