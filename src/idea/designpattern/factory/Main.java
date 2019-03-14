package idea.designpattern.factory;

/**
 * 抽象工厂模式
 * 符合开闭原则
 * 如果想新增一种Shape,只需要新增具体实现类以及该生产类的工厂（新增具体产品和对应的具体工厂）
 * 不需要修改任何其他代码
 *
 * 具体工厂实现抽象工厂
 * 具体产品实现抽象产品
 * 在使用中：抽象工厂根据客户端需求生成具体的产品
 *
 */
public class Main {
    public static void main(String[] args) {
        Provider provider = new CircleFactory();
        Shape circle = provider.produce();
        circle.draw();
    }
}
