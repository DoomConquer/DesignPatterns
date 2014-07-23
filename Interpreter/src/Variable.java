public class Variable implements Expression {

	private String variable;
	public Variable(String variable){
		this.variable=variable;
	}

	public boolean equals(Object obj) {
		if(obj!=null&&obj instanceof Variable)
			return variable.equals(((Variable)obj).variable);
		return false;
	}

	public int hashCode() {
		return this.toString().hashCode();
	}

	public String toString() {
		return variable;
	}

	public boolean interpret(Context context) {
		return context.getValue(this);
	}
}