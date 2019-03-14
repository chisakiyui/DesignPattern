package idea.designpattern.strategy;

/**
 * ConcreteStrategy1
 *
 * @Author:20644
 * @Date:2019/03/14
 */
public class ConcreteStrategy1 implements Strategy {

    @Override
    public void method() {
        System.out.println("strategy1");
    }

    @Override
    public void test() {
        System.out.println("test1");
    }

}
