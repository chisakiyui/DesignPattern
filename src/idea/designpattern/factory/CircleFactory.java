package idea.designpattern.factory;

/**
 * 具体工厂-CircleFactory
 */
public class CircleFactory implements Provider {

    @Override
    public Shape produce() {
        return new Circle();
    }
}
