/**
 * @(#)ExtrinsicIterator.java
 *
 * @author Black
 *
 * @version 1.00 2014/7/21
 */

public class ExtrinsicIterator {

    public static void main(String[] args) {
    	String[] s={"Iterator","is","a","good","design","pattern","."};
		ConcreteAggregate concreteAggregate=new ConcreteAggregate(s);
		Iterator iterator=concreteAggregate.createIterator();
		while(!iterator.isLast()){
			System.out.println(iterator.currentElement());
			iterator.next();
		}
    }
}