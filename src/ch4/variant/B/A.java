package ch4.variant.B;

public class A {
    A() {
        System.out.print(0);
    }
    A(int i) {
        System.out.print(i);
    }
}
class B extends A {
    B(){super(1);}
    B(int i){}
    public static void main(String[] args) {
        new B();
        new B(2);
    }
}