/**
 * @(#)TemplateMethod.java
 *
 * @author Black
 *
 * @version 1.00 2014/7/20
 */

public class TemplateMethodTest {

    public static void main(String[] args) {
    	TemplateMethod concreteTemplateMethodA=new ConcreteTemplateMethodA();
    	concreteTemplateMethodA.method();

    	TemplateMethod concreteTemplateMethodB=new ConcreteTemplateMethodB();
    	concreteTemplateMethodB.method();
    }
}