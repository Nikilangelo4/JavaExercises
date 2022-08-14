package ch3.variant.B.complex.entity;

import java.util.Objects;

public class ComplexEntity {
    private final double dReal;
    private final double dImag;

    public ComplexEntity(double dReal, double dImag) {
        this.dReal = dReal;
        this.dImag = dImag;
    }

    public double getdReal() {
        return dReal;
    }

    public double getdImaginary() {
        return dImag;
    }

    @Override
    public String toString() {
        if (dImag >= 0) {
            return dReal + "+" + dImag + "i";
        } else
            return dReal + "" + dImag + "i";
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComplexEntity that = (ComplexEntity) o;
        return that.dReal == dReal && that.dImag == dImag;
    }

    @Override
    public int hashCode() {
        //return Objects.hash(dReal, dImag);
        int result = 1;
        result = 31 * result + (int) dReal;
        result = 31 * result + (int) dImag;
        return result;
    }


}
