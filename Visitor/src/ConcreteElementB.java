public class ConcreteElementB extends Element {

	public ConcreteElementB(String name){
		super(name);
	}
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}