package ch1.variant.A;

import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        int sz = args[0].length();
        int number = 0;
        for (int i = 0; i < sz; i++) {
            number = args[0].charAt(i)-'0' + number * 10;
        }
        Random random = new Random();
        int newnumb = number;
        while (number != 0) {
            int numb = random.nextInt();
            System.out.print(numb+" ");
            number--;
        }
        System.out.println();
        while (newnumb != 0) {
            int numb = random.nextInt();
            System.out.println(numb);
            newnumb--;
        }

    }
}
