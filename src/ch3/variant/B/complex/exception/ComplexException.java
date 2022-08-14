package ch3.variant.B.complex.exception;

public class ComplexException extends Exception{
    ComplexException() {
    }
    ComplexException(Throwable cause , String message){
        super(message,cause);
    }
    ComplexException(String message){
        super(message);
    }
    ComplexException(Throwable cause){
        super(cause);
    }
}
