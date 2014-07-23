public class And implements Expression {

	private Expression leftExpression,rightExpression;
	public And(Expression leftExpression,Expression rightExpression){
		this.leftExpression=leftExpression;
		this.rightExpression=rightExpression;
	}

	public boolean equals(Object obj) {
		if(obj!=null&&obj instanceof And)
			return (leftExpression.equals(((And)obj).leftExpression))&&(rightExpression.equals(((And)obj).rightExpression));
		return false;
	}

	public int hashCode() {
		return this.toString().hashCode();
	}

	public String toString() {
		return "( "+leftExpression.toString()+" AND "+rightExpression.toString()+" )";
	}

	public boolean interpret(Context context) {
		return leftExpression.interpret(context) && rightExpression.interpret(context);
	}
}