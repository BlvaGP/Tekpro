public class DarkUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public Panel createPanel() {
        return new DarkPanel();
    }
}