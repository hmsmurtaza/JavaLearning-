public class EventHandler implements AnyEventHandler{
    @Override
    public void handleAnyEvent() {
        System.out.println("default event generated");
    }
}
