/**
 * @(#)Visitor.java
 *
 * @author Black
 *
 * @version 1.00 2014/7/22
 */

public class VisitorTest {

    public static void main(String[] args) {
    	Visitor concreteVisitorA=new ConcreteVisitorA();
    	Visitor concreteVisitorB=new ConcreteVisitorB();

    	Element concreteElementA=new ConcreteElementA("Concrete Element A.");
    	Element concreteElementB=new ConcreteElementB("Concrete Element B.");

    	SubjectStructure subjectStructure=new SubjectStructure();
    	subjectStructure.addElement(concreteElementA);
    	subjectStructure.addElement(concreteElementB);

    	subjectStructure.action(concreteVisitorA);
    	subjectStructure.action(concreteVisitorB);
    }
}