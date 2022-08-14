package ch1.variant.B;
// вывести простые числа
import java.util.Arrays;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        System.out.println("Enter size of array: ");
        Scanner scanner = new Scanner(System.in);
        int sz = scanner.nextInt();
        int[] arr = new int[sz];
        int min = 1;
        int max = 20;
        for (int i = 0; i < sz; i++) {
            arr[i] = (int)(Math.random()*(min-max+1)+max);
        }
        System.out.println(Arrays.toString(arr));
        for (int j = 0; j < sz; j++) {
            boolean isPrime = true;
            for (int i = 2; i < (int) Math.sqrt(arr[i]); i++) {
                if (arr[j] % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                System.out.println(arr[j] + " ");
            }
        }

    }
}
