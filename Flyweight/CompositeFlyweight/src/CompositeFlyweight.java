import java.util.HashMap;
public class CompositeFlyweight implements Flyweight {

	private String name;
	private HashMap<String,Flyweight> map;
	public CompositeFlyweight(String name){
		this.name=name;
		map=new HashMap<String,Flyweight>();
	}
	public void add(String state,Flyweight flyweight){
		map.put(state,flyweight);
	}
	public void operation() {
		System.out.println("Composite flyweight: "+name);
		Flyweight flyweight;
		for(Object state : map.keySet()){
			flyweight=map.get(state);
			flyweight.operation();
		}
	}
}