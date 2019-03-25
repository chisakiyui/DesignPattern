package idea.designpattern.jdkdynamicproxy;

/**
 * Target
 *
 * @Author:20644
 * @Date:2019/03/13
 */
public class Target implements ITarget {

    @Override
    public void business(String str) {
        System.out.println("target "+str);
    }

    @Override
    public void method(String str, int i) {
        System.out.println("str = "+str);
        System.out.println("i = "+i);
    }

}
