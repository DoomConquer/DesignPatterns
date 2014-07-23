/**
 * @(#)ChainOfResposibility.java
 *
 * @author Black
 *
 * @version 1.00 2014/7/21
 */

public class ChainOfResposibility {

    public static void main(String[] args) {
    	Handler handlerA=new ConcreteHandlerA();
    	Handler handlerB=new ConcreteHandlerB();
    	Handler handlerC=new ConcreteHandlerC();

    	handlerA.setSuccessor(handlerB);
    	handlerB.setSuccessor(handlerC);
    	handlerA.handleRequest(0.3);
    	handlerA.handleRequest(0.5);
    	handlerA.handleRequest(1);
    }
}