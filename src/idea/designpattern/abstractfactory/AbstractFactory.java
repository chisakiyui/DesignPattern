package idea.designpattern.abstractfactory;

/**
 * 抽象工厂
 */
public interface AbstractFactory {

    /**
     * 生产空调
     *
     * @return
     */
    IAirconditioner createAirconditoner();

    /**
     * 生产冰箱
     *
     * @return
     */
    IRefrigerator createRefrigerator();
}
