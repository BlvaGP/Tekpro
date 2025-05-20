public class Circle extends Shape {
    public Circle(Renderer renderer) {
        super(renderer);
    }

    @Override
    public String draw() {
        return renderer.renderShape("Circle");
    }
}