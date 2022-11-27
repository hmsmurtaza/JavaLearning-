package lsp_bad_implementation;

public class TeslaRealCar extends Car{
    @Override
    public void fuel() {
        super.fuel();
        System.out.println("in TeslaRealCar::fuel()");
    }

    @Override
    public void wheels() {
        super.wheels();
        System.out.println("in TeslaRealCar::wheels()");
    }

    @Override
    public void run() {
        super.run();
        System.out.println("in TeslaRealCar::run()");
    }

    public static void main(String[] args) {
        TeslaRealCar teslaRealCar = new TeslaRealCar();

        teslaRealCar.fuel();
        teslaRealCar.run();
        teslaRealCar.wheels();
    }
}
