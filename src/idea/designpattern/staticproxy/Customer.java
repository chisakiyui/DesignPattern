package idea.designpattern.staticproxy;

/**
 * Customer
 *
 * @Author:20644
 * @Date:2019/03/13
 */
public class Customer implements ICustumer {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void buyCar() {
        System.out.println(this.name + "买了一辆车");
    }
}
