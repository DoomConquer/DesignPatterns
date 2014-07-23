public class CommonMessage extends AbstractMessage{
	public CommonMessage(MessageImplementer message){
		super(message);
	}
	@Override
	public void sendMessage(){
		System.out.print("Common ");
		message.send();
	}
}