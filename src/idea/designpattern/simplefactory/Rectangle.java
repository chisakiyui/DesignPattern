package idea.designpattern.simplefactory;

public class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("长方形");
    }

}