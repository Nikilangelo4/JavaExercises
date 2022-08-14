package ch1.variant.B;

import java.util.Arrays;

//Все трехзначные числа, в десятичной записи которых нет одинаковых
//цифр.
public class Ex5 {
    public static void main(String[] args) {
        int sz = 20;
        int[] arr = new int[sz];
        int min = 90;
        int max = 300;
        for (int i = 0; i < sz; i++) {
            arr[i] = (int) (Math.random() * (min - max + 1) + max);
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < sz; i++) {
            int number = arr[i];
            if(Integer.toString(number).length() == 3) {
                boolean hasUniqueDigits = true;
                char[] arr2 = Integer.toString(number).toCharArray();
                for (int j = 0; j < 3; j++) {
                    for (int k = j; k < 3; k++) {
                        if (k + 1 != 3 && arr2[k] == arr2[k + 1]) {
                            hasUniqueDigits = false;
                            break;
                        }
                    }
                }
                if(hasUniqueDigits) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }
}
