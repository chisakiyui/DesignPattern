package idea.designpattern.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Interceptor
 *
 * 拦截器
 * 实现MethodInterceptor接口，需要引入jar包 cglib-nodep-2.1_3.jar
 * @Author:20644
 * @Date:2019/03/13
 */
public class Interceptor implements MethodInterceptor {

    private Object target;

    public Interceptor(Object target){
        this.target = target;
    }

    /**
     * 返回代理对象
     * @return
     */
    public Object createProxy() {
        Enhancer enhancer = new Enhancer();
        //回调函数  拦截器
        enhancer.setCallback(this);
        //设置代理对象的父类,可以看到代理对象是目标对象的子类。所以这个接口类就可以省略了。
        enhancer.setSuperclass(this.target.getClass());
        return enhancer.create();
    }

    /**
     * 目标方法
     *
     * @param o
     * @param method
     * @param objects
     * @param methodProxy
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("执行方法："+method.getName());
        System.out.println("cglib 动态代理 start");
        method.invoke(this.target,objects);
        System.out.println("cglib 动态代理 end");
        return null;
    }
}
