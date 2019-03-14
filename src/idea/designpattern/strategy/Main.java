package idea.designpattern.strategy;

/**
 * Main
 * <p>
 * 策略模式属于对象的行为模式
 * 针对一组算法，将每一个算法封装在具有共同接口的独立的类中，
 * 从而使得它们可以相互替换
 * <p>
 * 涉及到三个角色：
 * 1.环境角色 Context
 * 2.抽象策略角色
 * 3.具体策略角色
 *
 * @Author:20644
 * @Date:2019/03/14
 */
public class Main {
    public static void main(String[] args) {
        Strategy strategy = new ConcreteStrategy1();
        Context context = new Context(strategy);
        context.method();
        context.test();
    }
}
