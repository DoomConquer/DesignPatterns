public class ConcreteColleagueA extends Colleague{
	public ConcreteColleagueA(float price){
		super(price);
	}
	public void changePrice(float price,Mediator mediator){
		mediator.AtoBC(price);
	}
}