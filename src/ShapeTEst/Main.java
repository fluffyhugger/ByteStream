package ShapeTEst;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        RedShapeDecorator redShapeDecorator = new RedShapeDecorator(circle);
        redShapeDecorator.draw();

        Rectangle rectangle = new Rectangle();
        RedShapeDecorator redShapeDecorator1 = new RedShapeDecorator(rectangle);
        redShapeDecorator1.draw();
    }
}