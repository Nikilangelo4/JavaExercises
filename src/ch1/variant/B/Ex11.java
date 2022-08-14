package ch1.variant.B;

//элементы которые равны полусумме соседних элементов
public class Ex11 {
    public static void main(String[] args) {
        int[] arr = {1,2,35,21,3,2,1,1,1,2,4,1};
        int length = arr.length;
        for (int i = 1; i < length-1; i++) {
            if((arr[i-1] + arr[i+1])/2 == arr[i])
                System.out.println(arr[i]);
        }
    }
}
