package idea.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Rate
 * 抽象被观察者：汇率
 * @Author:20644
 * @Date:2019/03/15
 */
public abstract class Rate {
    protected List<Company> companys = new ArrayList<>();

    /**
     * 添加观察者
     * @param company
     */
    public void add(Company company) {
        companys.add(company);
    }

    /**
     * 删除观察者
     * @param company
     */
    public void remove(Company company) {
        companys.remove(company);
    }

    /**
     * 观察的方法
     * @param number
     */
    public abstract void change(int number);
}
