public class GoodbyeMessageBuilder implements Builder {

	private Message message;
	public GoodbyeMessageBuilder(){
		message=new GoodbyeMessage();
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
		message.setMessage("Goodbye!");
		return message;
	}
}