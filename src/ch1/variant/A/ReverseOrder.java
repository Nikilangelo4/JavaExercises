package ch1.variant.A;

public class ReverseOrder {
    public static void main(String[] args) {
        int length = args[0].length() - 1;
        for (int x = length; x >= 0; x--) {
            System.out.print(args[0].charAt(x));
        }
    }
}
