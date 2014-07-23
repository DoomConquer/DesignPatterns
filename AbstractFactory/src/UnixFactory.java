public class UnixFactory implements AbstractFactory {

	public Button createButton() {
		return new UnixButton();
	}

	public Text createText() {
		return new UnixText();
	}
}