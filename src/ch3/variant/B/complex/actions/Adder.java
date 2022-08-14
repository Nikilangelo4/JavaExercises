package ch3.variant.B.complex.actions;

import ch3.variant.B.complex.entity.ComplexEntity;

public class Adder {
    public static ComplexEntity add(ComplexEntity c1, ComplexEntity c2) {
        return new ComplexEntity(c1.getdReal() + c2.getdReal(), c1.getdImaginary() + c2.getdImaginary());
    }
}
