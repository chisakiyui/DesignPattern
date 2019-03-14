package idea.designpattern.factory;

/**
 * 具体产品-Circle
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("圆形");
    }
}
