package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {

    @Test
    void testBigmacBuilder() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("with sesame")
                .burgers(2)
                .sauce("1000 island sauce")
                .ingredient("lettuce")
                .ingredient("cucumber")
                .ingredient("bacon")
                .build();
        System.out.println(bigmac);

        //When
        String bigmacBun = bigmac.getBun();
        int bigmacBurgers = bigmac.getBurgers();
        String sauce = bigmac.getSauce();
        int howManyIngredients = bigmac.getIngredients().size();

        //Then
        assertEquals("with sesame", bigmacBun);
        assertEquals(2, bigmacBurgers);
        assertEquals("1000 island sauce", sauce);
        assertEquals(3, howManyIngredients);
    }
}