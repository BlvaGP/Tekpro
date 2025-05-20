public class DirectXRenderer implements Renderer {
    @Override
    public String renderShape(String shapeType) {
        return "Rendering " + shapeType + " using DirectX";
    }
}