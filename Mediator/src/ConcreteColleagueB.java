public class ConcreteColleagueB extends Colleague{
	public ConcreteColleagueB(float price){
		super(price);
	}
	public void changePrice(float price,Mediator mediator){
		mediator.BtoAC(price);
	}
}