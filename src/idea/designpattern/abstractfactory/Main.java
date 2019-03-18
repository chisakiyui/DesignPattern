package idea.designpattern.abstractfactory;

/**
 * Main
 *
 * @Author:20644
 * @Date:2019/03/18
 */
public class Main {
    public static void main(String[] args) {
        AbstractFactory greeFactory = new GreeFactory();
        AbstractFactory haierFactory = new HaierFactory();

        IAirconditioner greeAirConditioner = greeFactory.createAirconditoner();
        IRefrigerator greeRefrigerator = greeFactory.createRefrigerator();

        IAirconditioner haierAirConditioner = haierFactory.createAirconditoner();
        IRefrigerator haierRefrigerator = haierFactory.createRefrigerator();

        System.out.println("格力产品；");
        greeAirConditioner.cryogen();
        greeRefrigerator.preserveFood();

        System.out.println("海尔产品：");
        haierAirConditioner.cryogen();
        haierRefrigerator.preserveFood();

    }
}
