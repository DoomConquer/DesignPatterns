/**
 * @(#)ObjectAdapter.java
 *
 * @author Black
 *
 * @version 1.00 2014/7/17
 */

public class ObjectAdapter {

    public static void main(String[] args) {
    	Adapter adapter=new Adapter(new Source());
    	adapter.methodA();
    	adapter.methodB();
    }
}
