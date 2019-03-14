package idea.designpattern.staticproxy;

/**
 * Main
 *
 * 代理模式这种设计模式是一种使用代理对象来执行目标对象的方法并
 * 在代理对象中增强目标对象方法的一种设计模式。代理对象代为执行
 * 目标对象的方法，并在此基础上进行相应的扩展。
 *
 * 降低了系统的耦合度
 * 代理对象可以在客户端和目标对象间起到中介的作用，起到了保护目标对象的作用
 * 可以扩展目标对象的功能
 *
 * Spring的AOP机制就是采用动态代理的机制来实现切面编程的
 *
 * 这里是静态代理
 * @Author:20644
 * @Date:2019/03/13
 */
public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("马云");
        Car4S proxy = new Car4S();
        proxy.setCustomer(customer);
        proxy.setName("成都4S店");
        proxy.buyCar();
    }
}
