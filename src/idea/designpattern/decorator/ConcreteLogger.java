package idea.designpattern.decorator;

/**
 * ConcreteLogger
 *
 * 具体Logger，被装饰的对象
 * 扩展该类的功能
 * @Author:20644
 * @Date:2019/03/15
 */
public class ConcreteLogger implements Logger {

    @Override
    public void log() {
        System.out.println("ConcreteLogger");
    }

    @Override
    public void logTest() {
        System.out.println("logger test!");
    }
}
