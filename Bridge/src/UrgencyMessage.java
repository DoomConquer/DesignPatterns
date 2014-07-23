public class UrgencyMessage extends AbstractMessage{
	public UrgencyMessage(MessageImplementer message){
		super(message);
	}
	@Override
	public void sendMessage(){
		System.out.print("Urgency ");
		message.send();
	}
}