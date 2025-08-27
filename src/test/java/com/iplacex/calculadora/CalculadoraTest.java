package com.iplacex.calculadora;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    @Description("Prueba de suma de la calculadora")
    @Severity(SeverityLevel.CRITICAL)
    void testSuma() {
        Calculadora calc = new Calculadora();
        assertEquals(5, calc.suma(2, 3), "La suma de 2 + 3 debe ser 5");
    }

    @Test
    @Description("Prueba de resta de la calculadora")
    @Severity(SeverityLevel.NORMAL)
    void testResta() {
        Calculadora calc = new Calculadora();
        assertEquals(1, calc.resta(3, 2), "La resta de 3 - 2 debe ser 1");
    }
}
