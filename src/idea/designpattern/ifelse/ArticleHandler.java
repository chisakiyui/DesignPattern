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

    private Handler handler;

    ArticleHandler(Article article) {
        this.article = article;
        this.handler = new Handler();
    }

    /**
     * 使用内部类进行隐藏，不让外部直接访问到这些方法，只能通过反射来访问
     */
    private class Handler {
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
    }


    public void setType(String type, Boolean value) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        try {
            Method method = this.handler.getClass().getMethod(type, String.class, Boolean.class);
            method.invoke(this.handler, type, value);
        } catch (NoSuchMethodException e) {
            System.out.println(type + "方法不存在");
        }
    }
}
