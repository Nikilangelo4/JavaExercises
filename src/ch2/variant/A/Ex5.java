package ch2.variant.A;

import java.util.Arrays;

public class Ex5 {
    public static void main(String[] args) {
        int b = 1;
        int a = 10;
        int[] arr = new int[10];
        int sz = arr.length;
        for (int i = 0; i < sz; i++) {
            arr[i] = (int) (Math.random() * (b - a + 1) + a);
        }
        System.out.println("Source array: " + Arrays.toString(arr));
        int number = 0;
        for (int j : arr) {
            if (isEven(j)) {

                number++;
            }
        }
        System.out.println("Number of even numbers in array is: " + number);
    }
    static boolean isEven (int numb){
        while (numb != 0) {
            if (numb % 2 == 1)
                return false;
            numb /= 10;
        }
        return true;
    }
}
