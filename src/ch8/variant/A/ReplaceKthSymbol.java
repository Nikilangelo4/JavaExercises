package ch8.variant.A;

import java.util.Scanner;

public class ReplaceKthSymbol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter k: ");
        int k = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter symbol: ");
        String symbol = scanner.next();
        String text = "But ultra-distance and mountain runner Kilian Jornet Burgada ascended the mountain in May 2017 alone, without an oxygen mask or fixed ropes for climbing.\n" +
                "Oh, and he did it in 26 hours.\n" +
                "With food poisoning.\n" +
                "And then, five days later, he did it again, this time in only 17 hours.";
        //String text2 = text.replaceAll("\n"," ");
        System.out.println(text);
        String regexsd = "."+"{"+k+"}"+"(.)";
        String regex12 = ".{3}(.)";
        String text2 = text.replaceAll(regex12,symbol);
        System.out.println(text2);


    }
}
