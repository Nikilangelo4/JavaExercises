package ch1.variant.B;

import java.util.Arrays;

//Отсортированные числа в порядке возрастания и убывания
//Сортировка выбором (Selection sort)
public class Ex7 {
    public static void main(String[] args) {
        int sz = 20;
        int[] arr = new int[sz];
        int min = 90;
        int max = 300;
        for (int i = 0; i < sz; i++) {
            arr[i] = (int) (Math.random() * (min - max + 1) + max);
        }
        System.out.println(Arrays.toString(arr));
        for(int i = 0; i < sz; i++) {
            int indexOfMinElement = i;
            for (int j = i+1; j < sz; j++) {
                if(arr[j] < arr[indexOfMinElement]) {
                    indexOfMinElement = j;
                    int buf = arr[indexOfMinElement];
                    arr[indexOfMinElement] = arr[i];
                    arr[i] = buf;
                }

            }
            System.out.print(arr[i]+ " ");
        }
        //System.out.println(Arrays.toString(arr));
    }
}
