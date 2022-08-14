package ch1.variant.A;

public class IntegerNumbers {
    public static void main(String[] args) {
        int sz = args.length;
        int sum = 0;
        int product = 1;
        for (String arg : args) {
            sum += Integer.parseInt(arg);
            product *= Integer.parseInt(arg);
        }
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }
}
