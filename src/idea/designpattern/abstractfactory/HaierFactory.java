package idea.designpattern.abstractfactory;

/**
 * HaierFactory
 *
 * 具体工厂：生产一个产品族
 * @Author:20644
 * @Date:2019/03/18
 */
public class HaierFactory implements AbstractFactory{
    @Override
    public IAirconditioner createAirconditoner() {
        return new HaierAirConditioner();
    }

    @Override
    public IRefrigerator createRefrigerator() {
        return new HaierRefrigerator();
    }
}
