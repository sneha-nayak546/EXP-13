package com.bnmit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(6, calc.add(2, 3));
    }

    @Test
    public void testDivide() {
        assertEquals(2, calc.divide(4, 2));
    }
    @Test
    public void testDivideByZero() {
    	assertThrows(IllegalArgumentException.class, () -> {
        calc.divide(4, 0);
    });
}
}
