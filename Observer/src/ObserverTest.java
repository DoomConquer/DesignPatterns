/**
 * @(#)Observer.java
 *
 * @author Black
 *
 * @version 1.00 2014/7/20
 */

public class ObserverTest {

    public static void main(String[] args) {
    	Observer concreteObserverA=new ConcreteObserverA();
    	Observer concreteObserverB=new ConcreteObserverB();

    	Subject concreteSubject=new ConcreteSubject();
    	concreteSubject.register(concreteObserverA);
    	concreteSubject.register(concreteObserverB);
    	concreteSubject.notifyObservers();
    }
}