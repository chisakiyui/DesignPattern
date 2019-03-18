package idea.designpattern.abstractfactory;

/**
 * GreeAirConditioner
 *
 * @Author:20644
 * @Date:2019/03/18
 */
public class GreeAirConditioner implements IAirconditioner {
    @Override
    public void cryogen() {
        System.out.println("格力空调制冷！");
    }
}
