public class LightUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new LightButton();
    }

    @Override
    public Panel createPanel() {
        return new LightPanel();
    }
}