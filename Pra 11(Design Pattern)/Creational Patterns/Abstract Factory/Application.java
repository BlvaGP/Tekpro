public class Application {
    private UIFactory uiFactory;

    public Application(UIFactory uiFactory) {
        this.uiFactory = uiFactory;
    }

    public void renderUI() {
        Button button = uiFactory.createButton();
        Panel panel = uiFactory.createPanel();
        System.out.println("Rendering UI:");
        System.out.println(button.render());
        System.out.println(panel.render());
    }
}