package ch1.variant.A;

public class Password {
    public static void main(String[] args) {
        String password = "12345";

            if(password.compareTo(args[0]) == 0) {
                System.out.println("Right password");
            }
            else {
                System.out.println("Wrong password");
            }

    }
}
