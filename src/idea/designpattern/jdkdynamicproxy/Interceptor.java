package idea.designpattern.jdkdynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Interceptor
 *
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

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("切面编程start");
        method.invoke(this.target,args);
        System.out.println("切面编程end");
        return null;
    }

}
