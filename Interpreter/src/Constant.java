public class Constant implements Expression {

	private boolean value;
	public Constant(boolean value){
		this.value=value;
	}

	public boolean equals(Object obj) {
		if(obj!=null&&obj instanceof Constant)
			return value==((Constant)obj).value;
		return false;
	}

	public int hashCode() {
		return this.toString().hashCode();
	}

	public String toString() {
		return value?"true":"false";
	}

	public boolean interpret(Context context){
		return value;
	}
}