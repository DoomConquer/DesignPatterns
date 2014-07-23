import java.util.List;
import java.util.ArrayList;
public class SubjectStructure {
	private List<Element> list;
	public SubjectStructure(){
		list=new ArrayList<Element>();
	}
	public void addElement(Element element){
		list.add(element);
	}
	public void action(Visitor visitor){
		for(Element element : list){
			element.accept(visitor);
		}
	}
}