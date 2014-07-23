/**
 * @(#)SimpleFlyweight.java
 *
 * @author Black
 *
 * @version 1.00 2014/7/19
 */

public class SimpleFlyweight {

    public static void main(String[] args) {
    	Flyweight concreteFlyweightA=FlyweightFactory.getInstacnce().getFlyweight("A");
    	concreteFlyweightA.operation();

    	Flyweight concreteFlyweightB=FlyweightFactory.getInstacnce().getFlyweight("B");
    	concreteFlyweightB.operation();

    	Flyweight concreteFlyweightBb=FlyweightFactory.getInstacnce().getFlyweight("B");
    	concreteFlyweightBb.operation();

    	System.out.println("Totally "+FlyweightFactory.getInstacnce().getFlyweightFactorySize()+" ConcreteFlyweights");
    }
}