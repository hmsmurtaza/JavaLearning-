package lsp_good_implementation;

public class TeslaToyCar  extends Car{
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
        var teslaToyCar = new TeslaToyCar();

        teslaToyCar.wheels();
        teslaToyCar.run();
    }
}
