public class Not implements Expression {

	private Expression expression;
	public Not(Expression expression){
		this.expression=expression;
	}

	public boolean equals(Object obj) {
		if(obj!=null&&obj instanceof Not)
			return expression.equals(((Not)obj).expression);
		return false;
	}

	public int hashCode() {
		return this.toString().hashCode();
	}

	public String toString() {
		return "( NOT "+expression.toString()+" )";
	}

	public boolean interpret(Context context) {
		return !expression.interpret(context);
	}
}