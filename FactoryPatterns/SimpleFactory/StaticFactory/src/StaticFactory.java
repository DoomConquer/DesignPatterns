/**
 * @(#)StaticFactory.java
 *
 * @author Black
 *
 * @version 1.00 2014/7/16
 */

public class StaticFactory {

    public static void main(String[] args) {
    	Sender mailSender=SenderFactory.produceMailSender();
    	Sender shortMessageSender=SenderFactory.produceShortMessageSender();
    	mailSender.send();
    	shortMessageSender.send();
    }
}