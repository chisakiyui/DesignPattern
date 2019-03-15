package idea.designpattern.observer;

/**
 * Main
 *
 * 观察者模式
 *
 * 多个对象间存在一对多的依赖关系
 * 当一个对象的状态发生改变时
 * 所有依赖它的对象都得到通知并自动更新
 *
 * 降低了目标和观察者之间的耦合关系
 *
 * 注意目标对象和具体观察者对象之间不能直接调用，否则将使两者紧密耦合起来
 *
 * 主要角色：抽象主题角色、具体主题角色、抽象观察者角色、具体观察者角色
 * @Author:20644
 * @Date:2019/03/15
 */
public class Main {
    public static void main(String[] args) {
        Company alibaba = new Alibaba();
        Rate rate = new RMBRate();
        rate.add(alibaba);

        rate.change(10);
    }
}
