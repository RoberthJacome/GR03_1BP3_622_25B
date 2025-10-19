package ec.epn.edu.git.calculator;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraParametersTest {

    private final Calculadora calculadora = new Calculadora();

    @ParameterizedTest(name = "Suma de {0} + {1} = {2}")
    @CsvSource({
            "5.0, 3.0, 8.0",
            "-2.0, 2.0, 0.0",
            "0.0, 0.0, 0.0",
            "-3.0, -2.0, -5.0"
    })
    void testSumar(double a, double b, double esperado) {
        double resultado = calculadora.sumar(a, b);
        assertEquals(esperado, resultado, 0.0001,
                "La suma de " + a + " + " + b + " debe ser " + esperado);
    }
}