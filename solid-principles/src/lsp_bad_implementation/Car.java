package lsp_bad_implementation;

public class Car {
    public void fuel() {
        System.out.println("in Car::fuel()");
    }

    public void wheels() {
        System.out.println("in Car::wheels()");
    }

    public void run() {
        System.out.println("in Car::run()");
    }

    public static void main(String[] args) {
        Car car = new Car();

        car.fuel();
        car.wheels();
        car.run();
    }
}
