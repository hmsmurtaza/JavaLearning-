package isp_bad_implementation;

/**
 * Bus provides dummy implementation
 * for fly() method as it can't fly
 */
public class Bus implements Vehicle{
    @Override
    public void accelerate() {
        // ...
    }

    @Override
    public void applyBrakes() {
        //...
    }

    @Override
    public void fly() {
        // dummy implementation
    }
}
