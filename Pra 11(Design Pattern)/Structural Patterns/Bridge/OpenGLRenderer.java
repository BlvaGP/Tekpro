public class OpenGLRenderer implements Renderer {
    @Override
    public String renderShape(String shapeType) {
        return "Rendering " + shapeType + " using OpenGL";
    }
}