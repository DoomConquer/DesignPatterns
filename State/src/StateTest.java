/**
 * @(#)State.java
 *
 * @author Black
 *
 * @version 1.00 2014/7/22
 */

public class StateTest {

    public static void main(String[] args) {
    	State stateA=new ConcreteStateA();
    	State stateB=new ConcreteStateB();
    	State stateC=new ConcreteStateC();

    	Context context=new Context(stateA);
    	context.request();
    	context.setState(stateB);
    	context.request();
    	context.setState(stateC);
    	context.request();
    }
}