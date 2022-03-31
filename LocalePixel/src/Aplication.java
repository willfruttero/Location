
import java.awt.AWTException;
import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.Robot;

public class Aplication {

	public void start() throws AWTException {
		int x, y;
		Robot rb = new Robot();
		while (true) {
			x = MouseInfo.getPointerInfo().getLocation().x;
			y = MouseInfo.getPointerInfo().getLocation().y;
			
		Color p = rb.getPixelColor(x, y);
			System.out.print(" X : " + x + " Y : " + y + "    \r");
			System.out.print(p);
		}
	}

	public static void main(String[] args) throws AWTException {
		new Aplication().start();
	}
}
