/**
 * @(#)Command.java
 *
 * @author Black
 *
 * @version 1.00 2014/7/21
 */

public class CommandTest {

    public static void main(String[] args) {
    	Invoker invoker=new Invoker();
    	Receiver receiver=new Receiver();
    	Command command=new ConcreteCommand(receiver);
    	invoker.setCommand(command);
    	invoker.action();
    }
}