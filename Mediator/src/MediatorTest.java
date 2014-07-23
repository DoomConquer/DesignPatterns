/**
 * @(#)Mediator.java
 *
 * @author Black
 *
 * @version 1.00 2014/7/22
 */

public class MediatorTest {

    public static void main(String[] args) {
    	ConcreteColleagueA colleagueA=new ConcreteColleagueA(100);
    	ConcreteColleagueB colleagueB=new ConcreteColleagueB(100);
    	ConcreteColleagueC colleagueC=new ConcreteColleagueC(100);

    	ConcreteMediator mediator=new ConcreteMediator(colleagueA,colleagueB,colleagueC);

    	colleagueA.changePrice(200,mediator);
    	mediator.printPrice();

    	colleagueB.changePrice(1000,mediator);
    	mediator.printPrice();

    	colleagueC.changePrice(2000,mediator);
    	mediator.printPrice();
    }
}