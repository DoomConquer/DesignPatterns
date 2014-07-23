public class ConcreteVisitorB implements Visitor{

	public void visit(ConcreteElementA elementA){
		System.out.println("Concrete Visitor B visit "+elementA.getName());
	}
	public void visit(ConcreteElementB elementB){
		System.out.println("Concrete Visitor B visit "+elementB.getName());
	}
}