public class SenderFactory {

	public Sender produceMailSender(){
		return new MailSender();
	}

	public Sender produceShortMessageSender(){
		return new ShortMessageSender();
	}
}