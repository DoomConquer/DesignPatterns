/**
 * @(#)Memento.java
 *
 * @author Black
 *
 * @version 1.00 2014/7/22
 */

public class MementoTest {

    public static void main(String[] args) {
    	Originator originator=new Originator();
    	originator.setName("Memento");
    	originator.setAge(25);
    	originator.setIsMember(true);

    	Memento memento=originator.createMemento();
    	Caretaker caretaker=new Caretaker();
    	caretaker.setMemento("2014-07-22:11:32",memento);
    	System.out.println(originator.toString());

    	originator.setName("Caretaker");
    	originator.setAge(26);
    	originator.setIsMember(false);
    	System.out.println(originator.toString());

    	originator.restoreMemento(caretaker.getMemento("2014-07-22:11:32"));
    	System.out.println(originator.toString());
    }
}