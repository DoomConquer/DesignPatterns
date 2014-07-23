/**
 * @(#)Decorator.java
 *
 * @author Black
 *
 * @version 1.00 2014/7/17
 */

public class DecoratorTest {

    public static void main(String[] args) {
    	Component cDecorator=new ConcreteDecorator(new ConcreteComponent());
    	//µü´ú×°ÊÎ
    	Component decorator=new ConcreteDecorator(new ConcreteDecorator(new ConcreteComponent()));
    	cDecorator.operation();
    	decorator.operation();
    }
}