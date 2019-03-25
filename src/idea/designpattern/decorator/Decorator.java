package idea.designpattern.decorator;

/**
 * Decorator
 *
 * 装饰器，拓展log()功能
 *
 * 实现Logger接口并且拥有一个Logger成员
 *
 * @Author:20644
 * @Date:2019/03/15
 */
public class Decorator implements Logger {
    protected Logger logger;

    Decorator(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void log() {
        if (logger != null) {
            logger.log();
        }
    }

    @Override
    public void logTest() {
        if (logger != null) {
            logger.logTest();
        }
    }
}
