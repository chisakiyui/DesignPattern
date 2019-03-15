package idea.designpattern.decorator;

/**
 * Function1
 *
 * 具体装饰器
 * 新增功能
 * @Author:20644
 * @Date:2019/03/15
 */
public class Function1 extends Decorator {
    Function1(Logger logger) {
        super(logger);
    }

    @Override
    public void log() {
        super.log();
        method();
    }

    public void method() {
        System.out.println("method1");
    }
}
