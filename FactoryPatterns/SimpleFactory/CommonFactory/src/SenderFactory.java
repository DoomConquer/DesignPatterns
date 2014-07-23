public class SenderFactory {

	public Sender produce(String type){
		if("Mail".equals(type)){
			return new MailSender();
		}
		else if("ShortMessage".equals(type)){
			return new ShortMessageSender();
		}
		else{
			System.out.println("Can not find the sender type "+type);
			return null;
		}
	}
}