package idea.designpattern.factory;
/**
 * 具体产品-Rectangle
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("矩形");
    }
}
