public abstract class Colleague {
	private float price;
	public Colleague(float price){
		this.price=price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getPrice() {
		return (this.price);
	}
	public abstract void changePrice(float price,Mediator mediator);
}