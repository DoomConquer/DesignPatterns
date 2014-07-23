public class SenderFactory {

	public static Sender produceMailSender(){
		return new MailSender();
	}

	public static Sender produceShortMessageSender(){
		return new ShortMessageSender();
	}
}