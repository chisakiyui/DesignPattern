package idea.designpattern.observer;

/**
 * RMBRate
 * 具体被观察者：人民币汇率
 *
 * 一个被观察者对应多个观察者
 * 多个观察者:Alibaba,Tecent 都依赖 RMBRate
 * @Author:20644
 * @Date:2019/03/15
 */
public class RMBRate extends Rate {
    @Override
    public void change(int number) {
        System.out.println("人民币汇率自身发生改变");
        /**
         * 遍历所有观察者对象，通知他们被观察的对象发生变化
         */
        for (Company obs : companys) {
            obs.response(number);
        }
    }
}
