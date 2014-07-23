import java.util.Map;
import java.util.HashMap;
public class Caretaker {
	private Map<String,Memento> mementoMap;
	public Caretaker(){
		mementoMap=new HashMap<String,Memento>();
	}

	public void setMemento(String s,Memento memento){
		mementoMap.put(s,memento);
	}

	public Memento getMemento(String s){
		return mementoMap.get(s);
	}
}