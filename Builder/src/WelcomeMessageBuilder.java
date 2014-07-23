public class WelcomeMessageBuilder implements Builder {

	private Message message;
	public WelcomeMessageBuilder(){
		message=new WelcomeMessage();
	}

	public void builderSubject() {
		message.writeSubject();
	}

	public void buildBody() {
		message.writeBody();
	}

	public void buildSendDate() {
		message.writeSendDate();
	}

	public Message getMessage(){
		message.setMessage("Welcome!");
		return message;
	}
}