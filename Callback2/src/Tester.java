public class Tester {
    public static void main(String[] args) {
        EventHandler eventHandler = new EventHandler();
        EventGenerator eventGenerator = new EventGenerator();
        eventGenerator.generator(eventHandler);

        eventGenerator.generator(new AnyEventHandler() {
            @Override
            public void handleAnyEvent() {
                System.out.println("custom event generated");
            }
        });
    }
}
