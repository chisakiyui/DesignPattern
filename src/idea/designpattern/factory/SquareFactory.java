package idea.designpattern.factory;

/**
 * 具体工厂-SquareFactory
 */
public class SquareFactory implements Provider {
    @Override
    public Shape produce() {
        return new Square();
    }
}
