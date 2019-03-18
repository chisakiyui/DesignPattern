package idea.designpattern.abstractfactory;

/**
 * HaierRefrigerator
 *
 * @Author:20644
 * @Date:2019/03/18
 */
public class HaierRefrigerator implements IRefrigerator {

    @Override
    public void preserveFood() {
        System.out.println("海尔冰箱保存食品！");
    }
}
