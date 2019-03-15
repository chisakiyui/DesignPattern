package idea.designpattern.observer;

/**
 * Alibaba
 *
 * 具体观察者
 * @Author:20644
 * @Date:2019/03/15
 */
public class Alibaba implements Company{

    @Override
    public void response(int number) {
        if(number > 0) {
            System.out.println("阿里巴巴收到消息：人民币汇率上升");
        }else{
            System.out.println("阿里巴巴收到消息：人民币汇率下降");
        }
    }
}
