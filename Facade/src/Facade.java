public class Facade {
	private Light[] light=new Light[4];
	private Fan fan;
	private AirConditioner ac;
	private Television tv;
	public Facade(){
		for(int i=0;i<light.length;i++)
			light[i]=new Light();
		fan=new Fan();
		ac=new AirConditioner();
		tv=new Television();
	}
	public void on(){
		for(int i=0;i<light.length;i++)
			light[i].on();
		fan.on();
		ac.on();
		tv.on();
	}
	public void off(){
		for(int i=0;i<light.length;i++)
			light[i].off();
		fan.off();
		ac.off();
		tv.off();
	}
}