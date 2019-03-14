package idea.designpattern.jdkdynamicproxy;

/**
 * Target
 *
 * @Author:20644
 * @Date:2019/03/13
 */
public class Target implements ITarget {

    @Override
    public void business() {
        System.out.println("target business");
    }

}
