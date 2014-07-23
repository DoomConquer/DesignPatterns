/**
 * @(#)CommonFactory.java
 *
 * @author Black
 *
 * @version 1.00 2014/7/16
 */

public class CommonFactory {
    public static void main(String[] args) {
		SenderFactory senderFactory=new SenderFactory();
		Sender mailSender=senderFactory.produce("Mail");
		Sender ShortMessageSender=senderFactory.produce("ShortMessage");
		mailSender.send();
		ShortMessageSender.send();
    }
}