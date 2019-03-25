package idea.designpattern.jdkdynamicproxy;

import java.lang.reflect.Proxy;

/**
 * Main
 *
 * 动态代理模式
 *
 * 代理对象是由jvm生成的，不像静态代理，需要自己new一个代理对象出来
 * 生成的代理对象也实现了目标对象实现的接口
 * 因为这个代理对象是jdk相关代码生成的，所以这个称为jdk动态代理
 *
 * 相比静态代理，当ITarget新增一个方法时，只需要修改Target类就够了，不用修改代理类，
 * 由于静态代理的代理类实现了ITarget方法，所以静态代理的代码维护成本更高
 *
 * @Author:20644
 * @Date:2019/03/13
 */
public class Main {
    public static void main(String[] args) {
        /**目标对象*/
        Target target = new Target();
        /**拦截器*/
        Interceptor interceptor = new Interceptor(target);
        /**
         * 调用系统方法生成代理对象
         */
        ITarget iTarget = (ITarget) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                interceptor
        );

        iTarget.business("business");
        iTarget.method("method",1);
    }
}
