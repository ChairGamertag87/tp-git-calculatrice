package com.calculatrice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AddTest {

    private final Add calculatrice = new Add();

    @Test
    void addDeuxEntiersPositifs() {
        assertEquals(5, calculatrice.add(2, 3));
    }

    @Test
    void addAvecZero() {
        assertEquals(7, calculatrice.add(7, 0));
    }

    @Test
    void addAvecNegatifs() {
        assertEquals(-5, calculatrice.add(-2, -3));
        assertEquals(1, calculatrice.add(-2, 3));
    }
}
