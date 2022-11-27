package lsp_bad_implementation;

public class TeslaToyCar extends Car{
    @Override
    public void fuel() {
        //throw new IllegalStateException("Not supported");
    }

    @Override
    public void wheels() {
        super.wheels();
        System.out.println("in TeslaToyCar::wheels()");
    }

    @Override
    public void run() {
        super.run();
        System.out.println("in TeslaToyCar::run()");
    }

    public static void main(String[] args) {
        TeslaToyCar teslaToyCar = new TeslaToyCar();

        teslaToyCar.fuel();
        teslaToyCar.run();
        teslaToyCar.wheels();
    }
}
