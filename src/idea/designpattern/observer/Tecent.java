package idea.designpattern.observer;

/**
 * Tecent
 *
 * 具体观察者
 * @Author:20644
 * @Date:2019/03/15
 */
public class Tecent implements Company{

    @Override
    public void response(int number) {
        if(number > 0) {
            System.out.println("腾讯收到消息：人民币汇率上升");
        }else{
            System.out.println("腾讯收到消息：人民币汇率下降");
        }
    }
}
