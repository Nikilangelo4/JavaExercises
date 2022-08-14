package ch2.variant.A;

import java.util.Scanner;

//6. Найти число, цифры в котором идут в строгом порядке возрастания. Если
//таких чисел несколько, найти первое из них.
public class Ex6 {
    public static void main(String[] args) {
        System.out.println("Enter n: ");
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        System.out.println(length);
        int[] arr;
        arr = new int[length];
        System.out.println("Enter elements:");
        for (int i = 0; i < length; i++) {
            boolean flag = true;
            arr[i] = scan.nextInt();
            int numb = arr[i];
            if (numb / 10 == 0) {
                System.out.println(arr[i]);
                continue;
            }
            while (numb != 0) {
                int a1 = numb % 10;
                if (numb / 10 == 0) {
                    break;
                }
                int a2 = numb / 10 % 10;
                if (a2 >= a1) {
                    flag = false;
                    break;
                }
                numb /= 10;
            }
            if (flag)
                System.out.println(arr[i]);
        }
    }
}
