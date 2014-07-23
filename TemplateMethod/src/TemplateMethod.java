public abstract class TemplateMethod {
	public abstract void method1();
	public abstract void method3();
	public void method(){
		method1();
		method2();
		method3();
	}
	public void method2(){
		System.out.println("TemplateMethod method 2.");
	}
}