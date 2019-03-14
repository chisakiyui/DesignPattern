package idea.designpattern.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * Prototype
 *
 * 深拷贝
 * @Author:20644
 * @Date:2019/03/14
 */
public class Prototype implements Cloneable {

    private String name;
    private Integer age;
    private List list = new ArrayList();

    public Prototype clone() throws CloneNotSupportedException {
        Prototype clone = (Prototype) super.clone();

        /**
         * 如果没有这一行就是浅拷贝，有这一行就是深拷贝
         *
         * Object类提供的方法clone只是拷贝本对象，
         * 其对象内部的数组、引用对象等都不拷贝，(String Integer这种包装类型除外)
         * 还是指向原生对象的内部元素地址， 这种拷贝就叫做浅拷贝。
         *
         * 对象拷贝时，构造函数是不会执行的
         * final类型修饰的成员变量不能进行深拷贝
         *
         */
        clone.list = (ArrayList)((ArrayList)this.list).clone();

        return clone;
    }

    public void add(String str) {
        list.add(str);
    }

    public List getList() {
        return list;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}
