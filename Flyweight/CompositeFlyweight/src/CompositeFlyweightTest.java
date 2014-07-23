/**
 * @(#)CompositeFlyweight.java
 *
 * @author Black
 *
 * @version 1.00 2014/7/19
 */
import java.util.List;
import java.util.ArrayList;
public class CompositeFlyweightTest {

    public static void main(String[] args) {
    	Flyweight concreteFlyweightA=FlyweightFactory.getInstacnce().getFlyweight("A");
    	concreteFlyweightA.operation();

    	Flyweight concreteFlyweightB=FlyweightFactory.getInstacnce().getFlyweight("B");
    	concreteFlyweightB.operation();

    	List<String> list=new ArrayList<String>();
    	list.add("A");
    	list.add("B");
    	list.add("C");
    	list.add("B");
    	Flyweight copositeFlyweight=FlyweightFactory.getInstacnce().getFlyweight("Alphabet",list);
    	copositeFlyweight.operation();

    	System.out.println("Totally "+FlyweightFactory.getInstacnce().getFlyweightFactorySize()+" Flyweights");
    }
}