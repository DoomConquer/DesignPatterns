public class ShortMessageSenderFactory implements Provider{
	@Override
	public Sender produce(){
		return new ShortMessageSender();
	}
}