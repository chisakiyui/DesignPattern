package idea.designpattern.strategy;

/**
 * Context
 * <p>
 * 环境角色
 * 持有策略的引用，最终给客户端调用
 *
 * @Author:20644
 * @Date:2019/03/14
 */
public class Context {

    private Strategy strategy;

    /**
     * 构造函数，传入一个具体策略对象
     */
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 策略方法
     */
    public void method() {
        this.strategy.method();
    }

    /**
     * 策略方法
     */
    public void test() {
        this.strategy.test();
    }
}
