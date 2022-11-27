package isp_good_implementation;

/**
 * Aeroplane implements both Flyable and Vehicle as
 * it can fly too
 */
public class Aeroplane implements Flyable, Vehicle{
    @Override
    public void fly() {
        //...
        System.out.println("Aeroplane::fly()");
    }

    @Override
    public void accelerate() {
        //...
        System.out.println("Aeroplane::accelerate()");
    }

    @Override
    public void applyBrakes() {
        //...
        System.out.println("Aeroplane::applyBrakes()");
    }

    public static void main(String[] args) {
        var aeroplane = new Aeroplane();
        aeroplane.accelerate();
        aeroplane.fly();
        aeroplane.applyBrakes();
    }
}
