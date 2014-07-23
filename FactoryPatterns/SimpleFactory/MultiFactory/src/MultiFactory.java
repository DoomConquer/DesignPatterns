/**
 * @(#)MultiFactory.java
 *
 * @author Black
 *
 * @version 1.00 2014/7/16
 */

public class MultiFactory {

    public static void main(String[] args) {
    	SenderFactory senderFactory=new SenderFactory();
    	Sender mailSender=senderFactory.produceMailSender();
    	Sender shortMessageSender=senderFactory.produceShortMessageSender();
    	mailSender.send();
    	shortMessageSender.send();
    }
}