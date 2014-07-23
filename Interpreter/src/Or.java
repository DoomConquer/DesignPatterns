public class Or implements Expression {

	private Expression leftExpression,rightExpression;
	public Or(Expression leftExpression,Expression rightExpression){
		this.leftExpression=leftExpression;
		this.rightExpression=rightExpression;
	}

	public boolean equals(Object obj) {
		if(obj!=null&&obj instanceof Or)
			return (leftExpression.equals(((Or)obj).leftExpression))&&(rightExpression.equals(((Or)obj).rightExpression));
		return false;
	}

	public int hashCode() {
		return this.toString().hashCode();
	}

	public String toString() {
		return "( "+leftExpression.toString()+" OR "+rightExpression.toString()+" )";
	}

	public boolean interpret(Context context) {
		return leftExpression.interpret(context) || rightExpression.interpret(context);
	}
}