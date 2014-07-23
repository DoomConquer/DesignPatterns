import java.util.Map;
public class Memento {
	private Map<String,Object> stateMap;

	public Memento(Map<String,Object> stateMap){
		this.stateMap=stateMap;
	}

	public Map<String,Object> getMap(){
		return this.stateMap;
	}

	public void setMap(Map<String,Object> stateMap){
		this.stateMap=stateMap;
	}
}