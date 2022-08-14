package ch4.variant.A;

import java.util.Objects;

public class Door {
    int numberOfDoors;

    public Door(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Door door = (Door) o;
        return numberOfDoors == door.numberOfDoors;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfDoors);
    }
}
