public class GoodbyeMessage implements Message{
	private String message;

	public String getMessage(){
		return message;
	}

	public void setMessage(String message){
		this.message=message;
	}

	public void writeSubject() {
		System.out.println("Write the Goodbye Subject part.");
	}

	public void writeBody() {
		System.out.println("Write the Goodbye Body part.");
	}

	public void writeSendDate() {
		System.out.println("Write the Goodbye SendDate part.");
	}

	public void sendMessage() {
		System.out.println("Send goodbye message: "+message+".....");
	}
}