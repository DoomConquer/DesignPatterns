/**
 * @(#)Prototype.java
 *
 * @author Black
 *
 * @version 1.00 2014/7/17
 */

public class PrototypeTest {

    public static void main(String[] args) {
    	Prototype prototype=new Prototype();
    	Prototype copy1=prototype.clone();
    	copy1.addList(1);
    	copy1.showList();
    	copy1.doSomething();

    	Prototype copy2=prototype.clone();
    	copy2.addList(2);
    	copy2.showList();
    	copy2.doSomething();
    }
}