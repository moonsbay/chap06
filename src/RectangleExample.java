import com.example.AlphaExample;

import util.Alpha;
import util.VT100;
import util.Color;

public class RectangleExample {

	public static void main(String[] args) throws InterruptedException {
		
		VT100.clearScreen();
		for(int i=0; i<1000; i++){
		
			Alpha a = new Alpha();
			a.show();
			VT100.reset();
			VT100.cursorMove(1,  42);
			System.out.printf("count = [%05d]", i);
			
			Thread.sleep(10);
		}
		
		VT100.reset();
	}
		

}
