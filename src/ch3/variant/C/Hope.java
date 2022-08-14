package ch3.variant.C;

public class Hope {
    static void action(){
        System.out.print(1);
    }
}
class Quest {
    static Hope hope;
    public static void main(String[] args) {
        Hope.action();
    }
}
