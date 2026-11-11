package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DiscountCalculatorTest {
    private final DiscountCalculator calculator = new DiscountCalculator();

    @Test
    void twentyPercentDiscount() {
        assertEquals(80.0, calculator.calculateFinalPrice(100, 20), 0.001);
    }

    @Test
    void zeroDiscount() {
        assertEquals(50.0, calculator.calculateFinalPrice(50, 0), 0.001);
    }

    @Test
    void fullDiscount() {
        assertEquals(0.0, calculator.calculateFinalPrice(50, 100), 0.001);
    }

    @Test
    void negativePriceRejected() {
        assertThrows(IllegalArgumentException.class,
                () -> calculator.calculateFinalPrice(-10, 20));
    }

    @Test
    void excessiveDiscountRejected() {
        assertThrows(IllegalArgumentException.class,
                () -> calculator.calculateFinalPrice(100, 150));
    }

    @Test
    void notANumberRejected() {
        assertThrows(IllegalArgumentException.class,
                () -> calculator.calculateFinalPrice(Double.NaN, 20));
    }
}
