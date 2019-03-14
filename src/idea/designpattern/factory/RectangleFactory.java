package idea.designpattern.factory;

/**
 * 具体工厂-RectangleFactory
 */
public class RectangleFactory implements Provider {
    @Override
    public Shape produce() {
        return new Rectangle();
    }
}
