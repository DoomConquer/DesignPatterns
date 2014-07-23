/**
 * @(#)Composite.java
 *
 * @author Black
 *
 * @version 1.00 2014/7/19
 */

public class CompositeTest {

    public static void main(String[] args) {
    	Component root=new Composite("C:");

    	Component programfiles=new Leaf("Program Files");
    	Component users=new Composite("Users");
    	root.add(programfiles);
    	root.add(users);

    	Component black=new Leaf("Black");
    	Component Public=new Leaf("Public");
    	users.add(black);
    	users.add(Public);

    	root.display(0);
    }
}