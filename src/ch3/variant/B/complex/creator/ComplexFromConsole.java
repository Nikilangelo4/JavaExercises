package ch3.variant.B.complex.creator;

import ch3.variant.B.complex.entity.ComplexEntity;

import java.util.Scanner;

public class ComplexFromConsole {
    public static ComplexEntity fillFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Fill ComplexEntity from console");
        System.out.println("enter real part: ");
        double real = scanner.nextDouble();
        System.out.println("enter imaginary part: ");
        double imaginary = scanner.nextDouble();
        scanner.close();
        return new ComplexEntity(real,imaginary);
    }
}
