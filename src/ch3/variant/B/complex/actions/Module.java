package ch3.variant.B.complex.actions;

import ch3.variant.B.complex.entity.ComplexEntity;

public class Module {
    public static double module(ComplexEntity z) {
        return Math.sqrt(z.getdReal()*z.getdReal() + z.getdImaginary()* z.getdImaginary());
    }
}
