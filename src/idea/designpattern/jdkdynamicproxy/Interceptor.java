package idea.designpattern.jdkdynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Interceptor
 * <p>
 * 拦截器
 *
 * @Author:20644
 * @Date:2019/03/13
 */
public class Interceptor implements InvocationHandler {

    private Object target;

    public Interceptor(Object target) {
        this.target = target;
    }

    /**
     * 可以在该方法里加强被代理类的功能
     *
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("切面编程start");
        for (Object object : args){
            System.out.println("args:" +object);
        }
        method.invoke(this.target, args);
        System.out.println("切面编程end");
        return null;
    }

}
