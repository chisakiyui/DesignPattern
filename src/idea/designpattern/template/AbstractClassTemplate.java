package idea.designpattern.template;

/**
 * AbstractClassTemplate
 *
 * 抽象类，给出执行的骨架，有的方法具体实现，有的方法抽象，交给子类来实现
 * （封装不变部分，扩展可变部分）
 *
 * @Author:20644
 * @Date:2019/03/14
 */
public abstract class AbstractClassTemplate {

    private boolean flag = false;

    public void template() {
        concreteMethod();
        if(flag){
            abstractMethod1();
        }
        abstractMethod2();
    }

    public void concreteMethod() {
        System.out.println("具体方法");
    }

    /**
     * 模板抽象方法，由子类具体实现
     */
    public abstract void abstractMethod1();

    /**
     * 模板抽象方法，由子类具体实现
     */
    public abstract void abstractMethod2();

    /**
     * 钩子方法
     * @return
     */
    protected boolean isFlag() {
        return true;
    }


}
