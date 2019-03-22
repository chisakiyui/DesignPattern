package idea.designpattern.ifelse;

import java.lang.reflect.InvocationTargetException;

/**
 * Main
 *
 * 避免使用if-else
 *
 * @Author:20644
 * @Date:2019/03/22
 */
public class Main {

    public static void main(String[] args) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        String input = "top1";
        Boolean value = Boolean.valueOf(true);
        Article article = new Article();

        /**
         * 一般if-else做法
         */
        if ("comment".equals(input)) {
            article.setComment(true);
        } else if ("recommended".equals(input)) {
            article.setRecommended(true);
        } else if ("top".equals(input)) {
            article.setTop(true);
        }

        /**
         * 重构：利用反射
         */
        ArticleHandler articleHandler = new ArticleHandler(article);
        articleHandler.setType(input,value);
    }
}
