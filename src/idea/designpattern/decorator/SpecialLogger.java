package idea.designpattern.decorator;

/**
 * SpecialLogger
 *
 * 具体Logger，被装饰的对象
 * 扩展该类的功能
 * @Author:20644
 * @Date:2019/03/15
 */
public class SpecialLogger implements Logger {

    @Override
    public void log() {
        System.out.println("SpecialLogger");
    }

    @Override
    public void logTest() {
        System.out.println("Special logTest");
    }
}
