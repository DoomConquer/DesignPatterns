import java.util.HashMap;
public class FlyweightFactory {
	private static HashMap<String,Flyweight> flyweights=null;
	private static FlyweightFactory factory=null;
	private static synchronized void syncInit(){
		if(factory==null){
			factory=new FlyweightFactory();
			flyweights=new HashMap<String,Flyweight>();
		}
	}
	public static FlyweightFactory getInstacnce(){
		if(factory==null)
			syncInit();
		return factory;
	}
	public Flyweight getFlyweight(String state){
		Flyweight flyweight=flyweights.get(state);
		if(flyweight==null){
			flyweight=new ConcreteFlyweight(state);
			flyweights.put(state,flyweight);
		}
		return flyweight;
	}
	public int getFlyweightFactorySize(){
		return flyweights.size();
	}
}