public class ConcreteVisitorA implements Visitor{

	public void visit(ConcreteElementA elementA){
		System.out.println("Concrete Visitor A visit "+elementA.getName());
	}
	public void visit(ConcreteElementB elementB){
		System.out.println("Concrete Visitor A visit "+elementB.getName());
	}
}