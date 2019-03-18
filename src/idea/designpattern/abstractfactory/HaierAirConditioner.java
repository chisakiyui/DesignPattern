package idea.designpattern.abstractfactory;

/**
 * HaierAirConditioner
 *
 * @Author:20644
 * @Date:2019/03/18
 */
public class HaierAirConditioner implements IAirconditioner {

    @Override
    public void cryogen() {
        System.out.println("海尔空调制冷！");
    }

}
