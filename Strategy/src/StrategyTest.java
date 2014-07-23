/**
 * @(#)Strategy.java
 *
 * @author Black
 *
 * @version 1.00 2014/7/20
 */

public class StrategyTest {

    public static void main(String[] args) {
    	Context contextA=new Context(new StrategyA());
    	contextA.contextMethod();

    	Context contextB=new Context(new StrategyB());
    	contextB.contextMethod();
    }
}