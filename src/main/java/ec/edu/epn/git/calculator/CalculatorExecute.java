package ec.edu.epn.git.calculator;

public class CalculatorExecute {
    public static void main(String[] args) {
        System.out.println("== Calculator Execute Probando Integracion ==");

        Calculadora c = new Calculadora();
        double addition = c.sumar(1, 2);
        System.out.println("c.sumar(1, 2) = " + addition);

        double subtraction = c.restar(2, 1);
        System.out.println("c.restar(2, 1) = " + subtraction);

    }
}