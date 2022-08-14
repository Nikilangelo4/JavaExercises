package ch2.variant.A;

import java.util.Arrays;



public class Ex3 {
    public static void main(String[] args) {
        int b = 1;
        int a = 200;
        int[] arr = new int[50];
        int sz = arr.length;
        for (int i = 0; i < sz; i++) {
            arr[i] = (int) (Math.random() * (b - a + 1) + a);
        }
        System.out.println("Source array: " + Arrays.toString(arr));
        int avg = 0;
        for (int j : arr) {
            avg = lengthOfNumber(j) + avg;
        }
        avg = avg/sz;
        System.out.println("Average: " + avg);
        System.out.println("Numbers with length less than avg: ");
        for (int i: arr) {
            int length = lengthOfNumber(i);
            if(length < avg) {
                System.out.println("Number - "+i+" length: "+length);
            }
        }
    }
    static int lengthOfNumber(int numb) {
        int length = 0;
        while(numb!=0) {
            length++;
            numb/=10;
        }
        return length;
    }
}
