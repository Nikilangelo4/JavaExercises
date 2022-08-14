package ch3.variant.B.complex.main;

import ch3.variant.B.complex.actions.Adder;
import ch3.variant.B.complex.actions.Divisor;
import ch3.variant.B.complex.actions.Module;
import ch3.variant.B.complex.actions.Multiplicator;
import ch3.variant.B.complex.creator.ComplexFillRandom;
import ch3.variant.B.complex.creator.ComplexFromConsole;
import ch3.variant.B.complex.entity.ComplexEntity;

public class ComplexMain {
    public static void main(String[] args) {
        ComplexEntity z1 = ComplexFromConsole.fillFromConsole();
        System.out.println("Complex number1 from console : " + z1);
        ComplexEntity z2 = ComplexFromConsole.fillFromConsole();
        System.out.println("Complex number2 from console : " + z2);
        ComplexEntity sum = Adder.add(z1,z2);
        System.out.println("Sum of " + z1 + " and " + z2 + ": " + sum);
        ComplexEntity quotient = Divisor.divide(z1,z2);
        System.out.println("Division of " + z1 + " and " + z2 + ": " + quotient);
        double module = Module.module(z1);
        System.out.println("Module of " + z1 + ": " + module);
        ComplexEntity product = Multiplicator.product(z1,z2);
        System.out.println("Product of " + z1 + " and " + z2 + ": " + product);

    }
}
