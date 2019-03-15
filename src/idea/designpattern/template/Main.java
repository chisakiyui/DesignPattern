package idea.designpattern.template;

/**
 * Main
 * 模板模式
 *
 * @Author:20644
 * @Date:2019/03/14
 */
public class Main {
    public static void main(String[] args) {
        AbstractClassTemplate concreteClass = new ConcreteClass();
        concreteClass.template();

        AbstractClassTemplate specialClass = new SpecialClass();
        specialClass.template();
    }
}
