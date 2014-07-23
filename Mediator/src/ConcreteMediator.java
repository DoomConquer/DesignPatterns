public class ConcreteMediator implements Mediator {

	private ConcreteColleagueA colleagueA;
	private ConcreteColleagueB colleagueB;
	private ConcreteColleagueC colleagueC;
	public ConcreteMediator(ConcreteColleagueA colleagueA,ConcreteColleagueB colleagueB,ConcreteColleagueC colleagueC){
		this.colleagueA=colleagueA;
		this.colleagueB=colleagueB;
		this.colleagueC=colleagueC;
	}
	public void AtoBC(float price) {
		colleagueA.setPrice(price);
		colleagueB.setPrice(price*10);
		colleagueC.setPrice(price*100);
	}

	public void BtoAC(float price) {
		colleagueA.setPrice(price/10);
		colleagueB.setPrice(price);
		colleagueC.setPrice(price*10);
	}

	public void CtoAB(float price) {
		colleagueA.setPrice(price/100);
		colleagueB.setPrice(price/10);
		colleagueC.setPrice(price);
	}

	public void printPrice(){
		System.out.println("ColleagueA'price: "+colleagueA.getPrice());
		System.out.println("ColleagueB'price: "+colleagueB.getPrice());
		System.out.println("ColleagueC'price: "+colleagueC.getPrice());
		System.out.println();
	}
}