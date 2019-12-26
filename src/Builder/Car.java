package Builder;

public class Car {
    private String name;
    private int power;
    private String color;

    public Car(Builder builder) {
        this.name = builder.name;
        this.color = builder.color;
        this.power = builder.power;
    }

    public static class Builder {
        private String name;
        private int power;
        private String color;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setPower(int power) {
            this.power = power;
            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", power=" + power +
                ", color='" + color + '\'' +
                '}';
    }
}

class Test {
    public static void main(String[] args) {
        Car car = new Car.Builder().setName("qwe").setColor("red").setPower(100).build();
        System.out.println(car);
    }
}
