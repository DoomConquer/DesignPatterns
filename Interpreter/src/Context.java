import java.util.Map;
import java.util.HashMap;
public class Context {

	private Map<Variable,Boolean> map;
	public Context(){
		map=new HashMap<Variable,Boolean>();
	}
	public void assign(Variable variable,boolean bool){
		map.put(variable,bool);
	}
	public boolean getValue(Variable variable){
		return map.get(variable);
	}
}