import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
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
	public Flyweight getFlyweight(String state,List<String>list){
		CompositeFlyweight compositeFlyweight=new CompositeFlyweight(state);
		for(String s : list)
			compositeFlyweight.add(s,this.getFlyweight(s));
		return compositeFlyweight;
	}
	public int getFlyweightFactorySize(){
		return flyweights.size();
	}
}