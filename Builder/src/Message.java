public interface Message {
	public void setMessage(String message);
	public String getMessage();
	public void writeSubject();
	public void writeBody();
	public void writeSendDate();
	public void sendMessage();
}