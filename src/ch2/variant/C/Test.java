package ch2.variant.C;

public class Test {

    public static void main(String[] args) {
            for (int i = 0, j = 0; i < 3 && j <= 0; i++, j--) {
                if (i != j) continue;
                System.out.print (i + " " + j);
            }
        }
}
