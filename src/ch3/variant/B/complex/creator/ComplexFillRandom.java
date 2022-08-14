package ch3.variant.B.complex.creator;

import ch3.variant.B.complex.entity.ComplexEntity;

public class ComplexFillRandom {
    public static ComplexEntity fillRandom(double min, double max) {
        return new ComplexEntity(Math.random()*(min-max+1) + max,Math.random()*(min-max+1) + max);
    }
}
