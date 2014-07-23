public class Proxy implements Sourceable {

	private Sourceable source;
	public Proxy(){
		super();
		source=new Source();
	}
	@Override
	public void method() {
		before();
		source.method();
		after();
	}
	private void before(){
		System.out.println("Before method.");
	}
	private void after(){
		System.out.println("After method.");
	}
}