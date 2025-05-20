public class Main {
    public static void main(String[] args) {
        Renderer openGL = new OpenGLRenderer();
        Renderer directX = new DirectXRenderer();

        Shape circleWithOpenGL = new Circle(openGL);
        Shape squareWithDirectX = new Square(directX);

        System.out.println(circleWithOpenGL.draw());
        System.out.println(squareWithDirectX.draw());
    }
}