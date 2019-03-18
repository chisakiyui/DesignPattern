package idea.designpattern.simplefactory;

public class Main {
    public static void main(String[] args) {
        Shape circle = ShapeFactory.getShape("Circle");
        circle.draw();
    }
}
