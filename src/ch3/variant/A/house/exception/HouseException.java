package ch3.variant.A.house.exception;

public class HouseException extends Exception{
    HouseException() {}
    HouseException(Throwable cause, String message){
        super(message,cause);
    }
    HouseException(String message){
        super(message);
    }
    HouseException(Throwable cause){
        super(cause);
    }

}