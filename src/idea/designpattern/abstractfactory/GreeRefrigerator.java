package idea.designpattern.abstractfactory;

/**
 * GreeRefrigerator
 *
 * @Author:20644
 * @Date:2019/03/18
 */
public class GreeRefrigerator implements IRefrigerator {

    @Override
    public void preserveFood() {
        System.out.println("格力冰箱保存食品！");
    }
}
