package ch5;

public class MobileMain {
    public static void main(String[] args) {
        Mobile iphone10xs = new Mobile("Iphone","Blue",Size.BIG,"IOS");
        Mobile iphone10x = new Mobile("Iphone","Blue",Size.BIG,"IOS");
        Mobile.Characteristics characteristics = new Mobile("Iphone","Blue",Size.BIG,"IOS").new Characteristics();
        System.out.println(iphone10x);
        System.out.println(iphone10xs);
        System.out.println(iphone10xs.equals(iphone10x));
    }
}
