/**
 * @(#)FactoryMethod.java
 *
 * @author Black
 *
 * @version 1.00 2014/7/17
 */

public class FactoryMethod {

    public static void main(String[] args) {
    	Provider mailSenderFactory=new MailSenderFactory();
		Sender mailSender=mailSenderFactory.produce();
		mailSender.send();

		Provider shortMessageSenderFactory=new ShortMessageSenderFactory();
		Sender shortMesageSender=shortMessageSenderFactory.produce();
		shortMesageSender.send();
    }
}