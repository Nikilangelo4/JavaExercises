package ch4.variant.A;

import java.util.Objects;

public class House {
    private String address;
    private Door doors;
    private Window windows;

    public House(Door doors, Window windows, String address) {
        this.address = address;
        this.doors = doors;
        this.windows = windows;
    }

    public Door getDoors() {
        return doors;
    }

    public Window getWindows() {
        return windows;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return Objects.equals(doors, house.doors) && Objects.equals(windows, house.windows);
    }

    @Override
    public int hashCode() {
        return Objects.hash(doors, windows);
    }

    @Override
    public String toString() {
        return "House{" + "doors=" + doors +
                ", windows=" + windows +
                ", address=" + address +
                '}';
    }

    public void numberOfDoorsAndWindows(){
        System.out.println("Number of doors: "+ this.doors +"\n Number of windows: " + this.windows);
    }

    public static void main(String[] args) {
        House house = new House(new Door(1),new Window(5),"Minsk, prospect Gazety Pravdy, 22 ");
        System.out.println(house);
        house.numberOfDoorsAndWindows();
        House house1 = new House(new Door(1),new Window(5),"Minsk, prospect Gazety Pravdy, 22 ");
        System.out.println(house.equals(house1));
    }
}


