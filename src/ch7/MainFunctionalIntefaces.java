package ch7;

public class MainFunctionalIntefaces {
    public static void main(String[] args) {
        ToBooleanFunctionInt toBooleanFunctionInt = (a) -> a % 13 == 0;
        BiFunctionString biFunctionString = (string1,string2) -> string2;
        System.out.println(biFunctionString.apply("12345","123456789"));
        System.out.println(toBooleanFunctionInt.apply(13));
        System.out.println(toBooleanFunctionInt.apply(14));
        System.out.println(toBooleanFunctionInt.apply(26));
    }
}
