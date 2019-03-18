package idea.designpattern.abstractfactory;

/**
 * GreeFactory
 *
 * 具体工厂：生产一个产品族
 * @Author:20644
 * @Date:2019/03/18
 */
public class GreeFactory implements AbstractFactory {

    @Override
    public IAirconditioner createAirconditoner() {
        return new GreeAirConditioner();
    }

    @Override
    public IRefrigerator createRefrigerator() {
        return new GreeRefrigerator();
    }
}
