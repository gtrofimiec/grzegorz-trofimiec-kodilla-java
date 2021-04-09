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

    @DisplayName("Sprawdzenie czy zawartosc listy potraktowanej Exterminatorem" +
    "nie jest pusta")

    @Test
    void testOddNumbersExterminatorEmptyList() {

        //Given
        OddNumbersExterminator ext = new OddNumbersExterminator();
        List<Integer> listBefore = new ArrayList<Integer>();

        //When -> załadowanie listy danymi i eksterminacja :)
        for (int i = 0; i < 10; i++) {
            listBefore.add(i);
        }
        List<Integer> listAfter = ext.exterminate(listBefore);

        //Then -> sprawdzanie co się stanie gdy lista jest pusta
        //Assertions.assertTrue(listAfter.size() == 0) "Error!! Empty list!!");
        if(listAfter.size()==0) {
            System.out.println("Error!! Empty list!!");
        } else {
            System.out.println("OK. List not empty.");
        }
    }

    @DisplayName("Sprawdzenie czy zawartość listy potraktowanej Exterminatorem" +
            "nie zawiera liczb nieparzystych")

    @Test
    void testOddNumbersExterminatorNormalList() {

        //Given -> tworzenie obiektów: exterminator oraz listę, którą ma eksterminować :)
        OddNumbersExterminator ext = new OddNumbersExterminator();
        List<Integer> listBefore = new ArrayList<Integer>();

        //When -> załadowanie listy danymi i eksterminacja :)
        for (int i = 0; i < 10; i++) {
            listBefore.add(i);
        }
        List<Integer> listAfter = ext.exterminate(listBefore);

        //Then -> sprawdzanie czy na liście nie ma liczb nieparzystych
        for(int number : listAfter) {
            if(number % 2 != 0) {
                System.out.println("Error! Found odd number!" + number);
                break;
            }
        }
    }
}