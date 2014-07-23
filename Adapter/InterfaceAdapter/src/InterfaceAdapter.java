/**
 * @(#)InterfaceAdapter.java
 *
 * @author Black
 *
 * @version 1.00 2014/7/17
 */

public class InterfaceAdapter {

    public static void main(String[] args) {
    	SourceSub1 s1=new SourceSub1();
    	s1.methodA();
    	SourceSub2 s2=new SourceSub2();
    	s2.methodB();
    }
}