public class WelcomeMessage implements Message{
	private String message;

	public String getMessage(){
		return message;
	}

	public void setMessage(String message){
		this.message=message;
	}

	public void writeSubject() {
		System.out.println("Write the Welcome Subject part.");
	}

	public void writeBody() {
		System.out.println("Write the Welcome Body part.");
	}

	public void writeSendDate() {
		System.out.println("Write the Welcome SendDate part.");
	}

	public void sendMessage() {
		System.out.println("Send welcome message: "+message+".....");
	}
}