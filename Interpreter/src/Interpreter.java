/**
 * @(#)Interpreter.java
 *
 * @author Black
 *
 * @version 1.00 2014/7/23
 */

public class Interpreter {

    public static void main(String[] args) {
    	Context context=new Context();

    	Constant c=new Constant(true);
    	Variable x=new Variable("x");
    	Variable y=new Variable("y");

    	context.assign(x,true);
    	context.assign(y,false);
    	System.out.println(x.toString()+"= "+x.interpret(context));
    	System.out.println(y.toString()+"= "+y.interpret(context));

    	Expression expression=new And(new Or(x,new Not(y)),c);
    	System.out.println(expression.toString());
    	System.out.println("Answer: "+expression.interpret(context));
    }
}