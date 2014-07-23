public class ConcreteColleagueC extends Colleague{
	public ConcreteColleagueC(float price){
		super(price);
	}
	public void changePrice(float price,Mediator mediator){
		mediator.CtoAB(price);
	}
}