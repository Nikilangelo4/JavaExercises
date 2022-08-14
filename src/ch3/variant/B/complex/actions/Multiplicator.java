package ch3.variant.B.complex.actions;

import ch3.variant.B.complex.entity.ComplexEntity;

public class Multiplicator {
    public static ComplexEntity product(ComplexEntity z1, ComplexEntity z2) {
        double real1 = z1.getdReal();
        double real2 = z2.getdReal();
        double imaginary1 = z1.getdImaginary();
        double imaginary2 = z2.getdImaginary();
        return new ComplexEntity((real1*real2 - imaginary1*imaginary2),
                (imaginary1*real2+real1*imaginary2));
    }

}
