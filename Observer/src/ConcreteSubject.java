import java.util.List;
import java.util.ArrayList;
public class ConcreteSubject implements Subject {

	private List<Observer> list;
	public ConcreteSubject(){
		list=new ArrayList<Observer>();
	}
	public void register(Observer observer) {
		list.add(observer);
	}

	public void unRegister(Observer observer) {
		list.remove(observer);
	}

	public void notifyObservers() {
		System.out.println("Concrete subject notify observers.");
		for(Observer observer : list)
			observer.update();
	}
}