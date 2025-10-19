package ec.epn.edu.git.calculator;

import static org.junit.jupiter.api.Assertions.*;
class CalculadoraTest {
    private final Calculadora calculadora = new Calculadora();

    @org.junit.jupiter.api.Test
    void sumar() {
        assertEquals(5, calculadora.sumar(2, 3));
        assertEquals(-1, calculadora.sumar(2, -3));
    }

    @org.junit.jupiter.api.Test
    void restar() {
        assertEquals(-1, calculadora.restar(2, 3));
        assertEquals(5, calculadora.restar(2, -3));
    }

    @org.junit.jupiter.api.Test
    void multiplicar() {
        assertEquals(6, calculadora.multiplicar(2, 3));
        assertEquals(-6, calculadora.multiplicar(2, -3));
    }

    @org.junit.jupiter.api.Test
    void dividir() {
        assertEquals(2, calculadora.dividir(6, 3));
        assertEquals(-2, calculadora.dividir(6, -3));
    }

    @org.junit.jupiter.api.Test
    void dividirPorCero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calculadora.dividir(6, 0);
        });
        assertEquals("No se puede dividir entre cero", exception.getMessage());
    }
  
}