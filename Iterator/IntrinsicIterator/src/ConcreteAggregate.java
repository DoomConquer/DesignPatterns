public class ConcreteAggregate implements Aggregate {

	private Object[] objArray=null;
	public ConcreteAggregate(Object[] obj){
		objArray=new Object[obj.length];
		for(int i=0;i<obj.length;i++)
			objArray[i]=obj[i];
	}
	public Iterator createIterator() {
		return new ConcreteIterator();
	}

	public int size(){
		return objArray.length;
	}

	private class ConcreteIterator implements Iterator{
		private int index;
		private int size;
		public ConcreteIterator(){
			index=0;
			size=objArray.length;
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
		return index<size?objArray[index]:null;
	}
	}
}