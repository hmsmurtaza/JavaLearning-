package lsp_good_implementation;

public class RealCar extends Car{
    public void fuel() {
        System.out.println("in RealCar::fuel()");
    }

    @Override
    public void wheels() {
        super.wheels();
        System.out.println("in RealCar::wheels()");
    }

    @Override
    public void run() {
        super.run();
        System.out.println("in RealCar::run()");
    }
}
