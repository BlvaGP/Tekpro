public class Main {
    public static void main(String[] args) {
        UIFactory lightFactory = new LightUIFactory();
        Application lightApp = new Application(lightFactory);
        lightApp.renderUI();

        System.out.println("\nSwitching to Dark Theme:");
        UIFactory darkFactory = new DarkUIFactory();
        Application darkApp = new Application(darkFactory);
        darkApp.renderUI();
    }
}