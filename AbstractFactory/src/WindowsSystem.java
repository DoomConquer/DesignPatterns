public class WindowsSystem {
	private Button button;
	private Text text;
	public WindowsSystem(AbstractFactory factory){
		button=factory.createButton();
		text=factory.createText();
	}

	public void buttonClick(){
		button.click();
	}
	public void textInput(String s){
		text.input(s);
	}
}