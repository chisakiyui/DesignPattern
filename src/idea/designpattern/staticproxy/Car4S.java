package idea.designpattern.staticproxy;

/**
 * Car4S
 * 代理类
 *
 * @Author:20644
 * @Date:2019/03/13
 */
public class Car4S implements ICustumer {

    private Customer customer;

    private String name;

    /**
     * 对buyCar方法进行增强和扩展
     */
    @Override
    public void buyCar() {
        customer.buyCar();
        System.out.println(name+"向客户："+customer.getName()+"卖出一俩车");
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setName(String name) {
        this.name = name;
    }


}
