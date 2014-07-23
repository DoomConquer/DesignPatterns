public class ConcreteElementA extends Element {

	public ConcreteElementA(String name){
		super(name);
	}
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}