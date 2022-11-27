public class Tester {
    public static void main(String[] args) {
        Button button = new Button();
        ClickHandler clickHandler = new ClickHandler();
        // pass the clickHandler to do the default operation
        button.onClick(clickHandler);

        Button button1 = new Button();
        // pass the interface to implement own/custom operation
        button1.onClick(new ClickEventHandler() {       // Lambda: () -> System.out.println("Button clicked")
            @Override
            public void handleClick() {
                System.out.println("Button clicked!");
            }
        });

//        button1.onClick(new ClickHandler());
    }
}
