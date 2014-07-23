public class ConcreteAggregate implements Aggregate {

	private Object[] objArray=null;
	public ConcreteAggregate(Object[] obj){
		objArray=new Object[obj.length];
		for(int i=0;i<obj.length;i++)
			objArray[i]=obj[i];
	}
	public Iterator createIterator() {
		return new ConcreteIterator(this);
	}
	public Object getElement(int index){
		return objArray[index];
	}
	public int size(){
		return objArray.length;
	}
}