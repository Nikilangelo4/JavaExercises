package ch2.variant.C;

import java.lang.Math;
import java.util.Scanner;



public class Randomm {
    public static void main(String[] args) {
        double a = Math.random();
        //Cnstar c = new Cnstar(); !!! Error !!!
        System.out.println(a);
        System.out.println("Enter size:");
        Scanner sc = new Scanner(System.in);
        if(!sc.hasNextInt()) {
            System.err.println("Invalid argument");
            return;
        }
        int size = sc.nextInt();
        double[][] arr = new double[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size;j++) {
                arr[i][j] = (int) (Math.random() * 201) - 100;
                System.out.printf("%f\t",arr[i][j]);
            }
            System.out.println();
        }
        sc.close();
        Scanner scan = new Scanner("На голой ветке\n" +
                "Ворон сидит одиноко.\n" +
                "Осенний вечер.\n\n***" +
                " \n" +
                " \n" +
                "В небе такая луна,\n" +
                "Словно дерево спилено под корень:\n" +
                "Белеет свежий срез.\n\n***" +
                " \n" +
                " \n" +
                "Как разлилась река!\n" +
                "Цапля бредет на коротких ножках,\n" +
                "По колено в воде.");

        scan.useDelimiter("\n/*/*/*");

        while (scan.hasNext()) {
            System.out.println(scan.nextLine());
        }

        scan.close();
    }

}

class Cnstar {
    int a;
    Cnstar(int b){a = b;
        System.out.println(a);
    }
    static void d(){}
}