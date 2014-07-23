import java.util.ArrayList;
import java.util.List;
public class Composite implements Component {

	private List<Component> list;
	private String name;
	public Composite(String name){
		list=new ArrayList<Component>();
		this.name=name;
	}

	@Override
	public void add(Component component) {
		list.add(component);
	}

	@Override
	public void remove(Component component) {
		list.remove(component);
	}

	@Override
	public void display(int depth) {
		for(int i=0;i<depth;i++)
			System.out.print("++");
		System.out.println(name);
		for(Component component : list){
			component.display(depth+2);
		}
	}
}