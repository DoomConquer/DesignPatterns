public abstract class AbstractMessage {
	protected MessageImplementer message;
	public AbstractMessage(MessageImplementer message){
		this.message=message;
	}
	public abstract void sendMessage();
}