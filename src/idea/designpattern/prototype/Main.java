package idea.designpattern.prototype;

/**
 * Main
 *
 * @Author:20644
 * @Date:2019/03/14
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        /**
         * 深拷贝
         * 两个对象相互独立，互不影响
         */
        Prototype prototype = new Prototype();
        prototype.add("A");
        Prototype clone = prototype.clone();
        clone.add("B");
        System.out.println("prototype："+prototype.getList());
        System.out.println("clone："+clone.getList());

        /**
         * 浅拷贝
         */
        SimplePrototype simplePrototype = new SimplePrototype();
        simplePrototype.add("C");
        SimplePrototype simpleClone = simplePrototype.clone();
        simpleClone.add("D");
        System.out.println("simplePrototype："+simplePrototype.getList());
        System.out.println("simpleClone："+simpleClone.getList());

    }
}
