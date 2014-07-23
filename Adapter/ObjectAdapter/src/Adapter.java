public class Adapter implements Target {

	private Source source;
	public Adapter(Source source){
		super();
		this.source=source;
	}
	@Override
	public void methodA(){
		source.methodA();
	}
	@Override
	public void methodB() {
		System.out.println("method B.");
	}
}