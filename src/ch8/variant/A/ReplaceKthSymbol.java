package ch8.variant.A;

import java.util.Scanner;

public class ReplaceKthSymbol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter k: ");
        int k = scanner.nextInt() - 1;
        scanner.nextLine();
        System.out.println("Enter symbol: ");
        char symbol = scanner.next().charAt(0);
        String text = "But ultra-distance and mountain runner Kilian Jornet Burgada ascended the mountain in May 2017 alone, without an oxygen mask or fixed ropes for climbing.";
        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            StringBuilder buff = new StringBuilder(words[i]);
            if(words[i].length() > k){
                buff.setCharAt(k,symbol);
                words[i] = buff + " ";
            }
            else{
                words[i] = buff + " ";
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(word);
        }
        String str = sb.toString().trim();
        System.out.println(str);
    }
}
