package idea.designpattern.ifelse;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * ArticleHandler
 *
 * @Author:20644
 * @Date:2019/03/22
 */
public class ArticleHandler {

    private Article article;

    ArticleHandler(Article article) {
        this.article = article;
    }

    public void comment(String str, Boolean value) {
        article.setComment(value);
        System.out.println(str);
    }

    public void recommended(String str, Boolean value) {
        article.setRecommended(value);
        System.out.println(str);
    }

    public void top(String str, Boolean value) {
        article.setTop(value);
        System.out.println(str);
    }

    public void setType(String type, Boolean value) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        try {
            Method method = this.getClass().getMethod(type, String.class, Boolean.class);
            method.invoke(this, type, value);
        } catch (NoSuchMethodException e) {
            System.out.println(type + "方法不存在");
        }
    }
}
