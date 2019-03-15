package idea.designpattern.template;

/**
 * SpecialClass
 *
 * @Author:20644
 * @Date:2019/03/15
 */
public class SpecialClass extends AbstractClassTemplate{

    @Override
    public void abstractMethod1() {
        System.out.println("SpecialClass abstractMethod1方法");
    }

    @Override
    public void abstractMethod2() {
        System.out.println("SpecialClass abstractMethod2方法");
    }

    @Override
    public boolean doGetFlag(){
        //do something
        return true;
    }

}
