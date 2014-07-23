/**
 * @(#)Bridge.java
 *
 * @author Black
 *
 * @version 1.00 2014/7/18
 */

public class Bridge {

    public static void main(String[] args) {
    	MessageImplementer messageSMS=new MessageSMS();
    	MessageImplementer messageEmail=new MessageEmail();
    	AbstractMessage commonMessageSMS=new CommonMessage(messageSMS);
    	commonMessageSMS.sendMessage();

    	AbstractMessage commonMessageEmail=new CommonMessage(messageEmail);
    	commonMessageEmail.sendMessage();

    	AbstractMessage urgencyMessageSMS=new UrgencyMessage(messageSMS);
    	urgencyMessageSMS.sendMessage();

    	AbstractMessage urgencyMessageEmail=new UrgencyMessage(messageEmail);
    	urgencyMessageEmail.sendMessage();
    }
}