package lsp_good_implementation;

public class TeslaRealCar extends RealCar{
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
        var teslaRealCar = new TeslaRealCar();

        teslaRealCar.fuel();
        teslaRealCar.wheels();
        teslaRealCar.run();
    }
}
