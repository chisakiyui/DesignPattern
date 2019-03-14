package idea.designpattern.cglibproxy;

/**
 * Main
 *
 * cglib动态代理
 *
 * 相比jdk的模式，cglib少一个接口类，
 * 因为cglib返回的代理对象是目标对象的子类，
 * 而jdk产生的代理对象和目标对象都实现了一个公共接口
 *
 * 在运行时期，cglib会生成被代理对象的子类，并重写被代理对象的所有方法，从而作为代理对象
 * 所以：
 * 需要注意的是用final修饰的目标类，是不能生成代理子类的
 *
 * 应用：
 * 对一个类的所有方法做日志处理
 * 扩展原有功能，符合开闭原则，没有对目标类做任何修改
 *
 * @Author:20644
 * @Date:2019/03/13
 */
public class Main {
    public static void main(String[] args) {
        /**
         * 正常情况
         */
        Target target = new Target();
        Interceptor interceptor = new Interceptor(target);
        Target proxyObj = (Target) interceptor.createProxy();

        proxyObj.business();
        proxyObj.test();

        /**
         * FinalMethodTarget 的方法使用final修饰
         * FinalMethodTarget的方法能够执行，但是不会执行代理的方法，功能得不到扩展
         */
        FinalMethodTarget finalMethodTarget = new FinalMethodTarget();
        Interceptor finalMethodInterceptor = new Interceptor(finalMethodTarget);
        FinalMethodTarget finalMethodTargetProxy = (FinalMethodTarget) finalMethodInterceptor.createProxy();
        finalMethodTargetProxy.business();

        /**
         * FinalTarget 类使用final修饰，运行会报错，
         * 因为cglib会在运行时生成FinalTarget的子类，
         * 由于使用final修饰，无法生成子类，所以报错
         */
        /*FinalTarget finalTarget = new FinalTarget();
        Interceptor finalInterceptor = new Interceptor(finalTarget);
        FinalTarget finalTargetProxy = (FinalTarget) finalInterceptor.createProxy();
        finalTargetProxy.business();*/

    }
}
