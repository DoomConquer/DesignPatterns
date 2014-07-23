public abstract class Element {

	private String name;
	public Element(String name){
		this.name=name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return (this.name);
	}
	public abstract void accept(Visitor visitor);
}