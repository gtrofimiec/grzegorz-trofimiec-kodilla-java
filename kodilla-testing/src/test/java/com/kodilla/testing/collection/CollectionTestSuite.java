package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @DisplayName("sprawdzajacy, czy klasa zachowuje sie poprawnie," +
            " gdy lista jest pusta.")

    @Test
    void testOddNumbersExterminatorEmptyList() {

        //Given
        OddNumbersExterminator ext = new OddNumbersExterminator();
        List<Integer> listBefore = new ArrayList<>();

        //When
        List<Integer> listAfter = ext.exterminate(listBefore);

        //Then
        Assertions.assertTrue(listAfter.size() == 0);
    }

    @DisplayName("sprawdzajacy, czy klasa zachowuje sie poprawnie, " +
            "gdy lista zawiera liczby parzyste i nieparzyste.")

    @Test
    void testOddNumbersExterminatorNormalList() {

        //Given -> tworzenie obiektów: exterminator oraz listę, którą ma eksterminować :)
        OddNumbersExterminator ext = new OddNumbersExterminator();
        List<Integer> listBefore = new ArrayList<Integer>();

        //When -> załadowanie listy danymi i eksterminacja :)
        for (int i = 1; i < 6; i++) {
            listBefore.add(i);
        }
        List<Integer> listAfter = ext.exterminate(listBefore);

        //Then -> sprawdzanie czy na liście nie ma liczb nieparzystych
        Assertions.assertEquals(2, listAfter.get(0));
    }
}