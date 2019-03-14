package idea.designpattern.factory;
/**
 * 具体产品-Square
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("正方形");
    }
}
