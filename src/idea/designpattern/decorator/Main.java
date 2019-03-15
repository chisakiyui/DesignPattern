package idea.designpattern.decorator;

/**
 * Main
 *
 * @Author:20644
 * @Date:2019/03/15
 */
public class Main {
    public static void main(String[] args) {
        Logger concreteLogger = new ConcreteLogger();
        //原有的log功能
        concreteLogger.log();
        System.out.println("********");
        Decorator decorator = new Function1(concreteLogger);
        //装饰Function1以后的log功能
        decorator.log();
        System.out.println("********");
        Decorator decorator1 = new Function2(concreteLogger);
        //装饰Function2以后的log功能
        decorator1.log();
    }
}
