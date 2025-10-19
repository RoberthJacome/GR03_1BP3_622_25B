package ec.epn.edu.git.calculator;

import java.util.Scanner;
/**
 * Clase Main
 * Punto de entrada para la aplicación de la calculadora.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        System.out.print("Ingrese el primer número: ");
        double a = sc.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double b = sc.nextDouble();

        System.out.println("Suma: " + calc.sumar(a, b));
        System.out.println("Resta: " + calc.restar(a, b));
        System.out.println("Multiplicación: " + calc.multiplicar(a, b));
        try {
            System.out.println("División: " + calc.dividir(a, b));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}