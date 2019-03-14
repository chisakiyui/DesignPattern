package idea.designpattern.simplefactory;

/**
 * 创建一个工厂，基于输入的形状来生成对应的实例对象
 * 使用 if-else，仍然没有遵循 “开-闭 原则”
 * 如果需要新增一种 Shape，就需要修改ShapeFactory这个工厂类
 */
public class ShapeFactory {

    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("Circle")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("Square")) {
            return new Square();
        }
        return null;
    }

}
