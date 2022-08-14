package ch2.variant.B;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        System.out.println("Enter sizes");
        Scanner scan = new Scanner(System.in);
        System.out.println("Number of rows:");
        int rows = scan.nextInt();
        System.out.println("Number of cols:");
        int cols = scan.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                System.out.printf("%d\t", i * j);
            }
            System.out.println();
        }

    }
}
