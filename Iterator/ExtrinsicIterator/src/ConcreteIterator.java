public class ConcreteIterator implements Iterator {

	private ConcreteAggregate aggregate;
	private int index;
	private int size;
	public ConcreteIterator(ConcreteAggregate aggregate){
		this.aggregate=aggregate;
		size=aggregate.size();
		index=0;
	}
	public void first() {
		index=0;
	}

	public void next() {
		if(index<size)
			index++;
	}

	public boolean isLast() {
		return index>=size;
	}

	public Object currentElement() {
		return index<size?aggregate.getElement(index):null;
	}
}