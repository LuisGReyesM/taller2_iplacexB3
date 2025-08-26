package com.iplacex.calculadora;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {
    @Test
    void testSuma() {
        Calculadora calc = new Calculadora();
        assertEquals(5, calc.suma(2, 3), "La suma de 2 + 3 debe ser 5");
    }

    @Test
    void testResta() {
        Calculadora calc = new Calculadora();
        assertEquals(1, calc.resta(3, 2), "La resta de 3 - 2 debe ser 1");
    }

}