public class ConcreteFlyweight implements Flyweight {

	private String name;
	public ConcreteFlyweight(String name){
		this.name=name;
	}
	public void operation() {
		System.out.println("Concrete flyweight: "+name);
	}
}