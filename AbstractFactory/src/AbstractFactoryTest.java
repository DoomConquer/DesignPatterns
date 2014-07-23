/**
 * @(#)AbstractFactory.java
 *
 * @author Black
 *
 * @version 1.00 2014/7/17
 */

public class AbstractFactoryTest {

    public static void main(String[] args) {

		WindowsSystem win=new WindowsSystem(new WindowsFactory());
		win.buttonClick();
		win.textInput("Windows");

		UnixSystem unix=new UnixSystem(new UnixFactory());
		unix.buttonClick();
		unix.textInput("Unix");
    }
}