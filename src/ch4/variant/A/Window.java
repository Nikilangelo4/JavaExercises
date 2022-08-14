package ch4.variant.A;

import java.util.Objects;

public class Window {

    int numberOfWindows;

    public Window(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Window window = (Window) o;
        return numberOfWindows == window.numberOfWindows;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfWindows);
    }
}
