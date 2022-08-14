package ch5;

import java.util.Objects;

enum Size {BIG, SMALL, MEDIUM}

public class Mobile {

    private String operationSystem;
    private Characteristics characteristics;

    Mobile(String model, String color, Size size,String operationSystem) {
        characteristics = new Characteristics(model,color,size);
        this.operationSystem = operationSystem;
    }

    public class Characteristics {

        private String model;
        private String color;
        private Size size;

        public Characteristics(String model, String color, Size size) {
            this.model = model;
            this.color = color;
            this.size = size;
        }

        public Characteristics(String model, String color) {
            this(model, color, Size.MEDIUM);
        }

        public Characteristics(String model) {
            this(model, "Blue", Size.MEDIUM);
        }

        public Characteristics() {
            this("Samsung", "Blue", Size.MEDIUM);
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("Characteristics{");
            sb.append("model='").append(model).append('\'');
            sb.append(", color='").append(color).append('\'');
            sb.append(", size=").append(size);
            sb.append('}');
            return sb.toString();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Characteristics that = (Characteristics) o;
            return Objects.equals(model, that.model) && Objects.equals(color, that.color) && size == that.size;
        }

        @Override
        public int hashCode() {
            return Objects.hash(model, color, size);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mobile mobile = (Mobile) o;
        return Objects.equals(operationSystem, mobile.operationSystem) && Objects.equals(characteristics, mobile.characteristics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operationSystem, characteristics);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Mobile{");
        sb.append("operationSystem='").append(operationSystem).append('\'');
        sb.append(", characteristics=").append(characteristics);
        sb.append('}');
        return sb.toString();
    }
}
