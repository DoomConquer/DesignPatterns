/**
 * @(#)Builder.java
 *
 * @author Black
 *
 * @version 1.00 2014/7/16
 */

public class BuilderTest {

    public static void main(String[] args) {
    	Director wDirector=new Director(new WelcomeMessageBuilder());
    	Message welcomeMessage=wDirector.construct();
    	welcomeMessage.sendMessage();

    	Director gDirector=new Director(new GoodbyeMessageBuilder());
    	Message goodbyeMessage=gDirector.construct();
    	goodbyeMessage.sendMessage();
    }
}