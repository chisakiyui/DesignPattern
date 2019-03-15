package idea.designpattern.decorator;

/**
 * Function2
 *
 * 具体装饰器
 * 新增功能
 * @Author:20644
 * @Date:2019/03/15
 */
public class Function2 extends Decorator{

    Function2(Logger logger) {
        super(logger);
    }

    @Override
    public void log() {
        super.log();
        method();
    }

    public void method() {
        System.out.println("method2");
    }
}
