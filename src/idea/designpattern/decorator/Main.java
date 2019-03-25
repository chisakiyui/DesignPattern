package idea.designpattern.decorator;

/**
 * Main
 *
 * 装饰器模式要求被装饰的类需要实现一个接口
 *
 * 装饰器负责增强这个接口里的方法
 *
 * 缺点：如果接口里新增了方法，后续的改动会比较多
 * 需要修改 具体被装饰的类，装饰器类
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
        decorator1.logTest();
    }
}
